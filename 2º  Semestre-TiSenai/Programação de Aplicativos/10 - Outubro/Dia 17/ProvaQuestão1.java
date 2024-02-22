package prova;

import javax.swing.JOptionPane;

public class Prova {

    public static void main(String[] args) {

        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro números: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segudo números: "));

        Soma(num1, num2);
        Subtracao(num1, num2);
        Multiplicacao(num1, num2);
        Divisao(num1, num2);

    }//fim do main

    public static void Soma(int num1,int num2) {
        int soma = (num2 + num1);
        System.out.println("O resultado é: " + soma);
    }

    public static void Subtracao(int num1,int num2) {
        int subtracao = (num1 - num2);
        System.out.println("O resultado é: " + subtracao);
    }

    public static void Multiplicacao(int num1,int num2) {
        int multi = (num1 * num2);
        System.out.println("O resultado da multiplicação é: " + multi);
    }

    public static void Divisao(int num1, int num2) {
       if(num1 > 0 && num2 > 0){
           int divisao = (num1 / num2);
           System.out.println("O resultado da divisão é: " + divisao);
       }
        
    }

}

