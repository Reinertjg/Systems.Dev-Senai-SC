package javaapplication3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class JavaApplication3 {

    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat();
        
        String nomeAluno = "";
        String menssagemExercicio;
        Double valorDoPlano = 0.0;
        Double descontoValor = 0.0;
        Double imcAluno = 0.0, caloriasSemanais = 0.0;
        Double alturaAluno = 0.0, pesoAluno = 0.0;
        Double musculacaoValor = 80.0, corridaValor = 20.0, bicicleta = 30.0;

        nomeAluno = JOptionPane.showInputDialog("Digite o Nome do Aluno: ");
        pesoAluno = Double.parseDouble(JOptionPane.showInputDialog("Digite o Peso do Aluno em quilos: "));
        alturaAluno = Double.parseDouble(JOptionPane.showInputDialog("Digite o Alura do Aluno em metros (Ex: 1.72): "));
        caloriasSemanais = Double.parseDouble(JOptionPane.showInputDialog("Digite o quantidade de calorias a serem gastas na semana: "));

        if (caloriasSemanais <= 450) {
            menssagemExercicio = "\n Musculação: " + (caloriasSemanais) + " calorias";
            valorDoPlano = musculacaoValor;
        } else if (caloriasSemanais <= 1850) {
            menssagemExercicio = "\n- Musculação: 450.0 calorias"
                    + "\n- Corrida: " + (caloriasSemanais - 450) + " calorias";
            valorDoPlano = musculacaoValor + corridaValor;
        } else {
            menssagemExercicio = "\n- Musculação: 450.0 calorias"
                    + "\n- Corrida: 1400.0 calorias"
                    + "\n- Bicicleta ergonômica: "+(caloriasSemanais - 1850) + " calorias";
        }
        if (caloriasSemanais >= 4000) {
            descontoValor = (valorDoPlano / 2);
        }

        imcAluno = pesoAluno / Math.pow(alturaAluno, 2);
        df.applyPattern("##.00");
        
        JOptionPane.showMessageDialog(null, "-----------------------------------"
                + "\nIMC: "+df.format(imcAluno)
                + "\nLista de Exercício: "+menssagemExercicio
                + "\nValor do Plano: "+valorDoPlano
                + "\nValor do Desconto: "+descontoValor
                + "\nValor Total: "+(valorDoPlano - descontoValor)
                + "\n-----------------------------------");
    }

}
