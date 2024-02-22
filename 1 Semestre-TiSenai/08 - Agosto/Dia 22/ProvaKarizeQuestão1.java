package Prova;
import javax.swing.JOptionPane;
public class Questao1 {

    public static void main(String[] args) {
        
        Object[] valores = {"Situação 1", "Situação 2"};
        Object selectedValores = JOptionPane.showInputDialog(null, "Escolha a situação", "Prova",JOptionPane.INFORMATION_MESSAGE,null,valores,valores[0]);
        
        if(selectedValores.equals("Situação 1")){
            Situacao1(args);
        } else {
            Situacao2(args);
        }
    }
    
    static void Situacao1(String[] args){
        
        double quilometragem = 0.0;
        double valorFinal = 0.0;
        
        quilometragem = Double.parseDouble(JOptionPane.showInputDialog("Informe a quilometragem viajada neste Taxi. "));
        
        valorFinal = (quilometragem * 0.65) + 4.2;
        
        JOptionPane.showMessageDialog(null, "Valor Final Da Corrida (COM BANDEIRADA) é: " + valorFinal);
        
    }
    
    static void Situacao2(String[] args){
        
        double quilometragem = 0.0;
        double valorDaCorrida = 14.20;
        
        quilometragem = (valorDaCorrida - 4.2) / 0.65;
        
        JOptionPane.showMessageDialog(null, "Ele viajo " + quilometragem + " Quilômetros");
    }
    
}
