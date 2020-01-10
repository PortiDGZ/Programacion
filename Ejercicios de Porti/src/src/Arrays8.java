public class Arrays8 {

    public static void main(String[] args) {

        int[] rand = new int[20];
        int i = 0;

        int[] pares = new int[20];
        int[] impares = new int[20];

        for (i = 0; i < rand.length; i++) {

            rand[i] = (int) ((Math.random() * 101) + 0);

            if (rand[i] % 2 == 0) {

                pares[i] = rand[i];

            }

            if (rand[i] % 2 != 0){

                impares[i] = rand[i];
            }
        }

            for (i = 0; i < rand.length; i++) {

               rand[i] = pares[i];

            }

            for (i = 0; i < rand.length; i++) {
                if (rand[i] == 0) {

                    rand[i] = impares[i];
                }

            }

            for (i = 0; i < rand.length; i++) {

                System.out.println(rand[i]);

            }

        }
    }
