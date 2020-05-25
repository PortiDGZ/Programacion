package ficherosYManejoDeExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		double n = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			try {
				System.out.print("Introduzca un n�mero: ");
				n = scan.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("No ha introducido un n�mero.");
				scan.nextLine();
			} 
		} while (n < 1 || n > 5);
		
		System.out.println("N�mero encontrado.");
		
		scan.close();
	}

}
