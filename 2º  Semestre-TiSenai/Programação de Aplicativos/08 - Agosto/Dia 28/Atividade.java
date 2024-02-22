
package Prova;

import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número entre 1 e 10: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0 || numero >= 10) {
            System.out.println("O número deve ser maior que 0 e menor que 10.");
        } else {
            int somaQuadrados = 0;
            int contador = 0;
            int atual = numero;
            
            while (contador < 20) {
                if (atual % 2 != 0) {
                    somaQuadrados += atual * atual;
                    contador++;
                }
                atual++;
            }
            
            System.out.println("A soma dos quadrados dos 20 primeiros números ímpares a partir de " + numero + " é: " + somaQuadrados);
        }
    }
}
/*Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros números inteiros positivos ímpares a 
partir do número informado pelo usuário menor que 10 e maior que zero*/
