package ejercicios4;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int resultado = 0;
		
		do {System.out.print("Escribe un número entero y positivo: ");
			n = scan.nextInt();
			if(n < 1) {
				System.out.println("El número debe ser positivo.");
			}
		} while(n < 1);
		
		System.out.println();
		
		for(int i = 0; i <= 99; i++) {
			resultado += n + i;
		}
		
		System.out.println("El resultado es: " + resultado);
		
		scan.close();
	}
}
