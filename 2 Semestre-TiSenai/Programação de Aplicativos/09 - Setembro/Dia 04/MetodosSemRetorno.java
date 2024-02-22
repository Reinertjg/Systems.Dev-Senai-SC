package metodosjava;

public class MetodoSemRetorno {

    public static void imprimir() {
        System.out.println("Aprendendo linguagem Java");
    }

    public static void imprimirTexto(String texto) {
        System.out.println(texto);
    }

    public static void somar(int a, int b) {
        System.out.println("A Soma de" + a + " + " + b + " é " + (a + b));
    }

    public static void calcularQuadrado(int a) {
        System.out.println(Math.pow(a, 2));
    }

    public static void encontroMaior(int a, int b, int c) {
        System.out.println(Math.max(a, Math.max(b, c)));
    }

    public static void escolherSexo(char a) {
        a = Character.toUpperCase(a);
        switch (a) {
            case 'M' ->
                System.out.println("Masculino");
            case 'F' ->
                System.out.println("Feminino");
            default ->
                System.out.println("Desconhecido");
        }
    }
}
