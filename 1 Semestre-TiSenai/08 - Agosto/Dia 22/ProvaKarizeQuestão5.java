package Prova;

public class Questao5 {

    public static void main(String[] args) {
        
        int cc = 0;
        
        for(int ii = 1; ii <= 100; ii++){
            
            cc++;
            if(cc == 10){
                System.out.println("Múltiplo de " + ii);
                cc = 0;
            }
            
            
        }
    }
}
