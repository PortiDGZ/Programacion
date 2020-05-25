package ficherosYManejoDeExcepciones;

import java.io.*;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		File datos = new File("enteros.txt");

		try (Scanner scan = new Scanner(datos)) {
			int cantidad = 0;
			int suma = 0;
			while (scan.hasNextInt()) {
				int n = scan.nextInt();
				System.out.println(n);
				cantidad++;
				suma += n;
			}
			
			System.out.println();
			System.out.println("Se han mostrado " + cantidad + " números.");
			System.out.println("Total: " + suma);
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
		}
	}

}
