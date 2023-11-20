package Automovel;

public class Carro {
    private String modelo;
    private int ano;
    private Motor motor;

    public Carro(String modelo, int ano, Motor motor) {
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public Motor getMotor() {
        return motor;
    }

}