package exercício.pkgdo.pkgwhile.pkg6;

import javax.swing.JOptionPane;

public class ExercicioFor3 {

    public static void main(String[] args) {
        
        int i = 1;
        int numero = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"
                        + "\n Digete -1 para sair"));

        for(i = 1; i <= numero; i++ ){
            
           if (i % 2 == 3) {
                JOptionPane.showMessageDialog(null, (i + " "));
           }
            if(numero == -1){
                break;
            }
        }    
    }
}
//Faça um programa que leia uma sequência de números inteiros e imprima apenas os números pares.
//O programa deve parar de ler números quando o usuário digitar o número -1. Utilize a estrutura de repetição for.
        
    


