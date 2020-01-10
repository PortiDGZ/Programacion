package ejercicios4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int combinacion;
		boolean abrir = false;
		
		do {
			System.out.print("Introduce la combinación: ");
			combinacion = scan.nextInt();
			if(combinacion == 4732) {
				abrir = true;
				i = 4;
			} else {
				System.out.println("Lo siento, esa no es la combinación.");
				i++;
			}
		} while(i < 4);
		
		if(abrir) {
			System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
		} else {
			System.out.println("Usted ha agotado todos los intentos para abrir la caja fuerte.");
		}
		
		scan.close();
	}
}
