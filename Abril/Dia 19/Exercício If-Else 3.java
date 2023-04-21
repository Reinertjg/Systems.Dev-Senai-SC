package javaapplication1;
import javax.swing.JOptionPane;

public class NewClass1 {
    public static void main(String[] args) {
        
        Double valorA = 0.0, valorB = 0.0, valorC = 0.0;;
        Double bhaskara1 = 0.0, bhaskara2 = 0.0;
        Double delta = 0.0;
        String mensagem = "";
        
        valorA = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor A: "));
        valorB = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor B: "));
        valorC = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor C: "));
        
        delta = (Math.pow(valorB, 2)- 4 * (valorA) * (valorC));
        JOptionPane.showMessageDialog(null, delta);
        if(delta > 0){
            bhaskara1 = ((-valorB) + (Math.sqrt(delta))) / ( 2 * valorA);
            bhaskara2 = ((-valorB) - (Math.sqrt(delta))) / ( 2 * valorA);
            mensagem = ("R1 = "+bhaskara1
                    +"\nR2 = "+bhaskara2);
        }
        else{
            mensagem = "Impossivel Calcular";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
        
    }   
}
//Fórmula de Bhaskara
//Leia 3 números de ponto flutuante. Depois, imprima as raízes da fórmula de bhaskara. Caso seja
//impossível calcular as raízes devido a uma divisão por zero ou raiz quadrada de um número negativo,
//apresenta a mensagem “Impossível calcular” .
//Entrada
//Leia 3 números de ponto flutuante (duplo) A, B e C.
//Saída
//Imprima o resultado com 5 dígitos após a vírgula ou a mensagem caso seja impossível calcula
