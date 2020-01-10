package ejerciciosFunciones;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Cuánto dinero quiere apostar?");
		double dinero = scan.nextDouble();
		
		System.out.println();
		
		int dado1 = (int) (Math.random() * 6 + 1);
		System.out.println("Dado 1: " + dado1);
		
		int dado2 = (int) (Math.random() * 6 + 1);
		System.out.println("Dado 2: " + dado2);
		
		int total = dado1 + dado2;
		System.out.println("Total: " + total);
		
		System.out.println();
		
		if(total == 7 | total == 11) {
			System.out.printf("¡Ganas %.2f€!", dinero);
		} else {
			if(total == 2 | total == 3 | total == 12) {
				System.out.println("Has perdido.");
			} else {
				System.out.println("Segunda etapa.");
				System.out.println();
				
				int total2 = 0;
				
				do {
					dado1 = (int) (Math.random() * 6 + 1);
					System.out.println("Dado 1: " + dado1);
					
					dado2 = (int) (Math.random() * 6 + 1);
					System.out.println("Dado 2: " + dado2);
					
					total2 = dado1 + dado2;
					System.out.println("Total: " + total2);
					
					System.out.println();
					
					if(total2 != total & total2 != 7) {
						System.out.println("Nueva etapa etapa.");
						System.out.println();
					}
					
				} while (total2 != total & total2 != 7);
				
				if(total2 == 7) {
					System.out.println("Has perdido.");
				} else {
					System.out.printf("¡Ganas %.2f€!", dinero);
				}
			}
		}
		
		scan.close();
	}
}
