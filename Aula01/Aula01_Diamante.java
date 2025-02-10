package Aula01;
import java.util.Scanner;

public class Aula01_Diamante {
    public static void main(String[] args) {
        //variáveis
        int numero = 0;
        int meio = 0;
        Scanner teclado = new Scanner(System.in);

        //entrada de dados
        // Pede um número ímpar ao usuário
        do {
            System.out.print("Digite um número ímpar para formar o diamante: ");
            numero = teclado.nextInt();
        } while (numero % 2 == 0);  // Verifica se é ímpar

        meio = numero / 2; // Ponto central do diamante
        
        // Parte superior do diamante
        for (int i = 0; i <= meio; i++) {
            // Espaços
            for (int j = 0; j < meio - i; j++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferior do diamante
        for (int i = meio - 1; i >= 0; i--) {
            // Espaços
            for (int j = 0; j < meio - i; j++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Fechar o Scanner
        teclado.close();
    }
}
