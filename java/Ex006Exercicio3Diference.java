import java.util.Scanner;
import java.util.Locale;

public class Ex006Exercicio3Diference {

    public static void main(String[] args){
        int A, B, C, D, DIFERENCA ;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Digite o 1º número: ");
        A = sc.nextInt();
        System.out.print("Digite o 2º número: ");
        B = sc.nextInt();
        System.out.print("Digite o 3º número: ");
        C = sc.nextInt();
        System.out.print("Digite o 4º número: ");
        D = sc.nextInt();

        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENÇA = " + DIFERENCA);

        sc.close();
    }
}
