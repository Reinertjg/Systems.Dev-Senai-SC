
package atividades;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercício9 {
    public static void main(String[] args) {
         DecimalFormat df = new DecimalFormat();
        df.applyPattern("##.00");

        String message = "";
        int cc = 0, ss = 1;
        double nota = 0.0;
        double media = 0.0;

        do {

            nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota " + ss + " (Digite (-1) para encerrar o programa)"));
            ss++;
            media += nota;
            if (ss == 4 && nota > 0) {
                media /= 3;

                if (media > 5) {
                    message = "Aprovado";
                } else {
                    message = "Reprovado";
                }
                JOptionPane.showMessageDialog(null, "Media Final: " + df.format(media) + " " + message);

                ss = 1;
                media = 0;
            }else{
                cc++;
            }
            
            media += nota;
        } while (cc != 1);
    }
}
