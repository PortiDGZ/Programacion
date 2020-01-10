public class Ejercicio14B {

    public static void main(String[] args){

        int dado1;
        int dado2;
        int dado3;
        int dado4;
        int suma1;
        int suma2;

        System.out.println("Lanza el jugador 1: ");

        dado1 = (int) (Math.random()*6+1);
        dado2 = (int) (Math.random()*6+1);

        suma1 = dado1 + dado2;

        System.out.println();

        System.out.println("El jugador 1 ha sacado: "+ suma1);

        System.out.println("Lanza el jugador 2: ");

        dado3 = (int) (Math.random()*6+1);
        dado4 = (int) (Math.random()*6+1);

        suma2 = dado3 + dado4;

        System.out.println("El jugador 2 ha sacado: " + suma2);

    }

}
