public class Exercício3 {
    public static void main(String[] args) {
        
        float raizQuadrada = 0.0f;

        raizQuadrada = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Numere!"));

        JOptionPane.showMessageDialog(null, "O Resultado da Raiz Quadrado é: "+(Math.sqrt(raizQuadrada)));

// 3 . Crie uma classe raizQuadrada que utilizando a classe JOptionPanea receba um número inteiro e apresentar o 
//resultado do quadrado desse número.
    }
}
