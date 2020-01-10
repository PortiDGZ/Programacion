import java.util.Scanner;

public class Arrays5 {

    public static void main(String[] args) {

        int[] Numeros = new int[10];

        int max = 0;

        int min = 999999999;

        int i;

        Scanner entrada = new Scanner(System.in);

        for (i = 0; i < Numeros.length; i++) {

            Numeros[i] = entrada.nextInt();

        }

        for (i = 0; i < Numeros.length; i++) {

            max = Math.max(max, Numeros[i]);

            min = Math.min(min, Numeros[i]);

        }

        for (i = 0; i < Numeros.length; i++) {

            System.out.println(Numeros[i]);
            if (Numeros[i] == max) {
                System.out.print("Maximo ");
            }

            if (Numeros[i] == min) {

                System.out.print("Minimo ");
            }


        }

    }
}
