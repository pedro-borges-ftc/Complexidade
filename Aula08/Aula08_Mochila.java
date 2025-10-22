package Aula08;
import java.util.Scanner;

public class Aula08_Mochila {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Ordenar os itens no vetor pela razão lucro/peso
		double[] lucro = {24,15,25};	//lista dos lucros
		double[] peso =  {15,10,18};	//lista dos pesos
		double capacidade; double resultado1 = 0;
		
		System.out.println("Digite a capacidade máxima da mochila (kg):");
		capacidade = ler.nextDouble();
		
		resultado1 = mochilaFracionaria(lucro, peso, capacidade);
		
		System.out.println("O lucro máximo será de:" + resultado1);

		// Fechar o Scanner
        ler.close();
	}
	
	public static double mochilaFracionaria(double[] lucro,double[] peso, double capacidade){
		int i = 0; double lucroTotal = 0.0;//Inicialização
		int tamanho = lucro.length;
		//iteração
		while(peso[i] <= capacidade && i < tamanho - 1){
			System.out.print("Peso: " + peso[i]);
			System.out.println(" || Lucro: " + lucro[i]);
			lucroTotal += lucro[i];
			capacidade -= peso[i];
			i++;
		}//fim da iteração
		//Finalização
		lucroTotal += (capacidade / peso[i]) * lucro[i];
		System.out.print("Peso: " + peso[i] +
				" || % Utilizado:" + (capacidade / peso[i]) +
				" || Total Utilizado:" + capacidade);
		System.out.println(" || Lucro: " + (capacidade / peso[i]) * 
				lucro[i]);
		return lucroTotal;		
	}
}