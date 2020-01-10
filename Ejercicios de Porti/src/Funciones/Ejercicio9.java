import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args){

        final double g = 9.81;

        double h = 0;

        double t;

        System.out.println("Introduce la altura: ");

        Scanner entrada = new Scanner(System.in);
        h = entrada.nextDouble();

        t = Math.sqrt((2*h)/g);

        System.out.println("La solución es: "+ t);
    }

}
