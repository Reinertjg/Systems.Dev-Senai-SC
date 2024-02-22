
package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nomeproduto1, nomeproduto2, nomeproduto3, respostaproduto2, respostaproduto3;
        Double valorproduto1, valorproduto2, valorproduto3, percentual1, percentual2, percentual3;
        Double totalvenda, totaldesconto, totalproduto;
        
        System.out.print("Informe o nome do primeiro produto: ");
        nomeproduto1 = sc.next();
        System.out.print("Informe o valor deste produto: ");
        valorproduto1 = sc.nextDouble();
        System.out.print("Informe o percentual de desconto: ");
        percentual1 = sc.nextDouble();
        totalproduto = valorproduto1;
        totaldesconto = ((valorproduto1 * percentual1) / 100);
        totalvenda = (totalproduto - totaldesconto);
        
        System.out.print("Deseja informar o segundo produto(sim/nao): ");
        respostaproduto2 = sc.next();
        if(respostaproduto2.equalsIgnoreCase("nao")){
            
            System.out.println("Valor total do produto R$"+totalproduto);
            System.out.println("Valor total desconto R$"+totaldesconto);
            System.out.println("Valor total R$"+totalvenda);
            
        }else if(respostaproduto2.equalsIgnoreCase("sim")){
            
            System.out.print("Informe o nome do segundo produto: ");
            nomeproduto2 = sc.next();
            System.out.print("Informe o valor deste produto: ");
            valorproduto2 = sc.nextDouble();
            System.out.print("Informe o percentual de desconto: ");
            percentual2 = sc.nextDouble();
            totalproduto += valorproduto2;
            totaldesconto += ((valorproduto2 * percentual2) / 100);
            totalvenda += (totalproduto - totaldesconto);
            
            System.out.println("Deseja informar o terceiro produto(sim/nao): ");
            respostaproduto2 = sc.next();
            if(respostaproduto2.equalsIgnoreCase("nao")){
                
                System.out.println("Valor total do produto R$"+totalproduto);
                System.out.println("Valor total desconto R$"+totaldesconto);
                System.out.println("Valor total R$"+totalvenda);
                
            }else if(respostaproduto2.equalsIgnoreCase("sim")){
            
                System.out.print("Informe o nome do terceiro produto: ");
                nomeproduto3 = sc.next();
                System.out.print("Informe o valor deste produto: ");
                valorproduto3 = sc.nextDouble();
                System.out.print("Informe o percentual de desconto: ");
                percentual3 = sc.nextDouble();
                totalproduto += valorproduto3;
                totaldesconto += ((valorproduto3 * percentual3) / 100);
                totalvenda += (totalproduto - totaldesconto);

                System.out.println("Valor total do produto R$"+totalproduto);
                System.out.println("Valor total desconto R$"+totaldesconto);
                System.out.println("Valor total R$"+totalvenda);
     }
    }        
  }
}
