
import javax.swing.JOptionPane;

public class Exercício3 {

    public static void main(String[] args) {

        double chico = 1.50;
        double ze = 1.10;
        int anos = 0;
       

        for(anos=0; ze<chico; anos++)
        {
            chico += 0.02;
            ze += 0.03;
        }

        JOptionPane.showMessageDialog(null, "Seram " + anos + " anos para que Zé seja maior que Chico.");

    }
}
// 4. Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce
// 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão
// necessários para que Zé seja maior que Chico.
