package javaapplication1;

import javax.swing.JOptionPane;

public class NewClass {
    public static void main(String[] args) throws Exception {

    String mensagem = "";
    Double comprimentoDaOnda = 0.0;

    comprimentoDaOnda = Double.parseDouble(JOptionPane.showInputDialog("Informe o Comp. de onda(nm)da cor:"));
         
    if(comprimentoDaOnda >= 380 && comprimentoDaOnda <450){
        mensagem = "A cor é Vieleto";
    }
    if(comprimentoDaOnda >= 450 && comprimentoDaOnda <495){
        mensagem = "A cor é Azul";
    }
    if(comprimentoDaOnda >= 495 && comprimentoDaOnda <570){
        mensagem = "A cor é Verde";
    }
    if(comprimentoDaOnda >= 570 && comprimentoDaOnda <590){
        mensagem = "A cor é Amarelo";
    }
    if(comprimentoDaOnda >= 590 && comprimentoDaOnda <620){
        mensagem = "A cor é Laranja";
    }
    if(comprimentoDaOnda >= 620 && comprimentoDaOnda <750){
        mensagem = "A cor é Vermelho";
    }
    else{
        mensagem = "O comprimento de onda inserido não faz parte do espectro visível ";
    }
    
    JOptionPane.showMessageDialog(null, mensagem);
    
    }
}
//Determinando a cor no espectro visível
//Visão Geral
//Crie o programa Java interativo GamaDeCores.java. Quando determinado comprimento de onda em nanômetros for fornecido, ele
//retornará a cor correspondente no espectro visível.
//@karizeviecelli
//Você deve implementar o seguinte usando uma instrução de decisão if
//adequada:
//1. Solicite que o usuário insira o comprimento de onda; ele deve ser do
//tipo double.
//2. Para cada intervalo (por exemplo, 380 - 450) o número à esquerda é
//incluído no intervalo, mas o número à direita não é.
//3. Se o valor da entrada não for encontrado no espectro visível, informe
//que o comprimento de onda não está dentro do espectro visível.
//4. Saída Esperada:
//a. Informe o Comp. de onda(nm)da cor:
//630
//A cor é vermelha
//b Informe o Comp. de onda(nm)da cor:
//25.0
//O comprimento de onda inserido não faz parte do
//espectro visível
//c Informe o Comp. de onda(nm)da cor:
//750.5
//O comprimento de onda inserido não faz parte do
//espectro visível 
