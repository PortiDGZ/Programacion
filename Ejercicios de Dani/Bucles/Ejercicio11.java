package ejercicios4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int positivos = 0;
		int negativos = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Escribe un número: ");
			n = scan.nextInt();
			if(n > 0) {
				positivos++;
			} else {
				if(n < 0) {
					negativos++;
				}
			}
		}
		
		System.out.println();
		System.out.println("Números positivos: " + positivos);
		System.out.println("Números negativos: " + negativos);
		
		scan.close();
	}
}
