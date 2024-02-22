import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {

        String nomeViagem1 = "", nomeViagem2 = "";
        Float ViagemKilimetroInicial1 = 0.0f, ViagemKilimetroFinal1 = 0.0f;
        Float ViagemKilimetroInicial2 = 0.0f, ViagemKilimetroFinal2 = 0.0f;
        Float CalculomaiorViagem1 = 0.0f, CalculomaiorViagem2 = 0.0f;
        Float MaiorViagem = 0.0f;

        nomeViagem1 = JOptionPane.showInputDialog("Informe o Nome da Primeira Viagem!");
        ViagemKilimetroInicial1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Kilimetro inicial da Rodovia"));
        ViagemKilimetroFinal1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Kilimetro Final da Rodovia"));

        nomeViagem2 = JOptionPane.showInputDialog("Informe o Nome da Segunda Viagem!");
        ViagemKilimetroInicial2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Kilimetro inicial da Rodovia"));
        ViagemKilimetroFinal2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Kilimetro Final da Rodovia"));

        CalculomaiorViagem1 = (ViagemKilimetroFinal1 - ViagemKilimetroInicial1);
        CalculomaiorViagem2 = (ViagemKilimetroFinal2 - ViagemKilimetroInicial2);

        if (CalculomaiorViagem1 > CalculomaiorViagem2) {
            MaiorViagem = CalculomaiorViagem1;
        } else {
            MaiorViagem = CalculomaiorViagem2;
        }

        JOptionPane.showMessageDialog(null, "A maior viagem a tem "+MaiorViagem+" Kilometros");

      
//Crie um algoritmo para realizar a entrada de duas viagens distintas e solicite para cada viagem os seguintes campos:
//
//- Nome da viagem
//
//- Kilometro inicial da rodovia
//
//- Kilometro final da rodovia
//
//A viagem se dará sempre na mesma rodovia porém o kilometro inicial e final será sempre relativo á rodovia.
//
//A rodovia inicia em kilometro 1 e termina no kilometro 99.
//
//Exemplo de viagens:
//
//Nome da viagem: viagem ao sitio 
//
//Kilometro inicial: 10
//
//kilometro final 20
//
//-------------------------------------
//
//Nome da viagem: viagem a praia
//
//Kilometro inicial: 2
//
//kilometro final 50
//
//--------------------------------------
//
//Ao final o programa deverá informar o valor em kilometros da maior viagem.
//
//Exemplo de resultado esperado:
//
//-> A maior viagem a tem 48 kilometros       
        

    }
}
