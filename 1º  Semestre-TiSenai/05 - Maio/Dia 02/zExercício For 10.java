package exercício.pkgdo.pkgwhile.pkg6;

import javax.swing.JOptionPane;

public class ExercicioFor5 {

     static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        
        for (int i = 0; i < 21
                ; i++) {
            JOptionPane.showMessageDialog(null, "(" + i + "):" + ExercicioFor5.fibo(i) + "\t");
        }
    }
}
//Faça um programa que imprima os primeiros 20 números da sequência de Fibonacci utilizando a estrutura de repetição for

        
        
    


