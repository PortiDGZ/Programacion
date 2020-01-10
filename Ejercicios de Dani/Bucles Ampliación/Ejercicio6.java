package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int positivos = 0;
		int negativos = 0;
		int nulos = 0;
		
		for(int i = 1; i<= 10; i++) {
			int n;
			System.out.print("Introduzca un número: ");
			n = scan.nextInt();
			
			if(n > 0) {
				positivos++;
			} else {
				if(n < 0) {
					negativos++;
				} else {
					nulos++;
				}
			}
		}
		
		System.out.println();
		System.out.println("Ha introducido " + positivos + " números positivos.");
		System.out.println("Ha introducido " + negativos + " números negativos.");
		System.out.println("Ha introducido " + nulos + " nulos.");
		
		scan.close();
	}
}
