package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int contador = 0;
		
		do {
			System.out.print("Introduzca un número: ");
			n = scan.nextInt();
			
			if(n % 2 != 0) {
				contador++;
			}
		} while(n != 0);
		
		System.out.println();
		System.out.println("Ha introducido " + contador + " números impares.");
		
		scan.close();
	}
}
