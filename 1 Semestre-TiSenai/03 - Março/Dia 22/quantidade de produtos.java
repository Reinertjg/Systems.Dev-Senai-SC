package aula22;

import java.util.Scanner;

public class Aula22 {

    public static void main(String[] args) {

        int quantidade = 3;
        float valor = 3.50f;

        Scanner sc = new Scanner(System.in);

        System.out.printf("A quantidade de produtos: %d " + "\nValor de cada produto: R$ %.2f\n ", quantidade, valor);

        System.out.println("----------\n");

        System.out.println("Antonio\n Vieira\n dos\n Santos");

        float salario = 1450.00f;
        char sexo = 'F';
        String cidadelocal = "Santos";
        float soma;
        int idade = 15;
        String nome = "Marcela";
        
        System.out.printf(" o Nome : &s\n tem idade de: %d\n Seu sexo: %c\n mora em: %s\n Seu salario : R$ %.2f\n",nome,idade,sexo,cidadelocal,salario);
        
