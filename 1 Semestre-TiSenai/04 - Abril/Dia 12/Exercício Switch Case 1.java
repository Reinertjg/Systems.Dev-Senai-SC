import javax.swing.JOptionPane;

public class JavaApplication1 {
    public static void main(String[] args) throws Exception {

        String nomeCargo = "";
        Double salario = 0.0;
        String  novoSalario = "";
        String codigoCargo = "";
        
        Object[] valores = {"Serviços Gerai","Vigia","Recepcionista","Vendedor"};
        Object selectedValores = JOptionPane.showInputDialog(null, "Escolha seu cargo", ""
                + "Cargo", JOptionPane.INFORMATION_MESSAGE,null,valores,valores[2]);
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu Salario!!"));
        codigoCargo = (String) selectedValores;

        novoSalario = switch (codigoCargo) {
            case "Serviços Gerai" -> 
                "Seu cargo é Serviços Gerai"
                +"\nAumento R$" + (salario * 0.50) + ""
                +"\nNovo Salario" + (salario + (salario * 0.50));
            case "Vigia" -> 
                "Seu cargo é Vigia"
                +"\nAumento R$" + (salario * 0.30) + ""
                +"\nNovo Salario" + (salario + (salario * 0.30));
            case "Recepcionista" -> 
                "Seu cargo é Recepcionista"
                +"\nAumento R$" + (salario * 0.25) + ""
                +"\nNovo Salario" + (salario + (salario * 0.25));
            case "Vendedor" -> 
                 "Seu cargo é Recepcionista"
                +"\nAumento R$" + (salario * 0.15) + ""
                +"\nNovo Salario" + (salario + (salario * 0.15));
            default -> 
                "Código do cargo não encontrado";
        };
        
        JOptionPane.showMessageDialog(null, novoSalario);
        // Calcular o aumento de salário de acordo com o cargo. Ler salário e o código
        // do cargo.
        // Calcular o aumento salarial de acordo com o cargo da pessoa conforme a tabela
        // abaixo.
        // Imprimir o nome do cargo, o valor do aumento e o novo salário.
    }
}
