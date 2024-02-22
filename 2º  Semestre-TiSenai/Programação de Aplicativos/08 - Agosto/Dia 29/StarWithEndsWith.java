package Métados;

import java.util.Scanner;

public class StarWithEndsWith {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sobrenome = "";
        String[] nomes = {
            "Luiz Silva",
            "João Reinert",
            "Carlos Dos Santos",
            "Willian Ribeiro",
            "Matheus Rocha",
            "Isadora Nicoletti",
            "Maria Da Silva",
            "Bolsonaro Dos Santos",
            "Gabriel Ribeiro",
            "Raul Reinert",};

        System.out.println("Digite um SobreNome");
        sobrenome = sc.next();

        for (int ii = 0; ii < 9; ii++) {

            if (nomes[ii].endsWith(sobrenome)) {
                System.out.println("Nomes ->- " + nomes[ii]);
            }

        }
    }

}

