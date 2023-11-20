package Banco;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Conta> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public void getListContas() {
        System.out.println("Contas em meu nome:" + this.nome);
        for (Conta conta : contas) {
            System.out.println(conta.getNumeroDaConta() + " - " + conta.getTipo());
        }
    }

}
