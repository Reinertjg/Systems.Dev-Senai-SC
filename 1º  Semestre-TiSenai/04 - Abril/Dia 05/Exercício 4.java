import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {

        Double numero1 = 0.0, numero2 = 0.0;
        Double soma_De_Raiz_Quadrada = 0.0;

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o Primeiro Numero!"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o Segundo Numero!"));

        soma_De_Raiz_Quadrada = (Math.sqrt(numero1) + Math.sqrt(numero2));

        JOptionPane.showMessageDialog(null, "A soma das Raizes é: "+soma_De_Raiz_Quadrada);
      
// 4 . Crie uma classe soma_De_Raiz_Quadrada, utilizando a classe JOptionPane, que receba dois valores inteiros (variáveis A e B) e imprima em tela o 
// resultado do quadrado do primeiro valor (variável A) mais o quadrado do segundo valor (variável B).
    }
}
