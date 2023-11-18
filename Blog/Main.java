package Blog;

public class Main {
	public static void main(String[] args) {
		Blog blog = new Blog("IF-Baiano");
		
		blog.publicarPost("Minha Biografia","Meu nome e Joao Victor.");
		
		blog.addTexto(0, "\nEu tive um cachorro chamado vucton e ele era da raca salchicha");

		System.out.println(blog.getLerPostagem(0));
		
		
		blog.publicarPost("Everste","Vivo em aguas geladas");
		blog.publicarPost("Constantine","Meu nome e Joao Victor.");
		blog.publicarPost("Amor e gelato","Um livro de romance que conta a historia de Lina foi morar na italia com um homem que talvez era seu pai.."); 
		blog.addTexto(3, "\nE descobrindo que não conhecia sua mae como pensava, no meio dessa trama ela se apaixona por um meio italiano chamado Lorenzo...");
		System.out.println();
		blog.ListPost();
		System.out.println();
		System.out.println(blog.getTituloPostagem(3)+"\n"+blog.getLerPostagem(3));
		
	}

}
