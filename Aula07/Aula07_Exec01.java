package Aula07;
import java.util.Scanner;

public class Aula07_Exec01 {
    
    public static void main(String args[]) {
      int[] numeros = {5,12,17,23,38,44,77,84,90}; 
      Scanner ler = new Scanner(System.in);
      int resultado = 0, chavePesquisa;
      
      System.out.println("Digite o número a ser encontrado: ");
      chavePesquisa = ler.nextInt();
      
      resultado = pesquisaBinaria(chavePesquisa,numeros);

      if(resultado < 0){//não achou
          System.out.println("Elemento não encontrado");
      }else{//achou
          System.out.println("Elemento encontrado na posição: " + resultado);
      }

      ler.close();
    }
    
    public static int pesquisaBinaria(int elem , int v[]) {
        int inicio = 0, fim = (v.length)-1, meio = 0, k = -1;
            //estrutura de repetição
            while( (inicio <= fim) && (k == -1)){
                //calcular o valor do meio
                meio = (inicio + fim) / 2;
                
                //testa se encontrou
                if( elem == v[meio]){
                    k = meio;   //encontrou
                }else{  //ainda não encontrou
                    if(elem < v[meio]){
                        fim = meio - 1;
                    }else{
                        inicio = meio + 1;
                    }
                }
            }
        return k;
    }
}