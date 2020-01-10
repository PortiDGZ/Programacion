package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escribe una base entera y positiva: ");
		int base = scan.nextInt();
		
		System.out.print("Escribe un exponente entero y positivo: ");
		int exponente = scan.nextInt();
		
		int resultado = 1;
		
		for(int i = 1; i <= exponente; i++) {
			resultado *= base;
		}
		
		System.out.println("El resultado es " + resultado + ".");
		
		scan.close();
	}
}
