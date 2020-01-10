package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n;
		
		do {
			System.out.print("Introduzca un número: ");
			n = scan.nextDouble();
		} while(n != 7.75);
		
		scan.close();
	}
}
