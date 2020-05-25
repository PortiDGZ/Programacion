package ficherosYManejoDeExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		double max = 0;
		int errores = 0;
		Scanner scan = new Scanner(System.in);
		boolean bucle = true;
		
		do {
			try {
				System.out.print("Introduzca un número: ");
				max = scan.nextDouble();
				bucle = false;
			} catch (InputMismatchException e) {
				System.out.println("No ha introducido un número.");
				scan.nextLine();
				errores++;
			}
		} while (bucle);
		
		for (int i = 0; i < 9; i++) {
			bucle = true;
			do {
				try {
					System.out.print("Introduzca un número: ");
					max = Math.max(scan.nextDouble(), max);
					bucle = false;
				} catch (InputMismatchException e) {
					System.out.println("No ha introducido un número.");
					scan.nextLine();
					errores++;
				}
			} while (bucle);
		}
		
		System.out.println();
		System.out.println("Mayor: " + max);
		System.out.println("Número de errores: " + errores);
		
		scan.close();
	}

}
