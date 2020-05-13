package ficheros;

import java.io.*;
import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Crear el objeto fichero
		File fichero = new File("primos.dat");
		
		// Crear Scanner
		try (Scanner scan = new Scanner(fichero)) {
			// El Scanner lee el fichero y lo imprime por pantalla
			while(scan.hasNext()) {
				System.out.println(scan.next());
			}
		}
		catch (FileNotFoundException e) {
			// No se ha encontrado el fichero
			System.out.println("No se ha encontrado el archivo.");
		}
	}

}
