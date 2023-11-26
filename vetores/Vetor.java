import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		double vet[] = new double [10];
		double media = 0;
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("informe 5 notas: ");
		
		
		for(int i =0; i<5; i++) {
			vet[i] = leitor.nextInt();
			
			media += vet[i];
		}
		
		System.out.printf("Vetor: ");
		for(int i=0; i<5;i++) {
			
			System.out.printf(vet[i]+", " );
		}
		media/=5;
		System.out.println("Media: " +media);
	}

}
