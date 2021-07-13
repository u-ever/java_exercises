import java.util.Locale;
import java.util.Scanner;

public class Ex016Exercicio11plano {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.printf("%nDigite a primeira coordenada (x): ");
        x = sc.nextDouble();
        System.out.print("Digite a segunda coordenada (y): ");
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }

        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }

        else if (y == 0.0) {
            System.out.println("Eixo X");
        }

        else if (x >= 0.1 && y >= 0.1) {
            System.out.println("Q1");
        }

        else if (x <= - 0.1 && y >= 0.1) {
            System.out.println("Q2");
        }

        else if (x <= - 0.1 && y <= - 0.1) {
            System.out.println("Q3");
        }

        else {
            System.out.println("Q4");
        }

        sc.close();
    }
}
