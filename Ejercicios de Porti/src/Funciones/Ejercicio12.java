import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio12 {

    public static void main(String[] args) throws IOException {

        double nota = 0;

        String entrada = null;

        BufferedReader br= new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("Introduce 5 notas: ");

        for (int i = 0; i<5; i++) {

            entrada = br.readLine();

            nota = Double.parseDouble(entrada);

            Math.ceil(nota);
            Math.floor(nota);
            Math.round(nota);
        }
        System.out.println(nota);

    }
}
