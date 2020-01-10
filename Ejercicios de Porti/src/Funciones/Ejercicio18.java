public class Ejercicio18 {

    public static void main(String[] args) {

         int rand;

         char caracter = 0;

        char[] caracteres = new char[5];

        for (int i = 0; i < 5 ; i++) {

            rand = (int) (Math.random() * 6 + 1);

            switch (rand){

                case 1: caracter = 42;

                break;

                case 2: caracter = 45;

                break;

                case 3: caracter = 61;

                break;

                case 4: caracter = 46;

                break;

                case 5: caracter = 124;

                break;

                case 6: caracter = 64;

                break;

                default:
            }

            caracteres[i] = caracter;

        }

        System.out.print(caracteres);
    }
}
