import java.util.Scanner;

public class Aula02_Exec02 {
    public static void main(String[] args) {
        //variáveis
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        Scanner teclado = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o primeiro número");
        num1 = teclado.nextDouble();
        System.out.println("Digite o segundo número");
        num2 = teclado.nextDouble();

        //processamento
        resultado = num1 + num2;

        //saída de dados
        System.out.println("A soma dos números é " + resultado);
        teclado.close();  //fechar o Scanner
    }    
}
