package ejerciciosAmpliaci�n;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n;
		boolean catorce = false;
		
		do {
			System.out.print("Introduzca un n�mero: ");
			n = scan.nextDouble();
			if(n == 14) {
				catorce = true;
			}
		} while(n != 27);
		
		System.out.println();
		
		if(catorce) {
			System.out.println("Se introdujo el n�mero 14.");
		} else {
			System.out.println("No se introdujo el n�mero 14.");
		}
		
		scan.close();
	}
}
