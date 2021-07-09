import java.util.Scanner;
import java.util.Locale;

public class Ex008Exercicio5Valorprods {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codum, num, coddois, ndois;
        double valorum, valordois, total;

        System.out.println("=".repeat(40));

        codum = sc.nextInt();
        num = sc.nextInt();
        valorum = sc.nextDouble();

        coddois = sc.nextInt();
        ndois = sc.nextInt();
        valordois = sc.nextDouble();

        total = (num * valorum) + (ndois * valordois);

        System.out.printf("VALOR A PAGAR: R$ %.2f %n", total);

        System.out.println("=".repeat(40));

        sc.close();
    }
}
