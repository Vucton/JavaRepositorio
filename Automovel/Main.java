package Automovel;

public class Main {
    public static void main(String[] args) {
        Motor novoMotor = new Motor("Volksvagem", 1.0, "Flex");
        Carro novCarro = new Carro("Fox", 2006, novoMotor);

        System.out.println(novCarro.getModelo() + "\n" + novCarro.getMotor().getFabricante() + " "
                + novCarro.getMotor().getCilindrada());
    }
}
