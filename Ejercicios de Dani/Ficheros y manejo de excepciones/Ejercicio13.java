package ficherosYManejoDeExcepciones;

import java.io.*;
import java.util.*;

public class Ejercicio13 {

	public static void main(String[] args) {
		File datos = new File("datos.txt");
		try (PrintWriter pw = new PrintWriter(datos)) {
			try (Scanner scan = new Scanner(System.in)) {
				datos.createNewFile();
				System.out.println("Línea:");
				String texto = scan.nextLine();
				while(!texto.equals("FIN")) {
					pw.println(texto);
					System.out.println("Línea:");
					texto = scan.nextLine();
				}
			}
		} catch (IOException e) {
			System.out.println("Error de entrada/salida.");
		}
	}

}
