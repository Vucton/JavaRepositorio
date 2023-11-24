package Calculadora;

public class Main {
	public static void main(String[] args) {
		Calculadora conta = new Calculadora();
		
		conta.setSomar(5, 6);
		System.err.println("A soma de 5+6: "+conta.getSomar());
		
		conta.setSubtrair(5, 3);
		System.err.println("A subtracao de 5-3: "+conta.getSubtrair());
		
		conta.setDividir(10, 2);
		System.err.println("A divisao de 10/2: "+conta.getDividir());
		
		conta.setPotencia(5, 2);
		System.err.println("Elevar 5 a 2: "+conta.getPotencia());
		
		conta.setFatorial(3);
		
	}

}
