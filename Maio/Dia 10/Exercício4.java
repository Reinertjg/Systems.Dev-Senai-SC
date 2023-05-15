package atividades;

import javax.swing.JOptionPane;

public class Exercício4 {

    public static void main(String[] args) {

        int cc = 0;
        int qntDeNumeros = 0;
        int numeros = 0;
        double media = 0.0, mediaFinal = 0.0;

        do {
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero positivo para a media (Numero negativo encerra o calculo)"));
            if (numeros > 0) {
                media += numeros;
                qntDeNumeros++;
            } else {
                cc++;
            }

        } while (cc != 1);

        mediaFinal = (media / qntDeNumeros);
        JOptionPane.showMessageDialog(null, "Media Geral: " + mediaFinal);

    }
}
//5. Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos, lidos
//externamente. O final da leitura acontecerá quando for lido um valor negativo.
