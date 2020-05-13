package manejoDeExcepciones;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Pide los números
		int max = pedirNumero();
		
		for(int i = 1; i <= 5; i++) {
			int n = pedirNumero();
			if(n > max) {
				max = n;
			}
		}
		
		// Muestra el mayor
		System.out.println("El mayor es " + max + ".");
	}

	// Pide un número entero por teclado
	private static int pedirNumero() {
		int numero = 0;
		boolean incorrecto = true;
		
		do {
			System.out.print("Introduzca un número entero: ");
			try {
				Scanner scan = new Scanner(System.in);
				numero = scan.nextInt();
				incorrecto = false;
			} catch (InputMismatchException e) {
				System.out.println("No se ha introducido un número entero.");
			} 
		} while (incorrecto);
		System.out.println();
		
		return numero;
	}

}
