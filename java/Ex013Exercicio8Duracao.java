import java.util.Scanner;

public class Ex013Exercicio8Duracao {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int hini, hfim, htotal;

        System.out.print("Digite a hora inicial: ");
        hini = sc.nextInt();

        System.out.print("Digite a hora final: ");
        hfim = sc.nextInt();

        if (hini < hfim){
            htotal = hfim - hini;
        }
        else {
            htotal = 24 - hini + hfim;
        }
        System.out.printf("O JOGO DUROU %d HORAS %n", htotal);

        sc.close();
    }

}