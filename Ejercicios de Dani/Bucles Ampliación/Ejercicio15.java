package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean seguir = true;
		
		do {
			System.out.print("Escribe una base entera y positiva: ");
			int base = scan.nextInt();
			
			System.out.print("Escribe un exponente entero y positivo: ");
			int exponente = scan.nextInt();
			
			int resultado = 1;
			
			for(int i = 1; i <= exponente; i++) {
				resultado *= base;
			}
			
			System.out.println("El resultado es " + resultado + ".");
			
			System.out.print("¿Deseas seguir ejecutando el programa S/N?");
			seguir = scan.next().toLowerCase().charAt(0) == 's';
			
			System.out.println();
		} while(seguir);
		
		scan.close();
	}
}
