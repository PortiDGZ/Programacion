package ficherosYManejoDeExcepciones;

import java.io.*;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		File datos = new File("datos.txt");
		
		try (FileWriter pw = new FileWriter(datos, true)) {
			try (Scanner scan = new Scanner(System.in)) {
				datos.createNewFile();
				System.out.println("Línea:");
				String texto = scan.nextLine();
				while(!texto.equals("FIN")) {
					pw.write(texto + "\n");
					System.out.println("Línea:");
					texto = scan.nextLine();
				}
			}
		} catch (IOException e) {
			System.out.println("Error de entrada/salida.");
		}
	}

}
