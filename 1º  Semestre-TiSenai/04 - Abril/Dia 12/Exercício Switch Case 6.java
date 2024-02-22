
package javaapplication1;
import javax.swing.JOptionPane;
public class JavaApplication1 {

    public static void main(String[] args) {
        
        String letra = "";
        
        letra = JOptionPane.showInputDialog("Informe uma letra minúscula");
        
        switch(letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                JOptionPane.showMessageDialog(null, "Sua letra é uma vogal");
            break;
            default:
                JOptionPane.showMessageDialog(null, "Sua letra é uma consoante");
            break;
        }
//Dada uma letra, escreva na tela se essa letra é uma vogal ou consoante (considerar apenas letras minúsculas).
    }
    
}
