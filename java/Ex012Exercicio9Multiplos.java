import java.util.Scanner;

public class Ex012Exercicio9Multiplos {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A, B;
        System.out.print("Digite o primeiro número inteiro: ");
        A = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.print("Sao Multiplos");
        }
        else{
            System.out.print("Nao sao Multiplos");
        }

        sc.close();
    }

}
