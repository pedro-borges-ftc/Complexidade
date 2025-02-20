import java.util.Scanner;

public class Aula04_Exec03 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0, num2 = 0, resultado = 0;
        
        System.out.println("Digite o 1º número inteiro: ");
        num1 = teclado.nextInt();
        
        System.out.println("Digite o 2º número inteiro: ");
        num2 = teclado.nextInt();
        
       for(int contador = 1; contador <= num2; contador++){
            resultado += num1;
        }
        
        System.out.println("Resultado de " + num1 + " x " + num2 + " = " + resultado);
        
        teclado.close();
    }
}