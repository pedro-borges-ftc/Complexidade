package Aula02;
import java.util.Scanner;

public class Aula02_Exec05 {
    public static void main(String[] args) {
        //variáveis
        double num1 ,num2, soma, subtracao, multiplicacao, divisao;
        int continuar, operacao = 0;
        boolean reiniciar = true;
        Scanner teclado = new Scanner(System.in);

        while(reiniciar == true){
            //Entrada de dados
            System.out.println("Digite o primerio número: ");
            num1 = teclado.nextDouble();
            System.out.println("Digite o segundo número: ");
            num2 = teclado.nextDouble();

            while (operacao < 1 || operacao > 4) {
                System.out.println("Que operção matemática deseja realizar: ");
                System.out.println("1 - Soma ");
                System.out.println("2 - Subtração ");
                System.out.println("3 - Divisão ");
                System.out.println("4 - Multiplicação ");
                operacao = teclado.nextInt();   //Essa variável identifica qual a operação matemática
            }            

            //Processamento
            switch(operacao){
                case 1: //soma
                    soma = num1 + num2;
                    System.out.println("Resultado da soma: " + soma);
                    break;
                case 2: //Subtração
                    subtracao = num1 - num2;
                    System.out.println("Resultado da subtração: " + subtracao);
                    break;
                case 3: //Divisão
                    if(num2 == 0){
                        System.out.println("Não é possível realizar a divisão por zero.");
                    }else{
                        divisao = num1 / num2;
                        System.out.println("Resultado da divisão: " + divisao);
                    }
                    break;
                case 4: //Multiplicação
                    multiplicacao = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + multiplicacao);
                    break;
                default:
                    System.out.println("Operação inválida.");
            }

            //Teste Fim de Repetição
            System.out.println("Fazer novo cálculo? \n1 para continuar \n2 para sair: ");
            continuar = teclado.nextInt();

            if(continuar == 1){
                System.out.println("Novo cálculo!");
                operacao = 0;
            }else{
                reiniciar = false;
                System.out.println("Fim dos cálculos.");
            }
        }
        teclado.close();  //fechar o Scanner
    }    
}