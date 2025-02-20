package Aula06;
import java.util.Arrays;

public class Aula06_Exec01 {
    
    public static void main(String args[]) {
        int[] numeros = {10,18,9,25,17,32,23,45,6}; 
      
        SelectionSort(numeros);
        
        System.out.println("O array ordenado é: " + Arrays.toString(numeros));
    }
    
    public static void SelectionSort(int v[]) {
        int ini, min, aux;
        
        for(ini = 0; ini < v.length - 1; ini++){
            System.out.println("#" + ini + "): " + Arrays.toString(v));
            min = ini;
            
            for(int i = ini+1; i < v.length; i++){
                if(v[i] < v[min]){
                    min = i;
                }
            }
            
            if(min != ini){
                aux = v[ini];
                v[ini] = v[min];
                v[min] = aux;
            }
        }
    }
}