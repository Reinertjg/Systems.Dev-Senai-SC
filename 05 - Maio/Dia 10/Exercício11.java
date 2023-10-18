package javaapplication1;
import javax.swing.JOptionPane;
public class JavaApplication1 {

    public static void main(String[] args) {
       
        int cc = 0;
        int tab = 0;
        int valorN = 0;
        
        valorN = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a tabuada"));
        
        for(cc = 1; cc<=valorN; cc++)
        {
            tab = cc*valorN;
            JOptionPane.showMessageDialog(null, valorN+" x "+cc+" = "+tab);
        }
    }
}
//12. Escrever um algoritmo que leia 20 valores para uma variável n e, para cada um deles, calcule
//a tabuada de 1 até n. Mostre a tabuada na forma:
//1 x n = n
//2 x n = 2n
//3 x n = 3n
//.......
//n x n = n2
