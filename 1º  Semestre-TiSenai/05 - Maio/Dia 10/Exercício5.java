package atividades;

import javax.swing.JOptionPane;

public class Exercício5 {

    public static void main(String[] args) {

        int cc = 0, valores = 0;
        int votoNulo = 0, votoEmBranco = 0;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;

        do {

            valores = Integer.parseInt(JOptionPane.showInputDialog("Informe seu voto"
                    + "\n- 1,2,3,4 = voto para os respectivos candidatos"
                    + "\n- 5 = voto nulo"
                    + "\n- 6 = voto em branco"
                    + "\n- 0 = Encerrar votação"));

            switch (valores) {
                case 0 -> cc++;
                case 1 -> candidato1++;
                case 2 -> candidato2++;
                case 3 -> candidato3++;
                case 4 -> candidato4++;
                case 5 -> votoNulo++;
                case 6 -> votoEmBranco++;
            }

        } while (cc != 1);

        JOptionPane.showMessageDialog(null, 
                "Total de Votos"
                + "\nCandidato 1 recebeu = " + candidato1
                + "\nCandidato 2 recebeu = " + candidato2
                + "\nCandidato 3 recebeu = " + candidato3
                + "\nCandidato 4 recebeu = " + candidato4
                + "\n--------------------------------------------------"
                + "\nTotal de votos nulos: " + votoNulo
                + "\nTotal de votos em branco: " + votoEmBranco,
                "Eleição", JOptionPane.INFORMATION_MESSAGE);
    }
}
//6. Em uma eleição presidencial existem quatro candidatos. Os votos são informados através
//de códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:
//- 1,2,3,4 = voto para os respectivos candidatos;
//- 5 = voto nulo;
//- 6 = voto em branco;
//Elabore um algoritmo que leia o código do candidado em um voto. Calcule e escreva:
//- total de votos para cada candidato;
//- total de votos nulos;
//- total de votos em branco;
//Como finalizador do conjunto de votos, tem-se o valor 0.
