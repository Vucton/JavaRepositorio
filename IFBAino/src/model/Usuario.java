package model;

import java.util.ArrayList;

public class Usuario {
	private ArrayList<String> nome;
	private ArrayList<String> senha;

	public Usuario(String nome, String senha) {
		this.nome = new ArrayList<>();
		this.senha = new ArrayList<String>();

		this.nome.add(nome);
		this.senha.add(senha);
	}

	public void login(String nome, String senha) {

		if (nome.contains(nome) && senha.contains(senha)) {
			System.out.println("Bem Vindo a Tela inicial");

		} else {
			System.err.println("Usuario ou senha invalidos");

		}

	}
}
