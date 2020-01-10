import javax.swing.*;

public class Ejercicio16 {

    public static void main(String[] args) {

        String caracteres = "";

        int num1 = 65;
        int num2 = 90;

        char numrand;
        int i;
            for (i = 0; i < 5; i++) {

                numrand = (char) (Math.random() * (num2 - num1) + num1);

                caracteres += numrand;
            }
            System.out.println(caracteres);
            caracteres = caracteres.toLowerCase();
            System.out.print(caracteres);
        }
    }
