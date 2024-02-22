
import javax.swing.JOptionPane;

public class Dia05Abril {

    public static void main(String[] args) {

        String nome = "";
        int numeroConta = 0;
        int op = 1;
        float deposito = 0.0f;
        float saque = 0.0f;
        float saldo;

        numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero da conta"));
        nome = JOptionPane.showInputDialog(null, "Informe o Nome da Conta!");
        deposito = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Valor do Deposito!"));
        saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Valor do Saque!"));
        saldo = deposito;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja observar?"
                    + "\n2 = DEPOSITAR"
                    + "\n3 = SAQUEAR"
                    + "\n4 = SALDO"
                    + "\n5 = SAIR"));

            switch (op) {
                case 2 ->
                    saldo += Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Valor do Deposito!"));
                case 3 ->
                    saldo -= Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Valor do Saque!"));
                case 4 ->
                    JOptionPane.showMessageDialog(null, "Saldo: " + saldo);
                case 5 ->
                    op = 5;
                default ->
                    op = 5;
            };

        } while (op != 5);

        JOptionPane.showMessageDialog(null, "-----------------------"
                + "\n     Banco Jão"
                + "\n -----------------------"
                + "\nNumero da Conta: " + numeroConta
                + "\nNome do cliente: " + nome
                + "\nSaldo Inicial: " + deposito
                + "\nSaldo atual: " + saldo);
        JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso Banco!!");

        System.exit(0);
    }

}
