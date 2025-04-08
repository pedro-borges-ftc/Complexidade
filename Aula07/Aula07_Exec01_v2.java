package Aula07;

import java.util.Arrays;
import java.util.Scanner;

public class Aula07_Exec01_v2 {

    // Método de busca binária
    public static int buscaBinaria(int[] array, int valorBuscado) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == valorBuscado) {
                return meio; // Encontrou o valor
            } else if (array[meio] < valorBuscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; // Valor não encontrado
    }

    // Método para verificar se o array está ordenado em ordem crescente
    public static boolean estaOrdenado(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da quantidade de elementos
        System.out.print("Digite a quantidade de elementos do array: ");
        int quantidade = scanner.nextInt();

        int[] numeros = new int[quantidade];

        System.out.println("Digite os " + quantidade + " números (em ordem crescente):");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Verifica se o array está ordenado
        if (!estaOrdenado(numeros)) {
            System.out.println("\n⚠️  Os números não estão em ordem crescente. Ordenando automaticamente...");
            Arrays.sort(numeros);
            System.out.println("✅ Números ordenados: " + Arrays.toString(numeros));
        }


        // Valor a ser buscado
        System.out.print("Digite o número que deseja buscar: ");
        int valor = scanner.nextInt();

        // Chama o método de busca binária
        int indice = buscaBinaria(numeros, valor);

        // Resultado
        if (indice != -1) {
            System.out.println("Número encontrado na posição: " + indice);
        } else {
            System.out.println("Número não encontrado no array.");
        }

        scanner.close();
    }
}
