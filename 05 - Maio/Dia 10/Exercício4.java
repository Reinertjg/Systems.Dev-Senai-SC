package dia07;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercício4 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("##.00");
        
        int  contador = 0;
        double numeros = 0;
        double media = 0.0;

        do{
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero positivo para a media ((-1) encerra o calculo)"));

            if (numeros > 0) {
                media += numeros;
                contador++;
            }

        }while(numeros != -1);

        
        JOptionPane.showMessageDialog(null, "Media Geral: " + df.format((media / contador)));

    }
}
