import javax.swing.JOptionPane;
public class Exercicio3 {

    public static void main(String[] args) {
        
        int ladoA = 0, ladoB = 0, ladoC = 0;

		ladoA = Integer.parseInt(JOptionPane.showInputDialog("Infome o tamanho do lado A: "));
		ladoB = Integer.parseInt(JOptionPane.showInputDialog("Infome o tamanho do lado B: "));
		ladoC = Integer.parseInt(JOptionPane.showInputDialog("Infome o tamanho do lado C: "));

		if (((ladoA + ladoB) > ladoC) && ((ladoB + ladoC) > ladoA) && ((ladoA + ladoC) > ladoB)) {
			if ((ladoA == ladoB) && (ladoB == ladoC)) {
				JOptionPane.showMessageDialog(null, "Triângulo equilátero");
			} else {
				if ((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)) {
					JOptionPane.showMessageDialog(null, "Triângulo isósceles");
				} else {
					JOptionPane.showMessageDialog(null, "Triângulo escaleno");
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Não é possível formar um triângulo com os valores informados");
		}
	}

}
