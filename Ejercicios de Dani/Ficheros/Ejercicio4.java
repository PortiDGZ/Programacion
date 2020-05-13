package ficheros;

import java.io.*;
import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Pedir el nombre del archivo
		String original = Ejercicio3.pedirArchivo("Nombre del archivo original: ");
				
		// Crear el objeto archivo
		File palabras =  new File(original);
		
		if (palabras.exists()) {
			// Obtener las líneas del archivo
			ArrayList<String> lista = lineas(palabras);
			
			// Ordenar las líneas
			Collections.sort(lista, String.CASE_INSENSITIVE_ORDER);
			
			// Crear el objeto archivo de destino
			File sort = new File("sort_" + original);
			
			// Crea el archivo rellenandolo con la lista
			rellenaConArrayList(sort, lista);
		} else {
			System.out.println("No se ha encontrado el archivo.");
		}
	}

	// Escribe las líneas de un arraylist en un archivo
	public static void rellenaConArrayList(File archivo, ArrayList<String> lista) {
		try {
			// Crear el archivo
			archivo.createNewFile();
			
			try (PrintWriter printer = new PrintWriter(archivo)) {
				// Copiar una palabra del arraylist a cada línea del archivo
				for(String palabra : lista) {
					printer.println(palabra);
				}
				
				// Mensaje final
				System.out.println("Archivo creado con éxito.");
			}
			catch (FileNotFoundException e) {
				// No se ha podico crear el PrintWriter
				System.out.println("Se ha producido un error al acceder al archivo.");
			}
			
		} catch (IOException e) {
			// La operación createNewFile() ha fallado
			System.out.println("No se ha podido crear el archivo.");
		}
	}

	// Lee las líneas de un archivo y las introduce en un arraylist
	public static ArrayList<String> lineas(File palabras) {
		// Líneas del archivo
		ArrayList<String> lista = new ArrayList<String>();
		
		try(Scanner scan = new Scanner(palabras)) {
			// Lee las líneas y las introduce en el arraylist
			while(scan.hasNextLine()) {
				lista.add(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
		}
		
		return lista;
	}

}
