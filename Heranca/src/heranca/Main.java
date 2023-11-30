package heranca;

public class Main  {
	
	public static void main(String[] args) {
		Pessoa joao = new Pessoa("joao",22,"145.55");
		System.out.println(joao.getIdade()+" "+joao.getNome()+" "+joao.getCpf());
		
		joao.saudacao();
		
	}
}
class Pessoa extends Ser{
	private String cpf;
	
	public Pessoa(String nome, int idade, String cpf) {
		super(nome,idade);
		this.cpf=cpf;
	}
	
	@Override
	public void saudacao() {
		System.out.println("Oi");
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
class Ser{
	private String nome;
	private int idade;
	
	public Ser(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public void saudacao() {
		System.out.println("!@#$$");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
class Animal extends Ser{
	
	
	public Animal(String nome, int idade) {
		super(nome,idade);
	}
	public void saudacao() {
		System.out.println("au au");
	}
}