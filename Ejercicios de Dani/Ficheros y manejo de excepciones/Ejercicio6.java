package ficherosYManejoDeExcepciones;

import java.util.Scanner;

public class Ejercicio6 {

	private static boolean bucle = true;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		double base = 0;
		double altura = 0;
		
		do {
			bucle = true;
			
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

				if (base < 0) {
					bucle = true;
					System.out.println();
					System.out.println("La base no puede ser negativa.");
					System.out.println();
					base = 1;
				}
			} while (bucle);
			
			System.out.println();
			bucle = true;
			
			if (base != 0) {
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

					if (altura < 0) {
						bucle = true;
						System.out.println();
						System.out.println("La altura no puede ser negativa.");
						System.out.println();
						altura = 1;
					}
				} while (bucle);
				System.out.println();
				System.out.println("Área: " + base * altura);
				System.out.println();
				System.out.println("Perímetro: " + (base * 2 + altura * 2));
				System.out.println();
			}
		} while (base != 0);
		
		scan.close();
	}

	private static double pedirNumero(String string) {
		double base;
		System.out.print(string);
		base = scan.nextDouble();
		return base;
	}

}