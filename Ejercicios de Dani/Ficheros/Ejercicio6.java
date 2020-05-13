package ficheros;

import java.io.*;
import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Pedir nombre del fichero
		String nombre = Ejercicio3.pedirArchivo("Nombre del archivo: ");

		// Crear objeto del archivo
		File archivo = new File(nombre);

		// Pedir la palabra
		Scanner scanConsola = new Scanner(System.in);
		System.out.print("Palabra a contar: ");
		String palabra = scanConsola.next().trim().toLowerCase();
		scanConsola.close();
		System.out.println();

		// Contar palabra
		try {
			System.out.println(
					"La palabra " + palabra + " aparece " + ocurrencias(palabra, archivo) + " veces en el archivo.");
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
		}
	}

	// Cuenta el número de veces que aparece una palabra en un archivo
	private static int ocurrencias(String palabra, File archivo) throws FileNotFoundException {
		int total = 0;

		try (Scanner scan = new Scanner(archivo)) {
			while(scan.hasNext()) {
				// Si la palabra actual coincide con la buscada
				if(scan.next().replaceAll("[,.;]", "").trim().toLowerCase().equals(palabra)) {
					// Se suma 1 al total
					total++;
				}
			}
		}

		return total;
	}

}
