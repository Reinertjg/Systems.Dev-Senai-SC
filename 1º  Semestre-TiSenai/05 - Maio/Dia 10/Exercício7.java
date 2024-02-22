package atividades;

import javax.swing.JOptionPane;

public class Exercício7 {

    public static void main(String[] args) {

        int cc = 0;
        int qntDeNumeros = 0;
        int numeros = 0;
        double media = 0.0, mediaFinal = 0.0;

        do {
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero par e positivo para a media (Numero impar ou negativo encerra o calculo)"));
            if (numeros > 0 && numeros % 2 == 0) {
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
//8. Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem
//pares. Termine a leitura se o usuário digitar zero (0).
