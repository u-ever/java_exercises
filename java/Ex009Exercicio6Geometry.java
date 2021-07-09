import java.util.Locale;
import java.util.Scanner;

public class Ex009Exercicio6Geometry {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO, pi = 3.14159;

        System.out.printf("%n          CALCULOS GEOMETRICOS%n");
        System.out.println("=-=".repeat(15));

        System.out.print("Digite 3 valores para calcularmos: ");

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        TRIANGULO = A * C / 2;
        System.out.printf("TRIANGULO = %.3f %n", TRIANGULO);

        CIRCULO = pi * C * C;
        System.out.printf("CIRCULO = %.3f %n", CIRCULO);

        TRAPEZIO = ((A + B) * C) / 2;
        System.out.printf("TRAPEZIO = %.3f %n", TRAPEZIO);

        QUADRADO = B * B;
        System.out.printf("QUADRADO = %.3f %n", QUADRADO);

        RETANGULO = A * B;
        System.out.printf("RETANGULO = %.3f %n", RETANGULO);

        System.out.println("=-=".repeat(15));

        sc.close();
    }
}
