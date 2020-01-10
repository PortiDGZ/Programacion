public class Arrays7 {

    public static void main(String[] args) {

        int[] rand = new int[8];

        String paridad;
        for (int i = 0; i < 8; i++) {

            rand[i] = (int) ((Math.random() * 101) + 0);

            if (rand[i] % 2 == 0) {

                System.out.println(rand[i] + " Par");

            }

            if (rand[i] % 2 != 0) {

                System.out.println(rand[i] + " Impar");

            }

        }

    }

}