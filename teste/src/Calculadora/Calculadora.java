package Calculadora;

public class Calculadora {
	private float somar;
	private float subtrair;
	private float dividir;
	private float potencia;
	
	public Calculadora() {}
	
	public void setSomar(float a, float b) {
		float resultado;
		resultado = a +b;
		this.somar=resultado;
	}
	public float getSomar() {
		return somar;
	}
	
	public void setSubtrair(float a , float b) {
		float resultado;
		resultado = a - b;
		this.subtrair=resultado;
	}
	public float getSubtrair() {
		return subtrair;
	}
	
	public void setDividir(float a, float b) {
		float resultado;
		resultado= a/b;
		this.dividir= resultado;
	}
	public float getDividir() {
		return dividir;
	}
	
	public void setPotencia(float a, float b) {
		double resultado;
		resultado= Math.pow(a, b);
		this.potencia=(float) resultado;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setFatorial(int a) {
		float fat=1;
		
		for (int i=1; i<=a;i++) {
			fat*= i;
		}
		System.err.printf("fatoria de !"+a+" = "+fat);		
	}
	

}
