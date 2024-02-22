import javax.swing.JOptionPane;
public class ExercícioDoWhile8_1 {
    public static void main(String[] args) {
        
        int senha = 0;
        int login = 0;
        
        
        senha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha numerica"));
        
        while(senha != login){
        
        login = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha numerica novamente"));
        if(senha != login){
            JOptionPane.showMessageDialog(null, "Senha Invalidaa");
        }
        
        }
        
        JOptionPane.showMessageDialog(null, "Senha Correta");
    }
}
//Faça um programa que peça ao usuário para digitar uma senha. O programa deve continuar pedindo a senha até que o
//usuário digite a senha correta. Utilize a estrutura de repetição while.
