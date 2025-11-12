package Aula09;

import java.util.Arrays;
import java.util.Scanner;

public class Aula09_MergeChatGPT {

    // Método principal do MergeSort
    public static void mergeSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            System.out.println("Dividindo: " + Arrays.toString(Arrays.copyOfRange(array, inicio, fim + 1)));

            // Etapa de divisão (recursiva)
            mergeSort(array, inicio, meio);     //esquerda
            mergeSort(array, meio + 1, fim);    //direita

            // Etapa de conquista (fusão)
            merge(array, inicio, meio, fim);

            System.out.println("Mesclando: " + Arrays.toString(Arrays.copyOfRange(array, inicio, fim + 1)));
        }
    }

    // Função que faz a fusão (merge) de dois subarrays ordenados
    public static void merge(int[] array, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        // Copia os dados para arrays temporários
        for (int i = 0; i < n1; ++i)
            esquerda[i] = array[inicio + i];
        for (int j = 0; j < n2; ++j)
            direita[j] = array[meio + 1 + j];

        int i = 0, j = 0;
        int k = inicio;

        // Intercala os arrays esquerda e direita de forma ordenada
        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                array[k] = esquerda[i];
                i++;
            } else {
                array[k] = direita[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes, se houver
        while (i < n1) {
            array[k] = esquerda[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = direita[j];
            j++;
            k++;
        }
    }

    // Método main para execução do algoritmo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos do array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nArray original: " + Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(array));

        scanner.close();
    }
}
