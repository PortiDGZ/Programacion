package ejercicios4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		
		int n = scan.nextInt();
		int cifras = 0;
		while(n != 0) {
			cifras++;
			n = (int) n / 10;
		}
		
		System.out.print("El número tiene " + cifras + " cifras.");
		
		scan.close();
	}
}
