
package javaapplication1;

import java.util.Scanner;

public class Exercicio{
    
    static double numeroX = 0.0;
    static double numeroY = 0.0;
    static String pular = "\n";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int opcao = 0;
        
        Pergunta(args);
        
        do{
            System.out.println(""
                + "***MENU***"
                + pular + "1 - ValorMaior"
                + pular + "2 - ValorMenor"
                + pular + "3 - RaizQuadrada"
                + pular + "4 - Potencia"
                + pular + "5 - NumeroAleatorio"
                + pular + "6 - Sair");
            opcao = sc.nextInt();
        
            switch (opcao) {
                case 1 -> ValorMaior(args);
                case 2 -> ValorMenor(args);
                case 3 -> RaizQuadrada(args);
                case 4 -> Potencia(args);
                case 5 -> NumeroAleatorio(args);
                default -> System.out.println("Essa opção não existe!!");
            }
        }while (opcao != 6);
    }
    public static void Pergunta(String[] args){
        System.out.println("Informe o Numero X!!");
        numeroX = sc.nextDouble();
        System.out.println("Informe o Numero Y!!");
        numeroY = sc.nextDouble();
    }
    
    public static void ValorMaior(String[] args){
        System.out.println("O maior numero é " + Math.max( numeroX,numeroY ));
    }
    
    public static void ValorMenor(String[] args){
        System.out.println("O menor numero é " + Math.min(numeroX,numeroY ));
    }
    
    public static void RaizQuadrada(String[] args){
        System.out.println("A raiz quadrada de X é " + Math.sqrt(numeroX)
        + "A raiz quadrada de Y é " + Math.sqrt(numeroY));
    }

    public static void Potencia(String[] args){
        System.out.println(" X ao cubo : " + Math.pow(2,numeroX)
        + " Y ao quadrado : " + Math.exp(numeroY));
    }

    public static void NumeroAleatorio(String[] args){
        System.out.println("O numero aleatorio é " + Math.random() * 101);
    }
}
