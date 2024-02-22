package atividades;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cadastrodeprodutos {
    
    static Scanner sc = new Scanner(System.in);
    static int cc = 0;
    static int contador= 0;
    static String pular = "\n";
    static String[] nomeProduto = new String[99];
    
    public static void main(String[] args) {
        
        do{
            
            int opcaoMenu = 0;

            System.out.println(pular +"MENU"
                    + pular + "1 - Inserir"
                    + pular + "2 - Exibir"
                    + pular + "3 - Encerrar");
            opcaoMenu = sc.nextInt();
            switch(opcaoMenu) {
                case 1 -> inserir(args);
                case 2 -> exibir(args);
                case 3-> encerrar(args);
                default -> System.out.println("Opção inválida. Digite novamente." );
            }
            
        }while(cc != 1);
        
    }

    public static void inserir(String[] args) {
        do {
            System.out.println("Nome do produto:");
            nomeProduto[contador] = sc.next();
            if(nomeProduto[contador] == ""){
                 System.out.println("Nenhum dado foi inserido.");
            } else{
               System.out.println("Dado foi inserido com sucesso.");
            }
          
        } while (nomeProduto[contador] == (""));
        contador++;
        
    }

    public static void exibir(String[] args){
        System.out.println("Dados Inseridos:");
        for(int ii = 0;  ii < contador; ii++ ){
            System.out.println(nomeProduto[ii]);
        }
    }

    public static void encerrar(String[] args) {
        System.out.println("Programa Encerrado");
        cc = 1;
    }
        
}
