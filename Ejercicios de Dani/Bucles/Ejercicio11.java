package ejercicios4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int positivos = 0;
		int negativos = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Escribe un n�mero: ");
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
		System.out.println("N�meros positivos: " + positivos);
		System.out.println("N�meros negativos: " + negativos);
		
		scan.close();
	}
}
