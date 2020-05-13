package manejoDeExcepciones;

import java.io.*;
import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Generar número aleatorio
		Random rand = new Random();
		int n = rand.nextInt(5);
		
		// Crear excepción
		try {
			switch(n) {
			case 0:
				throw new NumberFormatException();
			case 1:
				throw new IOException();
			case 2:
				throw new FileNotFoundException();
			case 3:
				throw new IndexOutOfBoundsException();
			case 4:
				throw new ArithmeticException();
			}
		} catch (NumberFormatException e) {
			System.out.println("Excepción de formato de número.");
		} catch (FileNotFoundException e) {
			System.out.println("Excepción de archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Excepción de entrada/salida.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Excepción de índice fuera de los límites.");
		} catch (ArithmeticException e) {
			System.out.println("Excepción aritmética.");
		}
	}

}
