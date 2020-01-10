import java.util.Scanner;

public class Ejercicio11 {


    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        double res = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("1.- Multiplicar");
        System.out.println("2.- Suma");
        System.out.println("3.- Restar");
        System.out.println("4.- Dividir");
        System.out.println("5.- Elevar");
        System.out.println("6.- Seno");
        System.out.println("7.- Coseno");
        System.out.println("******************************");

        int opc = 0;
        opc = entrada.nextInt();

        if (opc <= 5) {
            System.out.println("Introduce el primer número: ");

            x = entrada.nextDouble();

            System.out.println("Introduce el segundo número: ");

            y = entrada.nextDouble();
        } else {
            System.out.println("Introduce el número: ");

            x = entrada.nextDouble();
        }

        switch (opc) {

            case 1:
                res = x * y;
                break;
            case 2:
                res = x + y;
                break;
            case 3:
                res = x - y;
                break;
            case 4:
                res = x / y;
                break;
            case 5:
                res = Math.pow(x, y);
                break;
            case 6:
                res = Math.sin(x);
                break;
            case 7:
                res = Math.cos(x);

        }

        System.out.println("El resultado es: " + res);
        //Mi bonita calculadora


    }
}
