package exercício.pkgdo.pkgwhile.pkg6;

import javax.swing.JOptionPane;

public class ExercicioFor5 {

    public static void main(String[] args) {
        
        int i = 1;
        int numero = 0;
        int menor = 999999;



        for(i = 1; i <= 10; i++ ){
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"
                + "\n Digete 0 para sair"));
            
            if(numero == 0){
                break;
            }
            if(numero < menor) {
                menor = numero;
            }
            
        }
        JOptionPane.showMessageDialog(null, "O maior numero é: "+menor);
        
    }
}
//Faça um programa que leia uma sequência de números inteiros e imprima o menor número digitado.
//O programa deve parar de ler números quando o usuário digitar o número 0. Utilize a estrutura de repetição for.


        
        
    


