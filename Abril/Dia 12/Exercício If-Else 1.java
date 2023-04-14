import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        String grupoIMC = "";
        Double peso = 0.0, altura = 0.0;
        Double imc = 0.0;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura(M)"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso(Kg)"));

        imc = peso / (Math.pow(altura, 2));

        if (imc >= 16.0 && imc <= 16.9) {
            grupoIMC = "Muito abaixo do peso";
        }
        if (imc >= 17.0 && imc <= 18.4) {
            grupoIMC = "Abaixo do peso";
        }
        if (imc >= 18.5 && imc <= 24.9) {
            grupoIMC = "Peso normal";
        }
        if (imc >= 25.0 && imc <= 29.9) {
            grupoIMC = "Acima do peso";
        }
        if (imc >= 30.0 && imc <= 34.9) {
            grupoIMC = "Obesidade grau I";
        }
        if (imc >= 35.0 && imc <= 40) {
            grupoIMC = "Obesidade grau II";
        }
        if (imc > 40){
            grupoIMC = "Obesidade grau III";
        }

        JOptionPane.showMessageDialog(null, "Seu IMC é "+imc+" e o grupo de IMC é: "+grupoIMC);
        
// 1 - Situação problema: Escreva um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa e mostre :

// 16,0 a 16,9 - Muito abaixo do peso
// 17,0 a 18,4 - Abaixo do peso
// 18,5 a 24,9 - Peso normal
// 25,0 a 29,9 - Acima do peso
// 30,0 a 34,9 - Obesidade grau I
// 35,0 a 40,0 - Obesidade grau II
// maior que 40 - Obesidade grau III
// Informar o peso e a altura da pessoa, calcular o IMC e mostrar em qual grupo se enquadra.
    }
}
