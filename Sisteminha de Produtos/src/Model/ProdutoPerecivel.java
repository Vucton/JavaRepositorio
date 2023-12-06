package Model;

public class ProdutoPerecivel extends Produto {
	private String dataVencimento;

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public ProdutoPerecivel(String nome, double preco, int quantidadeEmEstoque, String dataVencimento) {
		super(nome, preco, quantidadeEmEstoque);
		this.dataVencimento = dataVencimento;
	}

	public ProdutoPerecivel() {

	}

	public String getDataVencimento() {
		return dataVencimento;

	}

	public String toString() {
		return super.toString() + ", Vencimento: " + dataVencimento;
	}

}
