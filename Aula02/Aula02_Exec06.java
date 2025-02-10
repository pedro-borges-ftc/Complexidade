package Aula02;
import javax.swing.JOptionPane;

public class Aula02_Exec06 {
    public static void main(String[] args) {
        //variáveis
        int qtaFuncionarios = 0;
        double SomaSalarios = 0;
        double salario, mediaSalarial = 0;

        //entrada de dados
        qtaFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionários da empresa."));

        //processamento
        for (int i = 0; i < qtaFuncionarios; i++) {
            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário " + (i + 1) + "."));
            SomaSalarios += salario;
        }
        mediaSalarial = SomaSalarios / qtaFuncionarios;

        //saída de dados
        System.out.println("A média salarial da empresa é " + mediaSalarial);
    }    
}
