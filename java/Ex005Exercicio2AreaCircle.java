import java.util.Scanner;
import java.util.Locale;

public class Ex005Exercicio2AreaCircle {

    public static void main(String[] args){


        Locale.setDefault(Locale.US);
        System.out.println();
        System.out.print("Digite o valor do raio do círculo: ");
        Scanner sc = new Scanner(System.in);

        double raio, area, pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * raio * raio;

        System.out.printf("O valor da área deste circulo é A = %.4f %n", area);

        sc.close();
    }
}
