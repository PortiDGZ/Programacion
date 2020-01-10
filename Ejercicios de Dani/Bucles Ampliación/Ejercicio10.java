package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double suma = 0;
		int contador = 0;
		double n;
		
		do {
			System.out.print("Introduzca un número: ");
			n = scan.nextDouble();
			suma += (n >= 0)?n:0;
			contador += (n >= 0)?1:0;
		} while(n >= 0);
		
		System.out.println();
		
		if(contador > 0) {
			double media = suma / contador;
			System.out.println("Media: " + media);
		} else {
			System.out.println("Error: No ha introducido ningún número positivo o 0.");
		}
		
		scan.close();
	}
}
