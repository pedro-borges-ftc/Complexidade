package Aula08;
import java.util.Scanner;

public class Aula08_TrocoInt {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] cedulas = {200, 100, 50, 20, 10, 5, 2};//representa as cédulas do Real
		//int[] cedulas = {6,4,1 };//representa as cédulas
		int troco, resultado = 0;
		
		System.out.println("Digite o valor do troco (int):");
		troco = ler.nextInt();
		
		resultado = contaMoedasTroco(cedulas,troco);
		
		System.out.println("A quant.de cédulas/moedas é:"+resultado);

		// Fechar o Scanner
        ler.close();
	}
	
	public static int contaMoedasTroco(int[] moedas, int troco){
		int nQtdMoedas = 0;int i = 0;int quant = 0;//Inicialização
		int tamanho = moedas.length;
		//Iteração
		while( troco > 1 && i < tamanho){
			if( troco >= moedas[i]){
				quant = troco / moedas[i];
				nQtdMoedas += quant;
				System.out.print(quant+" Notas/Moedas de "+moedas[i]);
				troco = troco % moedas[i];
				System.out.println("|| Restante:" +	troco);
			}
			i++;
			quant = 0;
		}//Fim da Iteração		
		return nQtdMoedas;//finalização
	}
}