package atividades;

import javax.swing.JOptionPane;

public class Exercício8 {

    public static void main(String[] args) {

        int cc = 1;
        double maiorNumero = 0.0;
        double numero = 0.0;

        do {
            numero = Double.parseDouble(JOptionPane.showInputDialog("Informe 50 numeros (" + cc + "/50)"));

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            cc++;
        } while (cc != 51);

        JOptionPane.showMessageDialog(null, "O maior numero é: " + maiorNumero);
    }
}
//9. Escreva um algoritmo que leia 50 valores e encontre o maior e o menor deles. Mostre o
//resultado.
