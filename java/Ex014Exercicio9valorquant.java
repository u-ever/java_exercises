import java.util.Scanner;
import java.util.Locale;

public class Ex014Exercicio9valorquant {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco;
        int prod, quant;

        System.out.println();
        System.out.print("Digite o código e a quantidade do produto: ");
        prod = sc.nextInt();
        quant = sc.nextInt();

        if (prod == 1){
            preco = quant * 4.00;
            System.out.printf("Total: R$ %.2f %n", preco);
        }
        if (prod == 2){
            preco = quant * 4.50;
            System.out.printf("Total: R$ %.2f %n", preco);
        }
        if (prod == 3){
            preco = quant * 5.00;
            System.out.printf("Total: R$ %.2f %n", preco);
        }
        if (prod == 4){
            preco = quant * 2.00;
            System.out.printf("Total: R$ %.2f %n", preco);
        }
        if (prod == 5){
            preco = quant * 1.50;
            System.out.printf("Total: R$ %.2f %n", preco);
        }

        sc.close();
    }
}
