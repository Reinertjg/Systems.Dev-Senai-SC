
package javaapplication1;
import javax.swing.JOptionPane;
public class JavaApplication1 {

    public static void main(String[] args) {
        
        String descricaoProduto = "";
        byte codigoProduto = 0;
        
        codigoProduto = Byte.parseByte(JOptionPane.showInputDialog("Informe o codigo do produto."
                + "\n(1, 2, 3 ou 4)"));
        
        switch(codigoProduto){
            case 1 ->{
                descricaoProduto = "Alimento não-perecével";
            }
            case 2 ->{
                descricaoProduto = "Alimento perecével";            
            }
            case 3 ->{
                descricaoProduto = "Vestuário";
            }
            case 4 ->{
                descricaoProduto = "Limpeza";
            }
        }
        
        JOptionPane.showMessageDialog(null, "O produto é: "+descricaoProduto);
        
    }
    
}
