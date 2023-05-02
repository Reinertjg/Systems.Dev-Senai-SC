import javax.swing.JOptionPane;

public class Exercício1 {
    public static void main(String[] args) throws Exception {

        int idade = 0;
        int numero = 0;
        double media = 0.0, mediageral = 0.0;

        do{
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade!"
                +"\nDigite -1 para sair!"));
            if(idade > 0){
                media += idade;
                numero++;
            }

        }while(idade != -1);
        
        mediageral = (media / numero);
        JOptionPane.showMessageDialog(null, "A Media é "+mediageral);
            
        


        // Faça um programa que receba a idade de várias pessoas e calcule a média. O programa deve parar de pedir a idade quando o usuário digitar a idade -1.


    }
}
