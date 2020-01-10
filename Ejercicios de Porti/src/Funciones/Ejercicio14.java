public class Ejercicio14 {

    public static void main(String[] args){

        int dado1;
        int dado2;

        System.out.println("Lanza el jugador 1: ");

        dado1 = (int) (Math.random()*6+1);

        System.out.print("El jugador 1 ha sacado: " + dado1);

        System.out.println();

        System.out.println("Lanza el jugador 2: ");

        dado2 = (int) (Math.random()*6+1);

        System.out.print("El jugador 2 ha sacado: " + dado2);

    }

}
