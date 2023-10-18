import javax.swing.JOptionPane;

public class Exercício3 {
    public static void main(String[] args) {
        
        int i = 1;
        int numero = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));

        while (i <= numero) {
            
            JOptionPane.showMessageDialog(null, (i + " "));
            i++;
            
        }
            
    }
}
// Faça um programa que peça ao usuário para digitar um número positivo e,
// em seguida, imprima todos os números de 0 até o número digitado utilizando
// a estrutura de repetição do-while.     
