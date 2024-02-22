package aula;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float saldoInicial = 0.0f;
        float valorDeposito;
        float saldoAtual;
        float valorRetirada;
        float saldoFinal;

        System.out.println("Digite o valor do depósito: ");
        valorDeposito = sc.nextFloat();

        saldoAtual = valorDeposito;

        System.out.println("Digite o valor do saque: ");
        valorRetirada = sc.nextFloat();

        saldoFinal = saldoAtual - valorRetirada;

        System.out.println("O seu saldo final é de: " + saldoFinal);

    }
}
