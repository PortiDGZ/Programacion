package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double N;
		double suma = 0;
		int contador = 0;
		
		do {
			System.out.print("Escribe un número (0 para terminar): ");
			N = scan.nextDouble();
			
			if(N != 0) {
				suma += N;
				contador++;
			}
		} while(N != 0);
		
		double media = suma / contador;
		
		System.out.println("La media es " + media + ".");
		
		scan.close();
	}
}
