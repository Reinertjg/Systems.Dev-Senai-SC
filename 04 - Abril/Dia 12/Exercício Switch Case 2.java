import javax.swing.JOptionPane;

public class Exercício2 {
    public static void main(String[] args) throws Exception {

        Double horasTrabalhadas = 0.0, ganhoHora = 0.0;
        Double ganhoMes = 0.0, ganhoMesExtra = 0.0;
        Double horasExtras = 0.0;
        Double salarioFinal = 0.0;

        horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe quantas horas "
                + "foram trabalhadas por dia"));
        ganhoHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o ganho por hora"));

        int descisao = JOptionPane.showConfirmDialog(null,
                "Informe se a horas extras realizadas",
                null, JOptionPane.YES_NO_OPTION);
        switch (descisao) {
            case 0 -> 
                horasExtras = Double.parseDouble(JOptionPane.showInputDialog("Informe quantas horas extras "
                        + "foram realizadas no mês"))
        }
        ganhoMes = (horasTrabalhadas * ganhoHora)* 28;
        ganhoMesExtra = (horasExtras * ganhoHora);
        salarioFinal = (ganhoMes + ganhoMesExtra);

        JOptionPane.showMessageDialog(null, "Seu salario atual é R$"+salarioFinal);
        // 2- Situação Problema: A jornada de trabalho semanal de um funcionário é de 40
        // horas.
        // O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo
        // cálculo é o valor
        // da hora regular com um acréscimo de 50%.

        // Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o
        // salário por hora
        // e escreva o salário total do funcionário, que deverá ser acrescido das horas
        // extras, caso
        // tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
    }
}
