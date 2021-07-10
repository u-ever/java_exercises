import java.util.Scanner;

public class Ex011Exercicio8Nparimpar {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();

        if (num % 2 == 0){
            System.out.print("PAR");
        }
        else{
            System.out.print("IMPAR");
        }

        sc.close();
    }

}
