import javax.swing.JOptionPane;

public class Exercício1 {
    public static void main(String[] args) throws Exception {

        int cc = 1;
        double numero = 0.0, numerosNegativos = 0.0;

        do{
            numero = Double.parseDouble(JOptionPane.showInputDialog("Digite 5 numeros (POSITIVOS OU NEGATIVOS) "+cc+"/5")); 
            if(numero < 0){
                numerosNegativos++;
            }
            cc++;
        }while(cc != 6);

        JOptionPane.showMessageDialog(null, "Voce digitou "+numerosNegativos+" numeros negativos");

    }
}
// 1. Escrever um algoritmo que lê 5 valores para a, um de cada vez, e conta quantos destes
// valores são negativos, escrevendo esta informação.
