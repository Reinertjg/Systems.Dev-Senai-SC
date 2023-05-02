
package exercício.pkgdo.pkgwhile.pkg6;
import javax.swing.JOptionPane;
public class ExercícioDoWhile9 {
    public static void main(String[] args) {
        
        int numero = 0;
        int menor = 999999;



        do{
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"
                + "\n Digete -1 para sair"));
            
            if(numero < menor && numero != -1) {
                menor = numero;
            }
        }while(numero >=0);
        
        JOptionPane.showMessageDialog(null, "O maior numero é: "+menor);
        
    }
}
//Faça um programa que leia uma sequência de números inteiros e imprima o menor número digitado.
//O programa deve parar de ler números quando o usuário digitar o número 0. Utilize a estrutura de repetição do-while.
