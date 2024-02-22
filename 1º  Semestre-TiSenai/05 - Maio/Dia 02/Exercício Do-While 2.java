import javax.swing.JOptionPane;

public class Exercício2 {
    public static void main(String[] args) throws Exception {

        int i = 1;

        while (i <= 50) {
            if (i % 2 == 0) {
                JOptionPane.showMessageDialog(null, (i + " "));
            }
            i++;
        }


        //Faça um programa que imprima os números pares entre 1 e 50 utilizando a estrutura de repetição while.
    }
}
