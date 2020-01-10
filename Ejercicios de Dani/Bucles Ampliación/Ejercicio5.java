package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char c;
		
		do {
			System.out.print("Introduzca un caracter: ");
			c = scan.next().toLowerCase().charAt(0);
		} while(c != 'z');
		
		scan.close();
	}
}
