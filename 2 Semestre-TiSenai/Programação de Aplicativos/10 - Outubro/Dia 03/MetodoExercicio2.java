package ProvaMetodos;

import javax.swing.JOptionPane;

class MetodoExercicio2 {
     public static void listarVetor(int[] vetor) {

        if (vetor == null) { 
            JOptionPane.showMessageDialog(null, "Vetor não carregado.");
            
        }

        String conteudo = "";

        for (int ii = 0; ii < 10; ii++) {

            conteudo += "Posição " + ii + ": " + vetor[ii] + "\n";
        }

        JOptionPane.showMessageDialog(null, "Conteúdo do vetor:\n" + conteudo);
    }


    public static void exibirNumerosPares(int[] vetor) {

        if (vetor == null) {
            JOptionPane.showMessageDialog(null, "Vetor não carregado.");
            
        }

        String numPares = "";

        for (int ii = 0; ii < 10; ii++) {

            if (vetor[ii] % 2 == 0) {

                numPares += "Posição " + ii + ": " + vetor[ii] + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, "Números pares do vetor:\n" + numPares);
    }

    public static void exibirNumerosImpares(int[] vetor) {

        if (vetor == null) {
            JOptionPane.showMessageDialog(null, "Vetor não carregado.");
            
        }

        String numImpares = "";

        for (int ii = 0; ii < 10; ii++) {

            if (vetor[ii] % 2 != 0) {

                numImpares += "Posição " + ii + ": " + vetor[ii] + "\n";
            }

        }

        JOptionPane.showMessageDialog(null, "Números ímpares do vetor:\n" + numImpares);
    }

    public static String contarParesNasPosicoesImpares(int[] vetor) {

        if (vetor == null) {

            return "Vetor não carregado.";
        }

        int cc = 0;

        for (int ii = 1; ii < 10; ii += 2) {

            if (vetor[ii] % 2 == 0) {

                cc++;
            }
        }

        return "Números pares nas posições impares:\n" + cc;
    }

    public static String contarImparesNasPosicoesPares(int[] vetor) {
       
        if (vetor == null) {

            return "Vetor não carregado.";
        }

        int cc = 0;

        for (int ii = 0; ii < 10; ii += 2) {

            if (vetor[ii] % 2 != 0) {

                cc++;
            }
        }
        //retorna valor de String
        return "Números impares nas posições pares:\n" + cc;
    }
}


