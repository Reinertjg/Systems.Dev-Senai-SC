
package exercicioproximacorswitch;
import javax.swing.JOptionPane;

public class ExercicioProximaCorSwitch {

   
    public static void main(String[] args) {
        String mensagem = "";
        float valorAtual = 0;
        
        Object[] valores = {"Vermelha", "Verde","Amarela"};
        Object selectedValores = JOptionPane.showInputDialog(null, "Escolha a cor atual", "Cargo",JOptionPane.INFORMATION_MESSAGE,null,valores,valores[0]);
        
        String escolhaCor = (String) selectedValores;
        
        String novoSalario = switch (escolhaCor) {
            case "Vermelha" ->
                "Você informou a cor Vermelha e a próxima cor é a Verde";
            case "Verde" ->
                "Você informou a cor Verde e a próxima cor é a Amarela";
            case "Amarela" ->
                "Você informou a cor Amarela e a próxima cor é a Vermelha";
            default -> "";
        };   
        JOptionPane.showMessageDialog(null, novoSalario);
    }
        
    }


