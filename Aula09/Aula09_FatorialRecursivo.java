package Aula09;
import java.util.Scanner;

public class Aula09_FatorialRecursivo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do fatorial a ser calculado:");
		int chave = ler.nextInt();
		
		int resultado = FatRecursivo(chave);
		
		System.out.println("O fatorial de " + chave + " é " + resultado);	

		// Fechar o Scanner
        ler.close();
	}		
	

	
	public static int FatRecursivo( int valor){		
		
		Scanner teclado = new Scanner(System.in);		
		
		if(valor <= 0){//caso base
			System.out.println("      FatRecursivo(0) = 1");
			teclado.next();			
			return 1;
		}else{//caso recursivo			
			System.out.println(valor + "* FatRecursivo(" + (valor - 1) + ")");
			teclado.next();
			int resposta = valor * FatRecursivo(valor - 1);
			System.out.println("      FatRecursivo(" + (valor) + ") = " + resposta);
			teclado.next();
			return resposta;
		}
	}
}
