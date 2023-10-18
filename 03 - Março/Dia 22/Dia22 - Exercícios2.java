import javax.swing.JOptionPane;

public class Dia29Exercícios2 {
    public static void main(String[] args) {

        float deposito = 0.0f, saldo = 0.0f, débito = 0.0f;

        var yesOrNo = JOptionPane.showConfirmDialog(null, "Deseja abrir uma conta bancaria?");
        if (yesOrNo == 0) {
            
            String nome = JOptionPane.showInputDialog("Informe seu nome completo");
            deposito = Float.parseFloat(JOptionPane.showInputDialog("Olá " + nome +
                    "\nInfome um valor de deposito em sua conta"));

            saldo = +deposito;
            JOptionPane.showMessageDialog(null, "Seu saldo atual é: " + saldo);

            débito = Float.parseFloat(JOptionPane.showInputDialog("Infome um valor de retirada em sua conta"));
            saldo = (saldo - débito);

            JOptionPane.showMessageDialog(null, "Seu saldo atual é: " + saldo);
        }

        // Usando a classe Scanner para entrada de dados, faça uma classe que simule a
        // abertura de uma conta bancária cujo saldo inicial é
        // zero. A seguir, simule um deposito num valor qualquer e mostre o saldo atual.
        // Depois disso, simule uma retirada(débito), qualquer
        // e apresente o saldo final.

    }
}
