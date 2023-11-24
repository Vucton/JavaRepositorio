/*
 * Escreva uma Classe chamada Contador, que tem um atributo estatico que é incrementado 
 * sempre que a classe for instanciada. crie metodos para 'zerar', 'incrementar' 
 * e 'retornar o valor do 'contador'
 */
package teste;

public class Contador {
	static int contador=0;
	
	public Contador () {
		this.contador++;
	}
	
	public void zerarContador() {
		this.contador=0;
	}
	public int getContador() {
		return contador;
	}
	public void incrementa() {
		this.contador++;
	}
	
	
}
