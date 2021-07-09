public class Ex003MathFunctions {

    public static void main(String[] args){

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de "+ x + " = " + A);
        System.out.println("Raiz quadrada de "+ y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0 , 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado a " + y + " = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

        //Exemplo de Função em expressões (Bhaskara):
        // delta = Math.pow(b, 2.0) - 4 * a * c;
        // x1 = (-b + Math.sqtr(delta)) / (2.0 * a);
        // x2 = (-b - Math.sqtr(delta)) / (2.0 * a);

        //para ver todas as funções buscar pow: java.lang.Math


    }
}
