package javaapplication1;

import javax.swing.JOptionPane;
import javaapplication1.Adicao;

public class somar {
    
    public static void main(String[] args) {
        
        Adicao ad = new Adicao(2,2);
        
        System.out.println("soma é" + ad.soma());
    }
    
    
}

