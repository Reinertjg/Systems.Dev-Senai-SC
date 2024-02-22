package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);

        String origem1, origem2, origem3;
        String destino1, destino2, destino3;
        String textoimpressaovalor = "",textoimpressaodistancia = "";
        float distancia1 = 0.0f, distancia2 = 0.0f, distancia3 = 0.0f;
        float valor1 = 0.0f, valor2 = 0.0f, valor3 = 0.0f;
        float menorvalor = 0.0f, viagemmenor = 0.0f, maiordistancia = 0.0f, viagemmaior = 0.0f;

        System.out.println("Primeira Viagem");
        System.out.println("Origem de: ");
        origem1 = sv.next();
        System.out.println("Destino: ");
        destino1 = sv.next();
        System.out.println("Distancia em quilômestros: ");
        distancia1 = sv.nextFloat();
        System.out.println("Valor em reais: ");
        valor1 = sv.nextFloat();
        

        System.out.println("Segunda Viagem");
        System.out.println("Origem de: ");
        origem2 = sv.next();
        System.out.println("Destino: ");
        destino2 = sv.next();
        System.out.println("Distancia em quilômestros: ");
        distancia2 = sv.nextFloat();
        System.out.println("Valor em reais: ");
        valor2 = sv.nextFloat();
        

        System.out.println("Terceira Viagem");
        System.out.println("Origem de: ");
        origem3 = sv.next();
        System.out.println("Destino: ");
        destino3 = sv.next();
        System.out.println("Distancia em quilômestros: ");
        distancia3 = sv.nextFloat();
        System.out.println("Valor em reais: ");
        valor3 = sv.nextFloat();
        
            menorvalor = valor1;
            viagemmenor = 1;
            
        if (valor2 < menorvalor) {
            menorvalor = valor2;
            viagemmenor = 2;
        }
        if (valor3 < menorvalor) {
            menorvalor = valor3;
            viagemmenor = 3 ;
        }
        if (viagemmenor == 1){
            textoimpressaovalor = "Origem: "+origem1+". Destino: "+destino1+". Distancia: "+distancia1+". Valor: R$"+menorvalor;
        }   
        if (viagemmenor == 2){
            textoimpressaovalor = "Origem: "+origem2+". Destino: "+destino2+". Distancia: "+distancia2+". Valor: R$"+menorvalor;
        }
        if (viagemmenor == 3){
            textoimpressaovalor = "Origem: "+origem3+". Destino: "+destino3+". Distancia: "+distancia3+". Valor: R$"+menorvalor;
        }
        
        if(maiordistancia < distancia1){
            maiordistancia = distancia1; 
            viagemmaior = 1;
        }
        if(maiordistancia < distancia2){
            maiordistancia = distancia2;
            viagemmaior = 2;
        }
        if(maiordistancia < distancia3){
            maiordistancia = distancia3;
            viagemmaior = 3;
        }
        if (viagemmaior == 1){
            textoimpressaodistancia = "Origem: "+origem1+". Destino: "+destino1+". Distancia: "+maiordistancia+". Valor: R$"+valor1;
        }   
        if (viagemmaior == 2){
            textoimpressaodistancia = "Origem: "+origem2+". Destino: "+destino2+". Distancia: "+maiordistancia+". Valor: R$"+valor2;
        }
        if (viagemmaior == 3){
            textoimpressaodistancia = "Origem: "+origem3+". Destino: "+destino3+". Distancia: "+maiordistancia+". Valor: R$"+valor3;
        }
        
        
        
        System.out.println("Viagem de menor valor: ");
        System.out.println(textoimpressaovalor);
        
        System.out.println("Viagem de maior distancia: ");
        System.out.println(textoimpressaodistancia);

//Crie um programa em Portugol para realizar a entrada de informações de viagens por aplicativo.
//O programa deverá solicitar para cada viagem quatro informações:
//- Origem de: (exe: Rua São Paulo)
//- Destino: (exe: Rua XV de Novembro)
//- Distancia em quilômetros: (exe: 3)
//- Valor em reais: (exe: 7.50)
//O programa deverá solicitar como dados de entrada três viagens com todos os dados necessários.
//Ao final o programa deverá imprimir os dados da viagem de menor valor e a viagem de maior distancia.
//Caso a menor viagem em valor e a maior viagem em distancia sejam a mesma o sistema irá realizar a impressão duas vezes para exibir a viagem de menor valor e a viagem de maior distancia conforme o exemplo de impressão.
//Exemplo:
//Viagem de menor valor:
//Origem: Rua São Paulo. Destino: Rua XV de Novembro. Distancia: 3 KM. Valor:  R$ 7.50
//Viagem de maior distancia:
//Origem: Rua São Paulo. Destino: Rua XV de Novembro. Distancia: 3 KM. Valor:  R$ 7.50
    }

}
