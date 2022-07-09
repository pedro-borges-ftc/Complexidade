import java.util.Arrays;

public class Aula07_Exec02 {
    
    public static void main(String args[]) {
        int[] numeros = {10,18,9,25,17,32,23,45,6}; 
      
        bubbleSort(numeros);
        
        System.out.println("O array ordenado é: " + Arrays.toString(numeros));
    }
    
    public static void bubbleSort(int v[]) {
       
       int fim = (v.length) - 2, aux;
       boolean houveTrocas = true;
       System.out.println("#Array: " + Arrays.toString(v));
       while(houveTrocas){
           //cada iteração corresponde a uma passagem
           houveTrocas = false;
           for(int i = 0; i <= fim; i++){
               if(v[i] > v[i+1]){
                   //trocar de posição
                    aux = v[i];
                    v[i] = v[i+1];
                    v[i+1] = aux;
                   houveTrocas = true;
                   System.out.println("#" + fim + "): " + Arrays.toString(v));
               }
           }
           
           fim--;
       }
    }
}