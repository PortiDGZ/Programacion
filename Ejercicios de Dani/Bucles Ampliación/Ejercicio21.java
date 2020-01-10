package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escribe un número: ");
		int n = scan.nextInt();
		
		String nString = Integer.toString(n);
		String reverso = "";
		
		for(int i = nString.length() - 1; i >= 0; i--) {
			reverso = reverso + nString.charAt(i);
		}
		
		System.out.println("El número al revés es " + reverso + ".");
		
		scan.close();
	}
}
