import javax.swing.JOptionPane;
public class Exercício5 {

    public static void main(String[] args) {
        
        String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
        String palavraInvertida = "";
        int i = palavra.length() - 1;

        do {
            palavraInvertida += palavra.charAt(i);
            i--;
        } while (i >= 0);

        JOptionPane.showMessageDialog(null, "A palavra invertida é: " + palavraInvertida);
    }
}
//Faça um programa que peça ao usuário para digitar uma palavra e, em seguida, imprima a palavra invertida. Utilize a estrutura de repetição do-while.
