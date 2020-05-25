package ficherosYManejoDeExcepciones;

import java.util.Scanner;

public class Ejercicio4 {
	
	private static boolean bucle = true;
	private static Scanner scan = new Scanner(System.in);
	private static double max = 0;
	private static boolean numero = true;

	public static void main(String[] args) {
		try {
			System.out.print("Introduzca un número: ");
			max = scan.nextDouble();
		} catch (Exception e) {
			System.out.println();
			System.out.println("Se ha introducido una letra.");
			System.out.println();
			numero = false;
		} 
		
		if (numero) {
			do {
				pedirNumero();
			} while (bucle);
			System.out.println("Mayor: " + max);
		} else {
			System.out.println("No se ha introducido ningún número.");
		}
		
		scan.close();
	}

	private static void pedirNumero() {
		try {
			System.out.print("Introduzca un número: ");
			max = Math.max(scan.nextDouble(), max);
		} catch (Exception e) {
			System.out.println();
			System.out.println("Se ha introducido una letra.");
			System.out.println();
			scan.nextLine();
			bucle = false;
		}
	}

}
