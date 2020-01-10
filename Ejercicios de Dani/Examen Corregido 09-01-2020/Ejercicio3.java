package examen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Pide un valor inicial
		System.out.print("Introduce un número entero: ");
		int n = scan.nextInt();
		System.out.println();
		
		int maximo = n;
		int veces = 1;
		
		do {
			System.out.print("Introduce un número entero (0 para terminar): ");
			n = scan.nextInt();
			System.out.println();
			
			if (n != 0 && n > maximo) {
				// Se actualiza el nuevo máximo
				maximo = n;
				
				// Se devuelve el contador al inicio para el nuevo máximo
				veces = 1;
			} else if (n != 0 && n == maximo) {
				// Aumenta cada vez que se introduce
				veces++;
			}
		} while (n != 0);
		
		System.out.println("El máximo es " + maximo + ".");
		System.out.println("Ha sido introducido " + veces + " veces.");
		
		scan.close();
	}

}
