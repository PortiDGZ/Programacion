package ficherosYManejoDeExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {

	private static double max = 0;
	private static Scanner scan = new Scanner(System.in);
	private static boolean bucle = true;

	public static void main(String[] args) {
		do {
			pedirNumero();
		} while (bucle);

		System.out.println("Mayor: " + max);

		scan.close();
	}

	private static void pedirNumero() {
		try {
			System.out.print("Introduzca el primer número: ");
			max = scan.nextDouble();
			System.out.println();
			
			System.out.print("Introduzca el segundo número: ");
			max = Math.max(max, scan.nextDouble());
			System.out.println();
			
			System.out.print("Introduzca el tercer número: ");
			max = Math.max(max, scan.nextDouble());
			
			bucle = false;
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("No ha introducido un número.");
			scan.nextLine();
		}
		System.out.println();
	}

}