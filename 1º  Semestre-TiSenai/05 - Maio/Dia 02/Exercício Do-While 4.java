
import javax.swing.JOptionPane;
public class Exercício4{

    public static void main(String[] args) {
        
        int numero = 0;
        double soma = 0.0;

        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero pra soma!"
                +"\nDigite 0 para sair!"));
            if(numero > 0){
                soma += numero;
            }

        }while(numero != 0);
        
        
        JOptionPane.showMessageDialog(null, "A Soma é "+soma);
        
        
        
    }
    
}
// Faça um programa que leia uma sequência de números inteiros até que o usuário
// digite o número 0. O programa deve calcular a soma de todos os números digitados e imprimir o resultado.
