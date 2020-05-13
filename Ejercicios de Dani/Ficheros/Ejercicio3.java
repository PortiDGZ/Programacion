package ficheros;

import java.io.*;
import java.util.*;

public class Ejercicio3 {
	
	static Scanner scanConsola = new Scanner(System.in);

	public static void main(String[] args) {
		// Pedir los nombres de archivo
		String nombre1 = pedirArchivo("Nombre del primer archivo: ");
		String nombre2 = pedirArchivo("Nombre del segundo archivo: ");
		
		// Crear los objetos archivo
		File archivo1 =  new File(nombre1);
		File archivo2 =  new File(nombre2);
		
		// Crea los archivos y los rellena si no existen
		if (!archivo1.exists()) {
			rellenarConNumeros(archivo1, 1, 30);
		}
		if (!archivo2.exists()) {
			rellenarConNumeros(archivo2, 50, 60);
		}
		// Objeto archivo resultado
		String nombreMezcla = pedirArchivo("Nombre del archivo resultante: ");
		scanConsola.close();
		File archivoMezcla =  new File(nombreMezcla);
		
		// Crea y rellena el archivo resultado
		mezclarArchivos(archivo1, archivo2, archivoMezcla);
	}

	// Pide el nombre de un archivo
	public static String pedirArchivo(String texto) {
		System.out.print(texto);
		return scanConsola.nextLine() + ".dat";
	}

	// Mezcla dos ficheros en un tercer fichero
	public static void mezclarArchivos(File archivo1, File archivo2, File archivoMezcla) {
		try {
			// Crear el fichero representado por el objeto
			archivoMezcla.createNewFile();

			// Crear PrintWriter
			try (PrintWriter printer = new PrintWriter(archivoMezcla)) {
				// Scanners para los ficheros originales
				Scanner scan1 = new Scanner(archivo1);
				Scanner scan2 = new Scanner(archivo2);
				
				// El PrintWriter escribe los números en el fichero
				while(scan1.hasNextLine() || scan2.hasNextLine()) {
					if (scan1.hasNextLine()) {
						printer.println(scan1.nextLine());
					}
					if (scan2.hasNextLine()) {
						printer.println(scan2.nextLine());
					}
				}
				
				scan1.close();
				scan2.close();
				
				// Mensaje final
				System.out.println("Archivos mezclados con éxito.");
			} catch (FileNotFoundException e) {
				// No se ha podico crear el PrintWriter
				System.out.println("Se ha producido un error al acceder al archivo.");
			}
		} catch (IOException e) {
			// La operación createNewFile() ha fallado
			System.out.println("No se ha podido crear el archivo.");
			return;
		}
	}

	// Crea el archivo y lo rellena con números
	// Usado en caso de que los archivos no existan
	public static void rellenarConNumeros(File fichero, int i, int j) {
		try {
			// Crear el fichero representado por el objeto
			fichero.createNewFile();
			
			// Crear PrintWriter
			try (PrintWriter printer = new PrintWriter(fichero)) {
				// El PrintWriter escribe los números en el fichero
				for (int n = i; n <= j; n++) {
					printer.println(n);
				}
			} catch (FileNotFoundException e) {
				// No se ha podico crear el PrintWriter
				System.out.println("Se ha producido un error al acceder al archivo.");
			}
		} catch (IOException e) {
			// La operación createNewFile() ha fallado
			System.out.println("No se ha podido crear el archivo.");
			return;
		}
	}

}
