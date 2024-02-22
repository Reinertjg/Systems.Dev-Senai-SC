public class Exercício5 {
    public static void main(String[] args) {
        
        float valorA = 0.0f, valorB = 0.0f;
        float troca_De_Lugar = 0.0f;
        
        valorA = Float.parseFloat(JOptionPane.showInputDialog("Informe a variavelA :"));
        valorB = Float.parseFloat(JOptionPane.showInputDialog("Informe o variavelB :"));

        troca_De_Lugar = valorB;
        valorB = valorA;
        valorA = troca_De_Lugar;

        JOptionPane.showMessageDialog(null, "O valor da variavelA: "+valorA+
            "\n O valor da variavelB: "+valorB);
        

// 5 . Cria uma classe troca_De_Lugar que receba dois valores para as variáveis A e B, e efetuar a troca dos valores de forma que a variável A passe a
// possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Imprimir os valores trocados.
    }
}
