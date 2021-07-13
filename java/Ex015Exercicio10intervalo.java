import java.util.Locale;
import java.util.Scanner;

public class Ex015Exercicio10intervalo {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num;

        System.out.print("Digite um número: ");
        num = sc.nextDouble();

        if (num < 0 || num > 100.00) {
            System.out.println("Fora de Intervalo");
        }
        else if (num <= 25) {
            System.out.println("Intervalo [0,25]");
        }
        else if (num <= 50) {
            System.out.println("Intervalo [25,50]");
        }
        else if (num <= 75) {
            System.out.println("Intervalo [50,75]");
        }
        else {
            System.out.println("Intervalo [75,100]");
        }

        sc.close();
    }

}
