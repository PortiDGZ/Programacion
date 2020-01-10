package ejercicios4;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int n = scan.nextInt();
		System.out.println();
		
		double total = 0;
		int contador = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
				contador++;
				total += i;
			}
		}
		
		System.out.println("Hay " + contador + " números.");
		System.out.println("Su suma es " + total + ".");
		
		scan.close();
	}
}
