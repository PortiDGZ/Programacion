package ficherosYManejoDeExcepciones;

import java.io.*;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		File datos = new File("datos.txt");

		try (Scanner scan = new Scanner(datos)) {
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
		}
	}

}
