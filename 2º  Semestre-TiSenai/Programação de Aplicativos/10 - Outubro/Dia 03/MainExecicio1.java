package ProvaMetodos;

import javax.swing.JOptionPane;

public class MainExecicio1 {

    public static void main(String[] args) {
        
        MetodoExercici1.Login();
        
        Object[] opcao = {"Exibir Saldo", "Sacar", "Depositar", "Sair"};

        while (true) {

            Object opEscolhida = JOptionPane.showInputDialog(null, "Escolha uma Opção", "Lista Opções", JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);

            String op = (String) opEscolhida;

            switch (op) {
                case "Exibir Saldo" ->
                    JOptionPane.showMessageDialog(null, MetodoExercici1.SaldoAtual());

                case "Sacar" ->
                    MetodoExercici1.Sacar();

                case "Depositar" ->
                    MetodoExercici1.Depositar();

                case "Sair" -> {
                    JOptionPane.showMessageDialog(null, MetodoExercici1.sair());
                    System.exit(0);
                }
            }
        }
    }
}
