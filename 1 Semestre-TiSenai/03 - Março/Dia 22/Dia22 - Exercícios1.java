import javax.swing.JOptionPane;
public class Dia29Exercícios2 {
    public static void main(String[] args) {

        float base = 0.0f, altura = 0.0f;
        float area = 0.0f;

        altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do triangulo"));
        base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base do tringulo"));
        
        area = (( base * altura)/2);

        JOptionPane.showMessageDialog(null, "A area do triangulo é: "+area);
// Utilizando a classe Scanner para a entrada de dados, crie uma classe que 
// receba o valor da base e da altura de um triângulo e mostre sua área. A área 
// do triangulo retângulo é calculada por meio da formula: área = base * altura / 2

    }
}
