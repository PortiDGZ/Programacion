import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args){
       int segundos;

       int minuto;

       int minimo = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el segundo: ");

        segundos = entrada.nextInt();
            if (segundos>0&&segundos<=5400) {
                if (segundos != 5400) {

                    minimo = (segundos / 60) + 1;
                    minimo = (int) Math.ceil(minimo);
                    minuto = minimo;
                    System.out.println("Los minutos transcurridos en el partido son:" + minuto);
                }

                if(segundos == 5400){

                    minimo = (segundos/60);
                    minimo = (int) Math.ceil(minimo);
                    minuto = minimo;
                    System.out.println("Los minutos transcurridos en el partido son:"+minuto);
                }
            }
        }
    }