
package javaapplication1;

public class Adicao {
    
   private int numero1;
   private int numero2;
   
   public Adicao(int num1, int num2){
       this.numero1 = num1;
       this.numero2 = num2;
   }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
   
    public int soma(){
        return this.numero1 + this.numero2;
    }
}
