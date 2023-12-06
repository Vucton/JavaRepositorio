package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.ProdutoNaoPerecivel;

public class ProdutoNaoPerecivelDAO extends ProdutoNaoPerecivel {

	public void cadastrarProduto(ProdutoNaoPerecivel produtoNP) {
		String sql = "INSERT INTO produtonaoperecivel (nome, preco, quantidadeEmEstoque, material) VALUES(?, ?, ?, ?)";

		PreparedStatement ps = null;
		try {
			ps = ConexaoDAO.getConexao().prepareStatement(sql);
			ps.setString(1, produtoNP.getNome());
			ps.setDouble(2, produtoNP.getPreco());
			ps.setInt(3, produtoNP.getQuantidadeEmEstoque());
			ps.setString(4, produtoNP.getMaterial());

			ps.execute();
			ps.close();

		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("ProdutoPerecivelDAO: " + e);
		}
	}

	public ArrayList<ProdutoNaoPerecivelDAO> read() {
		String sql = "SELECT * FROM produtonaoperecivel";

		ArrayList<ProdutoNaoPerecivelDAO> produtos = new ArrayList<ProdutoNaoPerecivelDAO>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			conn = ConexaoDAO.getConexao();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				ProdutoNaoPerecivelDAO produtoNP = new ProdutoNaoPerecivelDAO();

				produtoNP.setCodigo(rs.getInt("codigo"));
				produtoNP.setNome(rs.getString("nome"));
				produtoNP.setPreco(rs.getDouble("preco"));
				produtoNP.setQuantidadeEmEstoque(rs.getInt("quantidadeEmEstoque"));
				produtoNP.setMaterial(rs.getString("material"));

				produtos.add(produtoNP);
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
	public void atualizarProdutoDAO(ProdutoNaoPerecivelDAO produtoNP) {
		String sql = "UPDATE produtonaoperecivel SET quantidadeEmEstoque= quantidadeEmEstoque + ?  WHERE codigo=?";

		PreparedStatement ps = null;
		try {
			ps = ConexaoDAO.getConexao().prepareStatement(sql);

			ps.setInt(1, produtoNP.getQuantidadeEmEstoque());
			ps.setDouble(2, produtoNP.getCodigo());

			ps.execute();
			ps.close();

		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("ProdutoPerecivelDAO-UPDATE: " + e);
		}
	}

}
