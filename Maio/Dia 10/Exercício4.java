package javaapplication1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercício4 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("##.00");
        
        int qntDeNumeros = 0;;
        double media = 0.0, mediaFinal = 0.0;

       for(int numeros = 1; numeros>0;) {
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero positivo para a media (Numero negativo encerra o calculo)"));
            
            if (numeros > 0) {
                media += numeros;
                qntDeNumeros++;
            }

        } 

        mediaFinal = (media / qntDeNumeros);
        JOptionPane.showMessageDialog(null, "Media Geral: " + df.format(mediaFinal));

    }
}
//5. Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos, lidos
//externamente. O final da leitura acontecerá quando for lido um valor negativo.
