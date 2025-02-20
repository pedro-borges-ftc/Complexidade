package Aula09;
public class Aula09_PesquisaRecursiva {
	
	public static int max(int A, int B){
		if(A > B ){
			return A;
		}else{
			return B;
		}
	}
	


	public static int maxVal(int[] array, int ini,int fim){
		//caso base
		if( fim - ini <= 1){
			return max(array[ini],array[fim]);
		}else{//caso recursivo
			int meio = (ini + fim )/ 2;
			int esquerda = maxVal(array, ini, meio);
			int direita = maxVal(array, meio + 1, fim);
			return max(esquerda, direita);
		}		
	}	






	public static void main(String[] args) {
		int[] vetor1 = 
		{45,12,54,14,150,32,18,20,20,100,22,240,259900};
				
		System.out.println("O maior elemento é:" +
				maxVal(vetor1,0,vetor1.length - 1));
		
	}
}