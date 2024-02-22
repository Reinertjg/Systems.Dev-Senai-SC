package atividades;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercício6 {

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
                JOptionPane.showMessageDialog(null, "Media Final: " + df.format(media));
                
                ss = 1;
                media = 0;
            }else{
                cc++;
            }

        } while (cc != 1);

    }
}
//7. Escreva um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma classe. O
//algoritmo deverá ler, além das notas, o código do aluno e deverá ser encerrado quando o código
//for igual a zero.
