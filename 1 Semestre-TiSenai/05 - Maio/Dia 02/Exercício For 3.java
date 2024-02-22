package exercício.pkgdo.pkgwhile.pkg6;

import javax.swing.JOptionPane;

public class ExercicioFor3 {

    public static void main(String[] args) {
        
        int i = 1;
        int numero = 0;
        int maior = 0;



        for(i = 1; i <= 10; i++ ){
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"
                + "\n Digete -1 para sair"));
            
            if(numero > maior) {
                maior = numero;
            }
            if(numero == -1){
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "O maior numero é: "+maior);
        
    }
}
//Faça um programa que leia uma sequência de números inteiros e imprima o maior número digitado.
//O programa deve parar de ler números quando o usuário digitar o número -1. Utilize a estrutura de repetição for.
        
        
    

