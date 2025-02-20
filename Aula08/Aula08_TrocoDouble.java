package Aula08;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Aula08_TrocoDouble {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double[] cedulas = {100, 50, 20, 10, 5, 2, 1, 0.5, 0.25, 0.10, 0.05, 0.01 };//representa as c�dulas
		//double[] cedulas = {100, 20, 10, 2, 1, 0.10, 0.01 };
		//double[] cedulas = {100, 50, 20, 10, 5, 2, 1};		
		
		double troco; int resultado1 = 0;
		
		System.out.println("Digite o valor do troco:");
		troco = ler.nextDouble();
		
		resultado1 = contaMoedasTroco(cedulas,troco);
		
		//System.out.println("A quantidade de cédulas é:" + resultado1);

		// Fechar o Scanner
        ler.close();
	}
	
	public static int contaMoedasTroco(double[] moedas, double troco){
		//algoritmo
		DecimalFormat df = new DecimalFormat("0.##");
		int nQtdMoedas = 0;int i = 0;int quant = 0;
		while( troco > 0.01 ){
			if( i < moedas.length && troco > 0.01){
				if(troco >= moedas[i]){
				quant = (int) (troco / moedas[i]);
				nQtdMoedas += quant;
				
				if(moedas[i] >= 1.0){
					System.out.print(quant+" Cédula(s) de " + moedas[i]);
				}else{
					System.out.print(quant+" Moeda(s) de " + moedas[i]);
				}
				//troco = troco % moedas[i];
				troco = troco - (quant * moedas[i]);
				
				System.out.println("|| Restante:" +	df.format(troco));
			}
			}
			i++;
			quant = 0;
		}		
		return nQtdMoedas;
	}
}
