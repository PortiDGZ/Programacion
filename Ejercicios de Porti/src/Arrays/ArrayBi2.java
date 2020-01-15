package Arrays;

import java.util.Scanner;

public class ArrayBi2 {

    public static void main(String[] args){

    int[][] paco;

    paco = generarArrayBi();

    

    }

    public static int[][] generarArrayBi(){

        Scanner entrada = new Scanner(System.in);

        System.out.print("¿De que tamaño quieres el array?: ");

        int filas = entrada.nextInt();

        int columnas = entrada.nextInt();

        return new int[filas][columnas];

    }

    public static void rellenarmatriz(int[][] jose){

        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i <= jose.length - 1; i++){
            for (int j = 0; j <= jose.length -1; j++){

                jose[i][j] = entrada.nextInt();


            }
        }
    }
}
