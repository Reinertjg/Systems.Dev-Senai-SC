package atividadefor;

import javax.swing.JOptionPane;



public class Atividade4For {

    public static void main(String[] args) {

        
        int numero;
        
        
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para calcular a tabuada: "));
        
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        

        
    }
}
