public class Ejercicio6 {

    public static void main(String[] args) {

        double nota;
        double conts = 0;
        double contsuf = 0;
        double contb = 0;
        double contn = 0;
        double contsobr = 0;

        System.out.println("Notas aleatorias.");

        for (int i = 0; i < 20; i++) {

            nota = Math.random() * 10;

            if (nota < 5.0) {

                System.out.println(nota + " :Suspenso.");
                conts++;

            } else {

                if (nota <= 6.0 & nota >= 5.0) {

                    System.out.println(nota + " :Suficiente.");

                    contsuf++;

                } else

                    if (nota >= 6.0 & nota <= 7.0) {
                    System.out.println(nota + " :Bien");

                    contb++;

                } else {

                    if (nota >= 7 & nota <= 9) {

                        System.out.println(nota + " :Notable.");
                        contn++;

                    } else {
                        if (nota <= 10.0 & nota <= 9.0) {

                            System.out.println(nota + " :Sobresaliente.");

                            contsobr++;
                        }

                    }

                }

            }

        }

        System.out.println(conts + " suspensos.");

        System.out.println(contsuf + " aprobados.");

        System.out.println(contb + " bien.");

        System.out.println(contn + " notable.");

        System.out.println(contsobr + " sobresaliente.");
    }
}
