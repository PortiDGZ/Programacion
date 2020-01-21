package Funciones;

public class Ejercicio3 {

    public static void main(String[] args){

       int ascii;
       int max = 0;
       int rundam;
       int min = 200;
       int suma = 0;
       int cont = 0;
        System.out.println("Números aleatorios entre 100 y 199 ambos incluidos: ");

        for (int i = 0; i<50; i++) {

            rundam = (int) (Math.random() * 100 + 100);

            System.out.printf("%c %d ", 32, rundam, "%c ", 32);

            max = Math.max(max, rundam);

            min = Math.min(min, rundam);

            suma+= rundam;

            cont++;
        }

        int media = suma/cont;
            System.out.println("La media es:" + media);

            System.out.println("El mayor es: "+ max);

            System.out.println("El mínimo es: "+min );

    }

}
