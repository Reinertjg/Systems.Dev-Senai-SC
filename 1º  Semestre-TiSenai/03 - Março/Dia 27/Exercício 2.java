import java.util.Scanner;
public class Exercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float numero1 = 0.0f, numero2 = 0.0f, numero3 = 0.0f;

        System.out.println("Informe o numero 1: ");
        numero1 = sc.nextFloat();
        System.out.println("Informe o numero 2: ");
        numero2 = sc.nextFloat();
        System.out.println("Informe o numero 3: ");
        numero3 = sc.nextFloat();

        if(numero1 == numero2 && numero2 == numero3){
            System.out.println("Igual");
        }else{
            System.out.println("Diferente");
        }


//Desenvolva um algoritmo para realizar a comparação entre três números.
// - Solicite ao usuário que informe o numero 1;
//2 - Solicite ao usuário que informe o número 2;
//3 - Solicite ao usuário que informe o número 3;
//4- Realize testes para comparar os três números;
//5- Caso o número 1 seja igual ao número 2 e igual ao número 3 imprima "Iguais";
//6- Caso o número 1 seja diferente do número 2 ou o número 1 seja diferente do número 3 ou o número 2 seja diferente do número 3 imprima "Diferentes"
//Ao executar o programa deverá realizar a entrada e saída de dados da seguinte forma:
//------------------------------------------
//Informe o número 1: __
//Informe o número 2: __
//Informe o número 3: __
//Resultado: ____   
    }
}
