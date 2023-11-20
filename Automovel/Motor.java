package Automovel;

public class Motor {
    private String fabricante;
    private double cilindrada;
    private String combustivel;

    public Motor(String fabricante, double cilindrada, String combustivel) {
        this.fabricante = fabricante;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public String getCombustivel() {
        return combustivel;
    }

}
