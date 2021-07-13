import java.util.Locale;
import java.util.Scanner;

public class Ex017Exercicio12ImpostoeRoubo {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        double salario, roubo;

        System.out.print("Digite seu salário: ");
        salario = leitura.nextDouble();

        if (salario <= 2000.00) {
            System.out.print("Isento");
        }

        else if (salario >= 2000.01 && salario <= 3000.00) {
            roubo = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f", roubo);
        }

        else if (salario >= 3000.01 && salario <= 4500.00) {
            roubo = (salario - 3000.00) * 0.18 + 80.00;
            System.out.printf("R$ %.2f", roubo);
        }

        else {
            roubo = (salario - 4500.00) * 0.28 + 350.00;
            System.out.printf("R$ %.2f", roubo);
        }

        leitura.close();
    }
}
