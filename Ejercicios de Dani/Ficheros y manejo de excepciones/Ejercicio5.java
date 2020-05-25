package ficherosYManejoDeExcepciones;

import java.util.Scanner;

public class Ejercicio5 {

	private static boolean bucle = true;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		double base = 1;
		double altura = 1;
		do {
			try {
				base = pedirNumero("Introduzca la base: ");
				bucle = false;
			} catch (Exception e) {
				System.out.println();
				System.out.println("Se ha introducido una letra.");
				System.out.println();
				scan.nextLine();
			}
			
			if (base <= 0) {
				bucle = true;
				System.out.println();
				System.out.println("La base debe ser positiva.");
				System.out.println();
				base = 1;
			}
		} while (bucle);
		
		System.out.println();
		bucle = true;
		
		do {
			try {
				altura = pedirNumero("Introduzca la altura: ");
				bucle = false;
			} catch (Exception e) {
				System.out.println();
				System.out.println("Se ha introducido una letra.");
				System.out.println();
				scan.nextLine();
			}
			
			if (altura <= 0) {
				bucle = true;
				System.out.println();
				System.out.println("La altura debe ser positiva.");
				System.out.println();
				altura = 1;
			}
		} while (bucle);
		
		System.out.println();
		System.out.println("Área: " + base * altura);
		System.out.println();
		System.out.println("Perímetro: " + (base * 2 + altura * 2));

		scan.close();
	}

	private static double pedirNumero(String string) {
		double base;
		System.out.print(string);
		base = scan.nextDouble();
		return base;
	}

}
