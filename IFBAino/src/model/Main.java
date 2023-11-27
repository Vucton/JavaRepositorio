package model;

public class Main {
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("joao", "joovictor");
		Usuario usuario2 = new Usuario("admin", "123");
		
		usuario1.login("admin", "123");

	}
}
