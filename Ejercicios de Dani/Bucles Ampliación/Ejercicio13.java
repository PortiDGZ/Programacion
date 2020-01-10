package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int factorial = 1;
		
		System.out.print("Introduzca un número: ");
		int n = scan.nextInt();
		
		for(int i = n; i > 1; i--) {
			factorial *= i;
		}
		
		System.out.println();
		
		System.out.println("El factorial de " + n + " es " + factorial + ".");
		
		scan.close();
	}
}
