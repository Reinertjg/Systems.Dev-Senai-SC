import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {

        String nomeViagem1 = "", nomeViagem2 = "", nomeViagem3 = "";
        String NomeMaiorViagem = "", NomeMenorViagem = "";
        Float ViagemKilimetroInicial1 = 0.0f, ViagemKilimetroFinal1 = 0.0f;
        Float ViagemKilimetroInicial2 = 0.0f, ViagemKilimetroFinal2 = 0.0f;
        Float ViagemKilimetroInicial3 = 0.0f, ViagemKilimetroFinal3 = 0.0f; 
        Float CalculomaiorViagem1 = 0.0f, CalculomaiorViagem2 = 0.0f, CalculomairoViagem3 = 0.0f;
        Float MaiorViagem = 0.0f, MenorViagem = 0.0f;

        nomeViagem1 = JOptionPane.showInputDialog("Informe o Nome da Primeira Viagem!");
        ViagemKilimetroInicial1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Kilimetro inicial da Rodovia"));
        ViagemKilimetroFinal1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Kilimetro Final da Rodovia"));

        nomeViagem2 = JOptionPane.showInputDialog("Informe o Nome da Segunda Viagem!");
        ViagemKilimetroInicial2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Kilimetro inicial da Rodovia"));
        ViagemKilimetroFinal2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Kilimetro Final da Rodovia"));

        nomeViagem3 = JOptionPane.showInputDialog("Informe o Nome da Terceira Viagem!");
        ViagemKilimetroInicial3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Kilimetro inicial da Rodovia"));
        ViagemKilimetroFinal3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Kilimetro Final da Rodovia"));

        CalculomaiorViagem1 = (ViagemKilimetroFinal1 - ViagemKilimetroInicial1);
        CalculomaiorViagem2 = (ViagemKilimetroFinal2 - ViagemKilimetroInicial2);
        CalculomairoViagem3 = (ViagemKilimetroFinal3 - ViagemKilimetroInicial3);

        MaiorViagem = CalculomaiorViagem1;
        NomeMaiorViagem = nomeViagem1;
        if (MaiorViagem < CalculomaiorViagem2) {
            MaiorViagem = CalculomaiorViagem2;
            NomeMaiorViagem = nomeViagem2;
        } else if(MaiorViagem < CalculomairoViagem3 ){
            MaiorViagem = CalculomairoViagem3;
            NomeMaiorViagem = nomeViagem3;
        }

        MenorViagem = CalculomaiorViagem1;
        NomeMenorViagem = nomeViagem1;
        if (MenorViagem > CalculomaiorViagem2) {
            MenorViagem = CalculomaiorViagem2;
            NomeMenorViagem = nomeViagem2;
        } else if(MenorViagem > CalculomairoViagem3) {
            MenorViagem = CalculomairoViagem3;
            NomeMenorViagem = nomeViagem3;
        }
        JOptionPane.showMessageDialog(null, "A maior viagem é a "+NomeMaiorViagem+" tem "+MaiorViagem+" Kilometros");
        JOptionPane.showMessageDialog(null, "A maior viagem é a "+NomeMenorViagem+" tem "+MenorViagem+" Kilometros");


       
//Crie um algoritmo para realizar a entrada de três viagens distintas e solicite para cada viagem os seguintes campos:
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
//Ao final o programa deverá informar o valor em kilometros da maior viagem e da menor viagem.
//
//Exemplo de resultado esperado:
//
//-> A maior viagem é a "viagem a praia" tem "48" kilometros
//
//-> A menor viagem a "viagem ao sitio " tem "10" kilometros

    }
}
