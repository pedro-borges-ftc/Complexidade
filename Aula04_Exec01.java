import java.util.Scanner;

public class Aula04_Exec01 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0, opcao = 0;
        
        System.out.println("Digite um número inteiro: ");
        numero = teclado.nextInt();
        
        System.out.println("Escolha a ordenação (1-Crescente; 2-Decrescente): ");
        opcao = teclado.nextInt();
        
        if(opcao == 1){//algoritmo crescente
            
            for(int contador = 0; contador <= numero; contador++){
                System.out.print(contador);
                
                if(contador < numero)
                    System.out.print(", ");
                
            }
            
        }else{//Decrescente
            
            for(int contador = numero; contador >= 0; contador--){
                System.out.println(contador);
            }
            
        }
        teclado.close();
    }
}