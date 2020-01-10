import java.util.Scanner;

public class Arrays6 {

    public static void main(String[] args) {

        int[] Numeros = new int[15];

        int aux = 0;

        int i;

        String array;

        Scanner entrada = new Scanner(System.in);

        for (i = 0; i < Numeros.length; i++) {

            Numeros[i] = entrada.nextInt();

        }

        aux = Numeros[14];

        for (i = 14; i > 0; i--) {

            Numeros[i] = Numeros[i - 1];
        }

        Numeros[0] = aux;
        for (i = 0; i < Numeros.length; i++) {
            System.out.print(Numeros[i] + " ");
        }


    }
}
