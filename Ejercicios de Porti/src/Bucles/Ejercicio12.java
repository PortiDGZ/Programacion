package Ejercicio4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		int b;
		int e = 0;
		int f;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una base: ");
		
		b = entrada.nextInt();
		
		System.out.println("Introduce un exponente: ");
		
		e = entrada.nextInt();
		
		while(e < 0) {
			
			System.out.println("Introduce un número entero positivo: ");
			
			e = entrada.nextInt();
			
		}
		
		f = (int) Math.pow(b, e);
		
		System.out.println("El resultado de: " + b + " elevado a " + e + " es: " + f);

	}

}
