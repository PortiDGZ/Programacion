package ejercicios4;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		double media = 0;
		int impares = 0;
		int mayor = 0;
		
		do {
			if(n % 2 == 0) {
				if(mayor < n) {
					mayor = n;
				}
			} else {
				impares++;
				media += n;
			}
			System.out.print("Introduce un número: ");
			n = scan.nextInt();
		} while(n >= 0);
		
		if(mayor == 0) {
			System.out.println("No has introducido números pares.");
		} else {
			System.out.println("El mayor de los pares es " + mayor + ".");
		}
		
		if(media == 0) {
			System.out.println("No has introducido números impares.");
		} else {
			media /= impares;
			System.out.println("La media de los impares es " + media + ".");
		}
		
		scan.close();
	}
}
