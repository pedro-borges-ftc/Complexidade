package Aula09;
public class Aula09_Merge {
	public static void main(String[] args) {
		int[] vetor1 = {10, 18, 9, 25, 17, 32, 23, 45, 6 };
		imprimeVetor(vetor1, "Vetor desordenado: ");	

		// Ordenando os valores no vetor
		//selectionSort(vetor1);
		//bubbleSort(vetor1);
		MergeSort(vetor1, 0, (vetor1.length - 1));
		//QuickSort(vetor1,0,(vetor1.length - 1));
		//djkstra(v[i][j],origem,destino);;

		imprimeVetor(vetor1, "Vetor Ordenado: ");
	}
	



	public static void MergeSort(int[] x, int ini, int fim) {
		if (ini < fim) {
			// calcula o valor do meio
			int meio = ini + (fim - ini) / 2;
			// ordena a metade a esquerda
			MergeSort(x, ini, meio);
			// ordena a metade a direita
			MergeSort(x, meio + 1, fim);
			// ordena as metades que foram separadas anteriormente
			Merge(x, ini, meio, fim);
		}

	}
	

	
	public static void Merge(int[] x, int ini, int meio, int fim) {
		int[] aux = new int[x.length];
		// clona os elementos de x em aux
		for (int i = ini; i <= fim; i++)
			aux[i] = x[i];

		int i = ini, j = meio + 1, k = ini;
		// testa os pares
		while (i <= meio && j <= fim) {
			if (aux[i] <= aux[j]) {
				x[k] = aux[i];
				i++;
			} else {
				x[k] = aux[j];
				j++;
			}
			k++;
		}
		// copia o restante do vetor aux(at� o meio) para o final do vetor x
		while (i <= meio) {
			x[k] = aux[i];
			k++;
			i++;
		}

	}
	
	
	public static void bubbleSort(int[] x) {
		int fim = x.length - 2, aux;
		boolean houveTrocas = true;
		
		while(houveTrocas){
			//
			houveTrocas = false;
			for(int i = 0; i <= fim; i++){
				if(x[i] > x[i + 1]){
					//
					aux = x[i];
					x[i] = x[i + 1];
					x[i + 1] = aux;
					houveTrocas = true;
					imprimeVetor(x, "Troca " + i + " Passo " + fim + ": ");
				}
			}
			fim--;
		}
		
	}
		
	public static void selectionSort(int[] x) {
		int min = 0;
		for (int i = 0; i < x.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < x.length; j++) {
				if (x[j] < x[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = x[i];
				x[i] = x[min];
				x[min] = temp;
			}
			System.out.print("Passo: " + (i+1) + ": ");
			for(int k = 0; k < x.length ; k++){
				System.out.print(x[k]);
				if(k == i){
					System.out.print("|");
				}else{
					if(k < (x.length - 1))
						System.out.print(",");
				}					
			}
			System.out.println("");
		}
	}
	
	
	public static void imprimeVetor(int[] x, String s){
		System.out.print(s + "{");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
			if(i < (x.length - 1))
				System.out.print(" ,");
		}
		System.out.println("}");
	}
}