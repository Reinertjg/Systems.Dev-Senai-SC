package ProvaMetodos;

import javax.swing.JOptionPane;

public class MainExecicio2 {

    public static void main(String[] args) {

        int[] vetor = null;

        Object[] opcao = {"Alimentar Vetor", "Listar Vetor", "Números pares", "Números ímpares", "Quantidade Números pares nas posições impares", "Quantidade números impares nas posições pares", "Sair"};

        while (true) {

            Object opEscolhida = JOptionPane.showInputDialog(null, "Escolha uma Opção", "Lista Opções", JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);

            String op = (String) opEscolhida;

            switch (op) {
                case "Alimentar Vetor" -> {

                    vetor = new int[10];

                    for (int ii = 0; ii < 10; ii++) {
                        vetor[ii] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição " + ii + ":"));
                    }
                }

                case "Listar Vetor" ->
                    MetodoExercicio2.listarVetor(vetor);

                case "Números pares" ->
                    MetodoExercicio2.exibirNumerosPares(vetor);

                case "Números ímpares" ->
                    MetodoExercicio2.exibirNumerosImpares(vetor);

                case "Quantidade Números pares nas posições impares" -> {
                    String paresNasPosicoesImpares = MetodoExercicio2.contarParesNasPosicoesImpares(vetor);

                    JOptionPane.showMessageDialog(null, paresNasPosicoesImpares);
                }

                case "Quantidade números impares nas posições pares" -> {
                    String imparesNasPosicoesPares = MetodoExercicio2.contarImparesNasPosicoesPares(vetor);

                    JOptionPane.showMessageDialog(null, imparesNasPosicoesPares);
                }

                case "Sair" -> {
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");

                    System.exit(0);
                }

                default ->
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }
}
