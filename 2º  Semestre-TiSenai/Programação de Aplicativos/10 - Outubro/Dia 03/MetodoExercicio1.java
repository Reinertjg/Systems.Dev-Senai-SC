package ProvaMetodos;

import javax.swing.JOptionPane;

class MetodoExercici1 {

    static double saldo = 0.0;
    static int contDepositar = 0;
    static int contSacar = 0;
    static double valorTotalDepositar = 0;
    static double valorTotalSacar = 0;
    static int banco_numeroDaConta = 12345;
    static int banco_senhaDaConta = 123;

    public static void Login() {

        int numeroDaConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta!"));

        int senhaDaConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o senha da conta!"));

        if (banco_numeroDaConta == numeroDaConta && banco_senhaDaConta == senhaDaConta) {
            JOptionPane.showMessageDialog(null, "Acesso Liberado");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso Negado");
            System.exit(0);
        }
    }

    public static String SaldoAtual() {
        return "Seu saldo atual é: " + saldo;
    }

    public static double Sacar() {

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar"));

        valorTotalSacar = valorTotalSacar + valor;
        contSacar++;

        return saldo = saldo - valor;
    }

    public static double Depositar() {

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar"));

        valorTotalDepositar = valorTotalDepositar + valor;
        contDepositar++;

        return saldo = saldo + valor;
    }

    public static String sair() {
        String PositivoOuNegativo;
        String conteudo = "";
        if(saldo >= 0) {
            PositivoOuNegativo = "Positivo";
        } else {
            PositivoOuNegativo = "Negativo";
        }
        conteudo = "Número da conta: " + banco_numeroDaConta + "\n"
                + "Quantidade de Deposíto: " + contDepositar + "\n"
                + "Valor total de Deposíto: " + valorTotalDepositar + "\n"
                + "Quantidade de Saques: " + contSacar + "\n"
                + "Valor total de Saque: " + valorTotalSacar + "\n"
                + "Saldo: " + saldo + "\n" 
                + "Saldo: " + PositivoOuNegativo;

        return conteudo;
    }
}
