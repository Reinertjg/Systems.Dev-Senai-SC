package metodos;

import javax.swing.JOptionPane;

public class Metodos {

    public static void main(String[] args) {

        //descobrir qual tamanho do vetor
        int tamVetor = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas posições deseja no vetor: "));
        //criação do vetor
        int[] numeros = new int[tamVetor];
        //alimentar vetor
        for (int i = 0; i < tamVetor; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: " + (i + 1)));

        }

        listaVetor(numeros);
        listarNumerosPares(numeros);
        listarNumerosImpares(numeros);
        listarNumerosParesPosicaoImpar(numeros);
        listaNumerosParesPosicaoPar(numeros);

    }

    //lista vetor
    public static void listaVetor(int[] numerosDigitados) {
        for (int i = 0; i < numerosDigitados.length; i++) {
            System.out.println("Numero: " + numerosDigitados[i]);

        }

    }

    //numeros pares
    public static void listarNumerosPares(int[] numeros) {
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Numero par: " + numeros[i]);
                cont++;
            }
        }

        System.out.println("quantidade de numeros pares: " + cont);

    }

    public static void listarNumerosImpares(int[] num) {
        int cont = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.println("Numero impar: " + num[i]);
                cont++;
            }

        }
        System.out.println("quantidade de numeros impares: " + cont);

    }
    public static void listarNumerosParesPosicaoImpar(int[]num2){
        for (int i = 0; i < num2.length; i++) {
            if(i % 2 == 0 && num2[i] % 2 != 0){
                System.out.println("Posiçao: " + i +" Valor impar = "+num2[i]);
            }
        }
    }
    public static void listaNumerosParesPosicaoPar(int[]num3){
         for (int i = 0; i < num3.length; i++) {
            if(i % 2 == 0 && num3[i] % 2 != 0){
                System.out.println("Posiçao: " + i +" Valor impar = "+num3[i]);
            }
        }
    }
}
