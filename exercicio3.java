import java.util.Scanner;

class exercicio3 {

    public static void main(String[] args) {

        double primeironumero;
        double segundonumero;
        double resultadodasoma;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Primeiro Número:");

        primeironumero = teclado.nextDouble();

        System.out.println("Segundo Número:");

        segundonumero = teclado.nextDouble();

        resultadodasoma = primeironumero + segundonumero;

        System.out.printf("Resultado da soma:" + resultadodasoma);

    }

}
