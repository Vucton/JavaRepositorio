
public class VetoresIguais {
	public static void main(String[] args) {
		int tamanho=5;
		int vet1[] = new int[tamanho];
		int[] vet2 = new int[tamanho];
		int[] resultado = new int[tamanho];
		int indice=0;

		vet1[0] = 5;
		vet1[1] = 9;
		vet1[2] = 94;
		vet1[3] = 6;
		vet1[4] = 7;
		
		vet2[0] = 5;
		vet2[1] = 94;
		vet2[2] = 7;
		vet2[3] = 3;
		vet2[4] = 9;

		

		for(int i=0; i<tamanho;i++) {
			for(int j=0; j<tamanho;j++) {
				if(vet1[i]==vet2[j]){
					resultado[indice]=vet1[i];
					indice++;
				
				}
			}
		}
		 System.out.println("Valores iguais nos dois vetores:");
		 for(int i=0; i<indice;i++) {
			 System.out.println(resultado[i]);
		 }

	}
}
