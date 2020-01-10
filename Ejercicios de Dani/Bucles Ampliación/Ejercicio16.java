package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escribe un número: ");
		int N = scan.nextInt();
		
		int contador = 0;
		
		for(int i = 1; i <= N; i++) {
			if(i % 7 == 0) {
				contador++;
			}
		}
		
		System.out.println("Hay " + contador + " múltiplos de 7 entre 1 y " + N + ".");
		
		scan.close();
	}
}
