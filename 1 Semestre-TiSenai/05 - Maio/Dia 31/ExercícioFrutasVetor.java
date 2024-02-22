package javaapplication1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class vetores3 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("00.##");
        
        String[] frutas = new String[5];
        float[] valores = new float[5];
        int[] qtfrutas = new int[5];

        for (int ii = 0; ii < 5; ii++) {
            frutas[ii] = JOptionPane.showInputDialog("Nome das Frutas:");
            valores[ii] = Float.parseFloat(JOptionPane.showInputDialog("Valores da/o : " + frutas[ii]));
            qtfrutas[ii] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade da/o : " + frutas[ii]));

        }
        for (int cc = 0; cc < 5; cc++) {
            JOptionPane.showMessageDialog(null, "Nome da fruta: " + frutas[cc] + "\n"
                    + "Valor da/o " + frutas[cc] + ": " + valores[cc] + "\n"
                    + "Quantidade total da/o " + frutas[cc] + ": " + qtfrutas[cc] +"\n"
                    + "Recibo da/o "+ frutas[cc] + ": " + df.format(valores[cc]* qtfrutas[cc])+ " Reais");
                     
            

        }
    }

}
