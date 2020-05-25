package ficherosYManejoDeExcepciones;

import java.io.*;
import java.util.*;

public class Ejercicio1 {

	// Main
	public static void main(String[] args) {
		try {
			// Pedir n�meros
			double doble = pedirDouble();
			float flotante = pedirFloat();
			
			// Mostrar n�meros
			masAlto(doble, flotante);
		} catch (IOException e) {
			System.out.println("Error de entrada/salida.");
		}
	}

	// Pide un float por teclado
	private static float pedirFloat() throws IOException {
		boolean seguir = true;
		float flotante = 0;
		do {
			try {
				System.out.print("Introduce un float: ");
				Scanner scan = new Scanner(System.in);
				flotante = scan.nextFloat();
				System.out.println();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("No se ha introducido un float.");
			}
		} while (seguir);
			
		return flotante;
	}

	// Pide un double por teclado
	private static double pedirDouble()  throws IOException  {
		boolean seguir = true;
		double doble = 0;
		do {
			try {
				System.out.print("Introduce un double: ");
				Scanner scan = new Scanner(System.in);
				doble = scan.nextDouble();
				System.out.println();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("No se ha introducido un double.");
			}
		} while (seguir);
			
		return doble;
	}

	// Muestra el valor m�s alto de los dos par�metros
	private static void masAlto(double doble, double flotante) {
		System.out.println("El mayor es: " + Math.max(doble, flotante));
	}

}
