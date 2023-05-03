package exercício.pkgdo.pkgwhile.pkg6;

import javax.swing.JOptionPane;

public class ExercicioFor5 {

    public static void main(String[] args) {
        
        int i = 1;
        int numero = 0, divisao = 0;
        double media = 0.0, mediageral = 0.0;



        for(i = 1; i <= 10; i++ ){
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade!"
                +"\nDigite -1 para sair!"));
            
            if(numero == -1){
                break;
            }
            if(numero > 0){
                media += numero;
                divisao++;
            }

        }
        mediageral = (media / divisao);
        JOptionPane.showMessageDialog(null, "A Media é "+mediageral+"a: ");
        
    }
}
//Faça um programa que leia uma sequência de números inteiros e calcule a média.
//O programa deve parar de pedir números quando o usuário digitar o número -1. Utilize a estrutura de repetição for.

        
        
    


