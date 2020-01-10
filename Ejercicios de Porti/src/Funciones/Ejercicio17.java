public class Ejercicio17 {

    public static void main(String[] args){

        String caracteres = "";

        int num1 = 35;
        int num2 = 38;

        char numrand;
        int i;
        for (i = 0; i < 5; i++) {

            numrand = (char) (Math.random() * (num2 - num1) + num1);

            caracteres += numrand;
        }
        System.out.println(caracteres);
    }
}
