package ejercicios3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe un número:");
		int n = scan.nextInt();
		System.out.println();
		
		if(n % 2 == 0) {
			System.out.println("Es par.");
		}
		else {
			System.out.println("No es par.");
		}
		
		
		if(n % 5 == 0) {
			System.out.println("Es divisible entre 5.");
		}
		else {
			System.out.println("No es divisible entre 5.");
		}
		
		scan.close();
	}

}
