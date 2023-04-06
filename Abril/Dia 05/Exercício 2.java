import javax.swing.JOptionPane;

public class Exercício2 {
    public static void main(String[] args) {

        float numero1 = 0.0f, numero2 = 0.0f, numero3 = 0.0f;
        float Resultado = 0.0f;

        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o Primeiro Numero!"));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o Segundo Numero!"));
        numero3 = Float.parseFloat(JOptionPane.showInputDialog("Informe o Terceiro Numero!"));

        Resultado = ((numero1 + numero2) * numero3);

        JOptionPane.showMessageDialog(null, "O Resultado dos Numeros é: "+Resultado);
//2 . Crie uma classe Calculo utilizando a classe JOptionPane, que receba três números, some os dois primeiros e multiplique o resultado pelo terceiro 
// à (valor1 + valor2) * valor 3, mostre em tela o resultado

        
    }
}
