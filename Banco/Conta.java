package Banco;

public class Conta {

    private int numeroDaConta;
    private String tipo;
    private double saldo;

    public Conta(int numeroDaConta, String tipo, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }
}
