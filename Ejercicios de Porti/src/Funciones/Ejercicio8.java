public class Ejercicio8 {

    public static void main(String[] args){

        String notamus;

        int opc = 0;

        switch (opc){

            case 1: notamus = "do";
            break;
            case 2: notamus ="re";
            break;
            case 3: notamus = "mi";
            break;
            case 4: notamus = "fa";
            break;
            case 5: notamus = "sol";
            break;
            case 6: notamus = "la";
            break;
            case 7: notamus = "si";
            break;
        }
        opc = (int) (Math.random() * 7 + 1);


    }
}
