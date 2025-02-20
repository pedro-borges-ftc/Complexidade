import java.util.Scanner;

public class Aula04_Exec02 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0, acumulador = 0;
        
        System.out.println("Digite um número inteiro: ");
        numero = teclado.nextInt();
        
        for(int contador = 0; contador <= numero; contador++){
            acumulador += contador;
        }
      
        System.out.println("A soma dos números de 0 até " + numero + " é igual a " + acumulador);

        teclado.close();
    }
}