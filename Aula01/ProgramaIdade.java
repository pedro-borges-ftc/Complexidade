package Aula01;

import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        // Estrutura if-else para classificar a faixa etária
        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade < 60) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é idoso.");
        }

        // Estrutura switch para benefícios
        switch (idade < 18 ? 1 : (idade < 60 ? 2 : 3)) {
            case 1:
                System.out.println("Benefício: Estudante - meia entrada em cinemas e eventos.");
                break;
            case 2:
                System.out.println("Benefício: Trabalhador - acesso a programas de capacitação.");
                break;
            case 3:
                System.out.println("Benefício: Aposentado - descontos em farmácias.");
                break;
            default:
                System.out.println("Sem benefícios disponíveis.");
        }

        // Estrutura for para mensagem de boas-vindas
        for (int i = 1; i <= 3; i++) {
            System.out.println("Bem-vindo ao sistema!");
        }

        // Estrutura while para contar até a idade digitada
        int contador = 1;
        System.out.println("Contagem de 1 até sua idade:");
        while (contador <= idade) {
            System.out.print(contador + " ");
            contador++;
        }
        System.out.println();

        sc.close();
    }
}