import java.util.Locale;
import java.util.Scanner;

public class Ex002Scanner {

    public static void main(String[] args){

        System.out.print("Digite algo: ");
        Locale.setDefault(Locale.US); //Para ler e imprimir float com PONTO
        Scanner sc = new Scanner(System.in);

        //String x;
        //x = sc.next();

        //String x;
        //x = sc.nextline(); //le a linha inteira até que o usuário dê Enter
        //ATENÇÃO: Caso o código tenha uma leiturar anterior, deve-se inserir um
        //sc.nextline() sozinho para evitar que a quebra de linha da leitura anterior
        // seja consumida pelo sc.nextline() atual.

        //int x;
        //x = sc.nextInt();

        //double x;
        //x = sc.nextDouble();

        //char x;
        //x = sc.next().charAt(0);

        //System.out.println("Você digitou " + x);

        //O bloco abaixo lê três dados diferentes separados por espaço
        String w;
        int y;
        double z;
        w = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println(w);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }

}
