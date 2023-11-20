package Banco;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(12345, "Corrente", 500.0);
        Conta conta2 = new Conta(2345, "Poupança", 1000);

        Cliente novCliente = new Cliente("JHon");
        novCliente.addConta(conta2);
        novCliente.addConta(conta1);

        novCliente.getListContas();
    }

}
