import javax.swing.JOptionPane;
public class Dia29Exercícios2 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, num3 = 0;
        int menor = 0, medio = 0, maior = 0;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Primeiro Número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Segundo Número"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Terceiro Número"));

        menor = num1;
        if(menor > num2){
            menor = num2;
        }if(menor > num3){
            menor = num3;
        }

        if((num1 > num2 && num1 < num3) || (num1 > num3) && (num1 < num2)){
            medio = num1;
        }
        else if((num2 > num1 && num2 < num3) || (num2 > num3) && (num2 < num1)){
            medio = num2;
        }
        else{
            medio = num3;
        }
           
        maior = num1;
        if(maior < num2){
            maior = num2;
        }if(maior < num3){
            maior = num3;
        }
        
        JOptionPane.showMessageDialog(null, "O Menor Numero é: "+menor+
            "\nO Numero Medio é: "+medio+
            "\nO Maior Numero é: "+maior);

// Criar uma classe que recebe 3 inteiros e encontra o:

// menor
// médio
// maior
    
// Use a estrutura condicional If, else If e Else
        
    }
}
