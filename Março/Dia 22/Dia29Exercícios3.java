import javax.swing.JOptionPane;

public class Dia29Exercícios2 {
    public static void main(String[] args) {

        float num1 = 0.0f, num2 = 0.0f;
        float soma = 0.0f, subtração = 0.0f, multiplicação = 0.0f, divisão = 0.0f;

        num1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro numero"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo numero"));

        soma = (num1 + num2);
        subtração = (num1 - num2);
        multiplicação = (num1 * num2);
        divisão = (num1 / num2);

        JOptionPane.showMessageDialog(null, "A soma dos numeros é: "+soma+ 
        "\nA subtração dos numeros é: "+subtração+
        "\nA multiplicação dos numeros é: "+multiplicação+
        "\nA divisão dos numeros é: "+divisão);

// Usando a classe JOptionPane para entrada de dados, elabore 
// uma classe que receba dois valores numéricos (v1 e v2) 
// e apresente em tela o resultado de quatro operações 
// matemáticas básicas entre eles: soma, subtração, divisão e multiplicação.

        
    }
}
