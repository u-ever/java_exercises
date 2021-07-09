import java.util.Scanner;

public class Ex004Exercicio1Soma {

    public static void main(String[] args){

        int valorum, valordois, soma;

        Scanner sc = new Scanner(System.in);

        System.out.printf("%nDigite um valor inteiro: ");
        valorum = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        valordois = sc.nextInt();

        soma = valorum + valordois;
        System.out.printf("A soma de %d + %d é igual a %d %n." , valorum, valordois, soma);

        sc.close();
    }
}
