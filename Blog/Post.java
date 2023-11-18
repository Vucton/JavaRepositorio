package Blog;

public class Post {
	private String titulo;
	private StringBuilder escreverTexto = new StringBuilder();
	
	
	public Post(String titulo) {
		this.titulo = titulo;
		
	}
	
	public void criarPost(String text) {
		this.escreverTexto.append(text);
	}
	
	public String getVerPost() {
		return escreverTexto.toString();
	}
	
	public String getTitulo() {
		return titulo;
	}
}
