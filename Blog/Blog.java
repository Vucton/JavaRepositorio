package Blog;

import java.util.ArrayList;

public class Blog {
	private String nome;
	private ArrayList<Post> posts;
	
	public Blog(String nome) {
		this.nome = nome;
		this.posts = new ArrayList<>();
	}
	
	public void publicarPost(String titulo,String texto) {
		Post novoPosts = new Post(titulo);
		novoPosts.criarPost(texto);
		posts.add(novoPosts);
	}
	
	public String getTituloPostagem(int n) {
		Post postSelecionado = posts.get(n);
		return postSelecionado.getTitulo();
	}
	
	public String getLerPostagem(int n) {
		if(n >= 0 && n < posts.size()) {
			Post postSelecionado = posts.get(n);
			return postSelecionado.getVerPost();
		}else {
			return "invalido";
		}
		
	}
	
	public void addTexto(int n, String texto) {
		Post postSelecionado = posts.get(n);
		postSelecionado.criarPost(texto);
	}
	
	public void ListPost() {
		System.out.println("\nLista de Publicacoes:");
		for(Post post : posts) {
			System.out.println(post.getTitulo());
		}
	}
}
