import java.util.Scanner;

public class Ex010Exercicio7Nnegativo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int ni;
        System.out.print("Digite um número inteiro: ");
        ni = sc.nextInt();

        if (ni >= 0){
            System.out.print("NAO NEGATIVO");
        }
        else{
            System.out.print("NEGATIVO");
        }
        sc.close();
    }

}
