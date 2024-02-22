import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        float numero1 = 0.0f, numero2 = 0.0f;

        System.out.print("Informe o numero 1: ");
        numero1 = sc.nextFloat();
        System.out.print("Informe o numero 2: ");
        numero2 = sc.nextFloat();

        if(numero1 == numero2){
            System.out.println("igual");
        }else{
            System.out.println("Diferente");
        }


        //Desenvolva um algoritmo para realizar a comparação entre dois números.
        //1 - Solicite ao usuário que informe o numero 1;
        //2 - Solicite ao usuário que informe o número 2;
        //3 - Realize um teste comparando os dois números;
        //4 - Caso o numero 1 seja igual ao número 2 imprima "Igual";
        //5 - Caso o número 1 seja diferente do número 2 imprima "Diferente"
        //Ao executar o programa deverá realizar a entrada e saída de dados da seguinte forma:
        //------------------------------------------
        //Informe o número 1: __
        //Informe o número 2: __
        //Resultado: ____

    }
}
