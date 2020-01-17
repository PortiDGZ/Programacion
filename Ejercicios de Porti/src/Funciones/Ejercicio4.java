package Funciones;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int num = -1;
        int rundam = 0;
        int oportunidades = 5;

        System.out.println("Número aleatorio entre 0 y 100: ");

        Scanner entrada = new Scanner(System.in);


                System.out.println("Adivina el número: ");
                rundam = (int) (Math.random() * 101);
        for (int i = 0; i < 5 & num != rundam; i++) {
                num = entrada.nextInt();

                if(num < rundam){

                    System.out.println("El número es mayor.");

                }

                if (num > rundam){

                    System.out.println("El número es menor.");

                }

                if (rundam == num) {

                    System.out.print("Es el número correcto.");


                }
                oportunidades--;
                System.out.println(" Quedan " + oportunidades + " oportunidades." );
            }

        if(num != rundam){

            System.out.println("El número era: " + rundam);
        }

    }
}