package ficherosYManejoDeExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {

	private static double suma = 0;
	private static Scanner scan = new Scanner(System.in);
	private static int pares = 0;

	public static void main(String[] args) {
		do {
			pedirNumero();
		} while (pares < 10);

		System.out.println();
		System.out.println("Suma total: " + suma);

		scan.close();
	}

	private static void pedirNumero() {
		try {
			System.out.print("Introduzca un número: ");
			double n = scan.nextDouble();
			suma += n;
			if (n % 2 == 0) {
				pares ++;
			}
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("No ha introducido un número.");
			scan.nextLine();
		}
		System.out.println();
	}

}