package Aula05;
import java.util.Scanner;

public class Aula05_Exec01 {
    
    public static void main(String args[]) {
      int[] numeros = {23,17,5,90,12,44,38,84,77}; 
      Scanner ler = new Scanner(System.in);
      int resultado = 0, chavePesquisa;
      
      System.out.println("Digite o número a ser encontrado: ");
      chavePesquisa = ler.nextInt();
      
      resultado = pesquisaSequencial(chavePesquisa,numeros);

      if(resultado < 0){//não achou
          System.out.println("Elemento não encontrado");
      }else{//achou
          System.out.println("Elemento encontrado na posição: " + resultado);
      }

      ler.close();
    }
    
    public static int pesquisaSequencial(int elem , int V[]) {
        int i = 0, k = -1;
        
        while((i < V.length) && (k == -1)){
            if(elem == V[i])
                k = i;
            else
                i++;
        }        
        return k;
    }
}