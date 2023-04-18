import javax.swing.JOptionPane;

public class Exercício3 {
    public static void main(String[] args) {
        
        String tipoGasolina = "";
        double quantidadeLitros = 0.0f;
        double valorFinal = 0.0f;
        double alcool = 2.90f, gasolina = 3.30f;
        
        tipoGasolina = JOptionPane.showInputDialog("Informe o tipo de combustivel\n(Digite A-álcool, G-gasolina)");
        quantidadeLitros = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros foram vendidos!"));
        
        switch(tipoGasolina){
            case "g" -> {
                if(quantidadeLitros <= 20){
                    valorFinal = (quantidadeLitros *(gasolina-(gasolina * 0.04)));
                }
                else{
                    valorFinal = (quantidadeLitros *(gasolina-(gasolina * 0.06)));
                }
            }
            case "a" -> {
                if(quantidadeLitros <= 20){
                    valorFinal = (quantidadeLitros *(alcool-(alcool * 0.03)));
                }
                else{
                    valorFinal = (quantidadeLitros *(alcool-(alcool * 0.04)));
                }
            }
        }
        JOptionPane.showMessageDialog(null, "O valor da venda é: R$"+valorFinal);
    //3- Situação Problema: Um posto está vendendo combustíveis com a seguinte tabela de descontos:
    //Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
    //(codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a
    //ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o 
    //preço do litro do álcool é R$ 2,90.        
    }
}
