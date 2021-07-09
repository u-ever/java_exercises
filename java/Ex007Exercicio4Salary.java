import java.util.Scanner;
import java.util.Locale;

public class Ex007Exercicio4Salary {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numerof, horast;
        double salarioh, salariom;

        System.out.println("=".repeat(40));

            System.out.print("Digite o número do Funcionário: ");
            numerof = sc.nextInt();
            System.out.print("Digite o número de horas trabalhadas: ");
            horast = sc.nextInt();
            System.out.print("Digite o valor da hora trabalhada: ");
            salarioh = sc.nextDouble();

            salariom = horast * salarioh;

        System.out.println("=".repeat(40));

            System.out.printf("NUMBER = %d %n", numerof);
            System.out.printf("SALARY = U$ %.2f %n", salariom);

        System.out.println("=".repeat(40));

        sc.close();
    }
}
