package Model;

public class ProdutoNaoPerecivel extends Produto {
	private String material;
	
	public ProdutoNaoPerecivel(String nome, double preco, int quantidadeEmEstoque, String material) {
		super(nome,preco,quantidadeEmEstoque);
		this.material = material;
	}
	public ProdutoNaoPerecivel() {
		
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String toString() {
		return super.toString()+", Material: "+material;
		
	}
	

}
