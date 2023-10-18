package Prova;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroTabuada = 0;
        int tabuada = 0;

        System.out.println("Informe o numero da tabuada!!");
        numeroTabuada = sc.nextInt();

        for (int ii = 0; ii <= 10; ii++) {

            tabuada = ii * numeroTabuada;

            System.out.println(numeroTabuada + " X " + ii + " = " + tabuada);
        }
    }
}
