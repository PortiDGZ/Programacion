public class Ejercicio15 {

    public static void main(String[] args){

        System.out.println("Muestra la quiniela:");
        int filas = 15;
        int columnas = 3;
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                int numApuesta = (int)(Math.random()*6);
                String apuesta = "a";
                switch (numApuesta){
                    case 0:
                    case 1:
                    case 2:
                        apuesta = "1";
                        break;
                    case 3:
                        apuesta = "X";
                        break;
                    case 4:
                    case 5:
                        apuesta = "2";
                        break;
                }
                System.out.print(apuesta + "  ");
            }
            System.out.println();
        }
    }
}