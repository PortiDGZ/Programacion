package ejercicios4;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escribe un número: ");
		int n = scan.nextInt();
		System.out.println();
		
		boolean primo = true;
		
		for(int i = n / 2; i > 1; i--) {
			if(n % i == 0) {
				primo = false;
				i = -1;
			}
		}
		
		if(primo) {
			System.out.println("El número es primo.");
		} else {
			System.out.println("El número no es primo.");
		}
		
		scan.close();
	}
}
