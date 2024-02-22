package prova;

import javax.swing.JOptionPane;

public class NewClass {

    static int deposito;
    static int saque;
    static int saldo;

    public static void main(String[] args) {

        saldo = Integer.parseInt(JOptionPane.showInputDialog("Informe o saldo: "));

        consultarSaldo();
        realizarDeposito();
        realizarSaque();
        emitirExtrato(saldo);

    }//fim main

    public static void consultarSaldo() {
        System.out.println("Seu saldo inicial é: " + saldo);
    }

    public static void realizarDeposito() {
        deposito = Integer.parseInt(JOptionPane.showInputDialog("Realize um deposito: "));
        saldo += deposito;
        System.out.println("O saldo atual com deposito é: " + saldo);
    }

    public static void realizarSaque() {
        saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do saque: "));
        if (saldo >= saque) {

            saldo -= saque;
            System.out.println("O saldo atual com saque é: " + saldo);

        } else {
            System.out.println("Você não possui saldo suficiente nesta conta");
        }

    }

    public static void emitirExtrato(int saldo) {

        System.out.println("Valor da conta: " + saldo);
    }

}
