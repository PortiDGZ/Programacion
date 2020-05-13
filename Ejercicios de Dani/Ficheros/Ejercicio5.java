package ficheros;

import java.io.*;
import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Pedir el nombre del programa
		System.out.print("Nombre del programa: ");
		String nombre = Ejercicio3.scanConsola.nextLine();
		
		// Crear objeto archivo
		File programa = new File(nombre + ".java");
		
		// Comprobar si existe
		if(programa.exists()) {
			// Crear objeto archivo destino
			File programaSinComentarios = new File(nombre + " sin comentarios.java");
			
			try {
				// Crear fichero destino
				programaSinComentarios.createNewFile();
				
				// Copiar programa1 al 2 sin comentarios
				copiarSinComentarios(programa, programaSinComentarios);
			} catch (IOException e) {
				System.out.println("No se ha podido acceder al archivo.");
			}
		} else {
			System.out.println("No se ha podido encontrar el archivo.");
		}
	}

	private static void copiarSinComentarios(File original, File nuevo) {
		try (Scanner scan = new Scanner(original)) {
			try (PrintWriter printer = new PrintWriter(nuevo)) {
				// Se copian las líneas ignorando los comentarios
				while (scan.hasNextLine()) {
					// Guardar la línea actual
					String linea = scan.nextLine();
					if(linea.matches(".*//.*")) {
						// Eliminar comentarios de una línea
						printer.println(linea.split("//")[0]);
					} else if(linea.matches(".*/\\*.*")) {
						// Eliminar comentarios de bloque
						if (linea.matches(".*/\\*.*\\*/.*")) {
							String[] trozos = linea.split("/\\*.*\\*/");
							for (String trozo : trozos) {
								printer.print(trozo);
							}
							printer.println();
						} else {
							printer.println(linea.split("/\\*")[0]);
							linea = scan.nextLine();
							while(!linea.matches(".*\\*/.*")) {
								linea = scan.nextLine();
							}
							try {
								printer.println(linea.split("\\*/")[1]);
							} catch (Exception e) {}
						}
					} else {
						// No hay comentario, escribir la línea sin más
						printer.println(linea);
					}
				}
				
				// Mensaje final
				System.out.println("Programa creado con éxito.");
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido encontrar el archivo.");
		}
	}

}
