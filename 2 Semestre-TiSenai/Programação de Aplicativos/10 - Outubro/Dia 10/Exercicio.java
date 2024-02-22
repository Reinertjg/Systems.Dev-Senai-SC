package Abstracao;

import javax.swing.JOptionPane;

public class Pessoa {

    //atributos
    String nome;
    int idade;
    Boolean estaVivo;

    //construtores
    Pessoa() {
    }

    Pessoa(String nomePessoa, int idadePessoa) {
        this.nome = nomePessoa;
        this.idade = idadePessoa;
    }

    Pessoa(Boolean vivoOuMorto) {
        this.estaVivo = vivoOuMorto;
    }

    Pessoa(int idadeDoIndividuo, Boolean vivoMorto) {
        this.idade = idadeDoIndividuo;
        this.estaVivo = vivoMorto;
    }

    //metados
    public void DeclararStatus(boolean statusVida) {
        this.estaVivo = statusVida;
        JOptionPane.showMessageDialog(null, "O " + this.nome + "Está: " + this.estaVivo);
    }

    public void Cadastar(String nomeUsario, int idadeUsuatio) {
        this.nome = nomeUsario;
        this.idade = idadeUsuatio;
        JOptionPane.showMessageDialog(null, "Nome" + this.nome + "\nidade: " + this.idade);
    }
    public String realizarProvaDeVida(String nome, int idade, boolean estaVivo){
        this.estaVivo = estaVivo;
        this.nome = nome;
        this.idade = idade;
        
        String vida;
        if (this.estaVivo == true){
            vida = "Vivo";
        } else {
            vida = "Morto";
        }
        
        return "O " + this.nome + ""
                + "\ntem a idade de " + this.idade + ""
                + "\no seu status de vida é: " + this.estaVivo;
        
    }
    
    public void toPrint() {
        JOptionPane.showMessageDialog(null, this.nome + ""
            + "\ntem a idade " + this.idade + " "
            + "\ne seu status de vida é: " + this.estaVivo);
    }

    public static void main(String[] args) {

        //primeiro Objeto
        Pessoa individuo1 = new Pessoa();
        individuo1.estaVivo = true;
        individuo1.idade = 16;
        individuo1.nome = "Nicolas";
        individuo1.toPrint();
        System.out.println(individuo1.realizarProvaDeVida("Joana", 20, true));
        //segundo Objeto
        Pessoa individuo2 = new Pessoa(true);

        //terceito Objeto
        Pessoa individuo3 = new Pessoa("Bruno", 20);

        //quarto Objeto
        Pessoa individuo4 = new Pessoa(80, false);

    }

}
