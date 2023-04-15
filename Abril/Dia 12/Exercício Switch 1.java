import javax.swing.JOptionPane;

public class Exercício1 {
    public static void main(String[] args) throws Exception {

        String nomeCargo = "";
        Double salario = 0.0;
        Double aumentoSalario = 0.0, novoSalario = 0.0;
        int codigoCargo = 0;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu Salario!!"));
        codigoCargo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cargo"
                + "\n(Digite 1 para Serviços Gerai) "
                + "\n(Digite 2 para Vigia) "
                + "\n(Digite 3 para Recepcionista) "
                + "\n(Digite 4 para Vendedor) "));

        switch (codigoCargo) {
            case 1 -> {
            aumentoSalario = salario * 0.50;
            nomeCargo = "Serviços Gerai";
            novoSalario = salario + aumentoSalario;
            }
            case 2 -> {
            aumentoSalario = salario * 0.30;
            nomeCargo = "Vigia";
            novoSalario = salario + aumentoSalario;
            }
            case 3 -> {
            aumentoSalario = salario * 0.25;
            nomeCargo = "Recepcionista";
            novoSalario = salario + aumentoSalario;
            }
            case 4 -> {
            aumentoSalario = salario * 0.15;
            nomeCargo = "Vendedor";
            novoSalario = salario + aumentoSalario;
            }
            default -> JOptionPane.showMessageDialog(null, "Código do cargo não encontrado");
        };
        
        JOptionPane.showMessageDialog(null, "Nome do cargo: "+nomeCargo
                +"\nValor do acrecentado: "+aumentoSalario
                +"\nNovo Salario: "+novoSalario);
        // Calcular o aumento de salário de acordo com o cargo. Ler salário e o código
        // do cargo.
        // Calcular o aumento salarial de acordo com o cargo da pessoa conforme a tabela
        // abaixo.
        // Imprimir o nome do cargo, o valor do aumento e o novo salário.
    }
}
