
package ProvaMetodos;

import java.math.*;
import javax.swing.JOptionPane;

public class MainExercicio3 {
    public static void main(String[] args) {
        int yesOrNo = 0;
        
        while (true) {
            
            double base = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base."));
            
            double altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura."));
            
            
            JOptionPane.showMessageDialog(null, "O valor da Hipotenusa é: "+ Hipotenusa(base, altura));
            
            yesOrNo = JOptionPane.showConfirmDialog(null, "Deseja realizar mais uma calculo?","" ,JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if(yesOrNo == JOptionPane.YES_NO_OPTION){
                JOptionPane.showMessageDialog(null, "Digite os novos valores");
            } else{
                System.exit(0);
            }
        }
        
    }
    
    public static double Hipotenusa (double base, double altura) {
        
        double Hipotenusa = (Math.pow(base, 2)) + (Math.pow(altura, 2));
        
        return Hipotenusa;
        
    }
   
}

    


