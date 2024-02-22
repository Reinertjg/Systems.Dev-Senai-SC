
package exercicioproximacor;

import javax.swing.JOptionPane;


public class ExercicioProximaCor {

    
    public static void main(String[] args) {
        
        String mensagem = "";
        byte valorAtual = 0;
        
        valorAtual = Byte.parseByte(JOptionPane.showInputDialog("Digite o número da cor atual: \n1 - Vermelho\n2 - Verde\n3 - Amarelo"));
        if (valorAtual == 1){
            mensagem = "Você informou a cor Vermelha e a próxima cor é a Verde";
        } else if (valorAtual == 2){
            mensagem = ("Você informou a cor Verde e a próxima cor é a Amarela");
        } else if (valorAtual == 3){
            mensagem = ("Você informou a cor Amarela e a próxima cor é a Vermelha");
        }else{
            mensagem = ("Você informou um código invalido");
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
}
