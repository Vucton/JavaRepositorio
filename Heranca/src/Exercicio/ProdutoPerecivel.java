package Exercicio;

public class ProdutoPerecivel extends Produto{
	private String dataVencimento;
	
	public ProdutoPerecivel(int codigo,String nome, double preco, int quantidadeEmEstoque, String dataVencimento) {
		super(codigo, nome, preco, quantidadeEmEstoque);
		this.dataVencimento=dataVencimento;
	}
	public String getDataVencimento() {
		return dataVencimento;
		
	}
	public String toString() {
		return super.toString()+", Vencimento: "+dataVencimento;
	}
	

}
