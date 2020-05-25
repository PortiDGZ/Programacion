package ficherosYManejoDeExcepciones;

import java.io.*;
import java.util.*;

public class Ejercicio17 {

	public static void main(String[] args) {
		File datos = new File("enteros.txt");

		try (Scanner scan = new Scanner(datos)) {
			int cantidad = 0;
			int suma = 0;
			try {
				while (scan.hasNextLine()) {
					StringTokenizer st = new StringTokenizer(scan.nextLine());
					while (st.hasMoreTokens()) {
						int n = Integer.parseInt(st.nextToken());
						System.out.println(n);
						cantidad++;
						suma += n;
					}
				} 
			} catch (NumberFormatException e) {
			}
			
			System.out.println();
			System.out.println("Se han mostrado " + cantidad + " números.");
			System.out.println("Total: " + suma);
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
		}
	}

}
