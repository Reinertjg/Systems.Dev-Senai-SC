package Prova;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Questao2 {

    public static void main(String[] args) {

        int cc = 0;
        int yesOrNo = 0;
        double quantidadeMaca = 0.0;
        double valorFinalDaVenda = 0.0;

        do {

            quantidadeMaca = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de maças que deseja comprar!!"));

            if (quantidadeMaca <= 12) {
                valorFinalDaVenda = (quantidadeMaca * 1.30);
            } else {
                valorFinalDaVenda = (quantidadeMaca * 1);
            }

            JOptionPane.showMessageDialog(null, "Custo total da compra : " + valorFinalDaVenda);

            yesOrNo = JOptionPane.showConfirmDialog(null, "Deseja encerrar o programa ?", "Pesquisa", JOptionPane.YES_NO_OPTION);
            if (yesOrNo == JOptionPane.YES_OPTION) {
                cc++;
            }
            
        } while (cc != 1);

    }
}
