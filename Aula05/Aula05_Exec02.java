package Aula05;
import java.util.Scanner;

public class Aula05_Exec02 {
    public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor1 = {3,7,20,25,26,28,30,34,42,44,50,60,68,75,86,99,125,145,209,250};
		int chave, resultado1;
		
		System.out.println("Digite o valor a ser pesquisado no vetor:");
		chave = ler.nextInt();
		
		resultado1 = pesquisaBinaria(vetor1,chave);
		
		if(resultado1 == -1){
			System.out.println("Valor não encontrado. \n K = " + resultado1);
		}else{
			System.out.println("valor encontrado na posição:" + resultado1);
		}

		ler.close();
	}//fim do main
	
	public static int pesquisaBinaria(int[] array, int valor){
		int inicio =0, fim = array.length -1;
		int meio = 0, k = -1;		
		while((inicio <= fim) && (k == -1)){
			meio = (inicio + fim) /2;
			imprimeVetor(array, inicio, fim, "Ini = " + inicio + ", Meio = " + meio  
					+ ", Fim = " + fim + ", Elemento Central " + array[meio]);			
			if(valor == array[meio]){
				k = meio;
			}else{
				if(valor < array[meio]){
					fim = meio -1;
				}else{
					inicio = meio + 1;
				}
			}
		}		
		return k;
	}//fim do pesquisaBinaria
	
	public static void imprimeVetor(int[] x, int ini, int fim, String s){
		System.out.print("{");
		for (int i = ini; i <= fim; i++) {
			System.out.print(x[i]);
			if(i < (fim))
				System.out.print(" ,");
		}
		System.out.println("}");
		System.out.println(s);
	}//fim do imprimeVetor
    
}
