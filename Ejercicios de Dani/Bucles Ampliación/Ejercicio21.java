package ejerciciosAmpliaci�n;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escribe un n�mero: ");
		int n = scan.nextInt();
		
		String nString = Integer.toString(n);
		String reverso = "";
		
		for(int i = nString.length() - 1; i >= 0; i--) {
			reverso = reverso + nString.charAt(i);
		}
		
		System.out.println("El n�mero al rev�s es " + reverso + ".");
		
		scan.close();
	}
}
