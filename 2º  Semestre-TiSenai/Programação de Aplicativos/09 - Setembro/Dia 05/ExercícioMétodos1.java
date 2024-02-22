package Métados;

import javax.swing.JOptionPane;

public class AtividadeMetodos {

    static String pular = "\n";
    static int opcaoMenu = 0;
    static int cc = 0;
    static int[] vetor = new int[999];

    public static void main(String[] args) {

        Object[] lista = {"Cadastrar Numeros","Listar Vetor","Números Pares","Números Impares"
                + "Números Pares Posições Ímpares","Números Ímpares Posições Pares","Sair"};
        Object opLista = JOptionPane.showInputDialog(null, "Escolha uma opção", "Lista de opção", JOptionPane.INFORMATION_MESSAGE, null, lista, lista[0]);
        
        String opcao = (String) opLista;
        switch (opcao) {
            case "Cadastrar Numeros" -> AlimentacaoVetor();
            case "Listar Vetor" -> ListarVetor();
            case "Números Pares" -> NumerosPares();
            case "Números Impares" -> NumerosImpares();
        }
        
    }

    public static void ImprimirMenu() {

        opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("***MENU***"
                + pular + " 1 - Listar Vetor"
                + pular + "2 - Números Pares"
                + pular + "3 - Números Impares"
                + pular + "4 - Números pares existem nas posições ímpares"
                + pular + "5 - Números ímpares existem nas posições pares"));

    }

    public static void AlimentacaoVetor() {

        cc = Integer.parseInt(JOptionPane.showInputDialog("Quantas posições voce deseja que o vetor tenha."));

        for (int ii = 0; ii < cc; ii++) {
            vetor[ii] = Integer.parseInt(JOptionPane.showInputDialog("Informe algum numeor. (" + ii + ")"));
        }
    }

    public static void ListarVetor() {

        for (int ii = 0; ii < cc; ii++) {

            JOptionPane.showMessageDialog(null, "Vetor[" + ii + "] = " + vetor[ii]);

        }
    }

    public static void NumerosPares() {

        for (int ii = 0; ii < 10; ii++) {

            if (vetor[ii] % 2 == 0 && vetor[ii] != 0) {
                JOptionPane.showMessageDialog(null, "Vetor[" + ii + "] = " + vetor[ii] + " é par");
            }
        }
    }

    public static void NumerosImpares() {

        for (int ii = 0; ii < 10; ii++) {

            if (vetor[ii] % 2 != 0) {
                JOptionPane.showMessageDialog(null, "Vetor[" + ii + "] = " + vetor[ii] + " é Impar");
            }
        }
    }
}
/*Escreva um programa que deverá ter as seguintes opções: Carregar Vetor - 
Pedir quantas posições o usuário deseja cadastrar e alimentar o vetor
Listar Vetor - mostrar o conteúdo do vetor
Exibir apenas os números pares do vetor
Exibir apenas os números ímpares do vetor
Exibir a quantidade de números pares existem nas posições ímpares do vetor
Exibir a quantidade de números ímpares existem nas posições pares do vetor
Sair
Deverá ser implementado um método para realizar cada uma das opções de 1 a 5.*/
