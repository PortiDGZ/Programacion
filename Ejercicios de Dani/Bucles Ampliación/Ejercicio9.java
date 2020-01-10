package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double suma = 0;
		double n;
		
		do {
			System.out.print("Introduzca un número: ");
			n = scan.nextDouble();
			suma += n;
		} while(n != 0);
		
		System.out.println();
		System.out.println("Suma: " + suma);
		
		scan.close();
	}
}
