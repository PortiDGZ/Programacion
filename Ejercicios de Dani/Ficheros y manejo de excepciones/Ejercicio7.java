package ficherosYManejoDeExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {

	private static double suma = 0;
	private static int errores = 0;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			pedirNumero();
		} while (suma < 1000);

		System.out.println();
		System.out.println("Número de errores: " + errores);

		scan.close();
	}

	private static void pedirNumero() {
		try {
			System.out.print("Introduzca un número: ");
			double n = scan.nextDouble();
			suma += n;
			System.out.println();
			System.out.println(n);
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("No ha introducido un número.");
			scan.nextLine();
			errores++;
		}
		System.out.println();
	}

}