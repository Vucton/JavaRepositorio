package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.ProdutoPerecivel;

public class ProdutoPerecivelDAO extends ProdutoPerecivel {

	public ProdutoPerecivelDAO() {

	}

	// Inserir produtos
	public void cadastrarProduto(ProdutoPerecivel produtoP) {
		String sql = "INSERT INTO produtoperecivel (nome, preco, quantidadeEmEstoque, dataVencimento) VALUES(?, ?, ?, ?)";

		PreparedStatement ps = null;
		try {
			ps = ConexaoDAO.getConexao().prepareStatement(sql);
			ps.setString(1, produtoP.getNome());
			ps.setDouble(2, produtoP.getPreco());
			ps.setInt(3, produtoP.getQuantidadeEmEstoque());
			ps.setString(4, produtoP.getDataVencimento());

			ps.execute();
			ps.close();

		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("ProdutoPerecivelDAO: " + e);
		}
	}

	// Consultar Produtos
	public ArrayList<ProdutoPerecivelDAO> read() {
		String sql = "SELECT * FROM produtoperecivel";

		ArrayList<ProdutoPerecivelDAO> produtos = new ArrayList<ProdutoPerecivelDAO>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			conn = ConexaoDAO.getConexao();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				ProdutoPerecivelDAO produtoP = new ProdutoPerecivelDAO();

				produtoP.setCodigo(rs.getInt("codigo"));
				produtoP.setNome(rs.getString("nome"));
				produtoP.setPreco(rs.getDouble("preco"));
				produtoP.setQuantidadeEmEstoque(rs.getInt("quantidadeEmEstoque"));
				produtoP.setDataVencimento(rs.getString("dataVencimento"));

				produtos.add(produtoP);
			}
			pstm.execute();
			pstm.close();
			rs.close();

		} catch (SQLException e) {
			System.err.println("ProdutoNaoPerecivel: " + e);
		}

		return produtos;

	}

	// UPDATE --
	public void atualizarProdutoDAO(ProdutoPerecivelDAO produtoP) {
		String sql = "UPDATE produtoperecivel SET quantidadeEmEstoque= quantidadeEmEstoque + ?  WHERE codigo=?";

		PreparedStatement ps = null;
		try {
			ps = ConexaoDAO.getConexao().prepareStatement(sql);

			ps.setInt(1, produtoP.getQuantidadeEmEstoque());
			ps.setDouble(2, produtoP.getCodigo());

			ps.execute();
			ps.close();

		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("ProdutoPerecivelDAO-UPDATE: " + e);
		}
	}

}
