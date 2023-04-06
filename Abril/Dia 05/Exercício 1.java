import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {

		int Numero_Conta = 0;
		String Nome = "";
		float Deposito = 0.0f;
		float saque = 0.0f;
		float saldo = 0.0f;
		
		Numero_Conta = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Numero da Conta!"));
		Nome = JOptionPane.showInputDialog(null, "Informe o Nome da Conta!");
		Deposito = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Valor do Deposito!"));
		saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Valor do Saque!"));
		JOptionPane.showMessageDialog(null, "Saldo Final: "+(Deposito - saque));
// 1 .  Crie uma classe BancoAluno que recebe:
// numero_Conta  - int
// nome - String
// deposito - float
// saque - float
// saldo - float
// Utilizando a classe JOptionPane para alimentar cada um destes atributos acima.
// Ao final imprima na tela, com a classe JOptioPane o numero da conta, o nome do cliente o seu valor de deposito e seu valor de saque e o saldo final.

	}

}
