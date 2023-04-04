import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {

		float numero1 = 0.0f, numero2 = 0.0f, numero3 = 0.0f, numero4 = 0.0f, numero5 = 0.0f;
		int QuantidadePositiva = 0, QuantidadeNegativa = 0;

		numero1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Primeiro Numero: "));
		numero2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Segundo Numero: "));
		numero3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Terceiro Numero: "));
		numero4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Quarto Numero: "));
		numero5 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Quinto Numero: "));

		if (numero1 >= 0) {
			QuantidadePositiva += 1;
		} else {
			QuantidadeNegativa += 1;
		}
		if (numero2 >= 0) {
			QuantidadePositiva += 1;
		} else {
			QuantidadeNegativa += 1;
		}
		if (numero3 >= 0) {
			QuantidadePositiva += 1;
		} else {
			QuantidadeNegativa += 1;
		}
		if (numero4 >= 0) {
			QuantidadePositiva += 1;
		} else {
			QuantidadeNegativa += 1;
		}
		if (numero5 >= 0) {
			QuantidadePositiva += 1;
		} else {
			QuantidadeNegativa += 1;
		}

		JOptionPane.showMessageDialog(null, "A quantidade de numeros positivos é: " + QuantidadePositiva +
				"\nA quantidade de numeros negativos é: " + QuantidadeNegativa);
		// Situação problema:
		//
		// Crie um algoritmo que realize a entrada de 5 números.
		//
		// Processe as entradas e contabilize quando números são negativos e quantos
		// números são positivos.
		//
		// Ao final imprima a quantidade de números de cada tipo.
		//
		// ----------------------------------------------------------------------------
		//
		// Informe o numero 1: ___
		//
		// Informe o numero 2: ___
		//
		// Informe o numero 3: ___
		//
		// Informe o numero 4: ___
		//
		// Informe o numero 5: ___
		//
		// Quantidade de números negativos: 3
		//
		// Quantidade de números positivos: 2
	}

}
