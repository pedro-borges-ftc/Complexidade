import java.util.Scanner;

public class Aula02_Exec01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para contagem
        int totalCarros = 0;
        int carrosAte2000 = 0;
        double valor;
        int ano;
        double desconto;
        double valorPago;
        String resposta;

        // Loop para ler os veículos até o usuário decidir parar
        while (true) {
            totalCarros++;

            // Ler o valor e ano do veículo
            System.out.print("Digite o valor do veículo: R$ ");
            valor = scanner.nextDouble();

            System.out.print("Digite o ano do veículo: ");
            ano = scanner.nextInt();

            // Calcular o desconto
            desconto = 0;
            if (ano <= 2000) {
                desconto = valor * 0.12; // 12% de desconto
                carrosAte2000++; // Incrementa o contador de carros até 2000
            } else {
                desconto = valor * 0.07; // 7% de desconto
            }

            // Calcular o valor a ser pago
            valorPago = valor - desconto;

            // Exibir o resultado
            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Valor a ser pago: R$ " + valorPago);

            // Perguntar se o usuário deseja continuar
            System.out.print("Deseja continuar calculando descontos? (S para sim, N para não): ");
            resposta = scanner.next();

            if (resposta.equalsIgnoreCase("N")) {
                break; // Sai do loop se a resposta for "N"
            }
        }

        // Exibir o total de carros
        System.out.println("\nTotal de carros no geral: " + totalCarros);
        System.out.println("Total de carros com ano até 2000: " + carrosAte2000);

        scanner.close();
    }

}