package Exercicio;

public class ProdutoNaoPerecivel extends Produto {
	private String material;
	
	public ProdutoNaoPerecivel(int codigo,String nome, double preco, int quantidadeEmEstoque, String material) {
		super(codigo,nome,preco,quantidadeEmEstoque);
		this.material = material;
	}
	public String getMaterial() {
		return material;
	}
	public String toString() {
		return super.toString()+", Material: "+material;
		
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	

}
