package ficheros;

import java.io.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Crear el objeto fichero
		File fichero = new File("primos.dat");
		
		try {
			// Crear el fichero representado por el objeto
			fichero.createNewFile();
			
			// Crear PrintWriter
			try (PrintWriter printer = new PrintWriter(fichero)) {
				// El PrintWriter escribe los números en el fichero
				for (int i = 2; i <= 500; i++) {
					if (primo(i)) {
						printer.println(i);
					}
				}
			} catch (FileNotFoundException e) {
				// No se ha podico crear el PrintWriter
				System.out.println("Se ha producido un error al acceder al archivo.");
			}
			
			// Mensaje final
			System.out.println("Archivo creado con éxito.");
		} catch (IOException e) {
			// La operación createNewFile() ha fallado
			System.out.println("No se ha podido crear el archivo.");
			return;
		}
	}

	// True si el int parámetro es un número primo. False si es compuesto.
	public static boolean primo(int primo) {
		for(int i = 2; i <= primo / 2; i++) {
			if(primo % i == 0) {
				return false;
			}
		}
		return true;
	}

}
