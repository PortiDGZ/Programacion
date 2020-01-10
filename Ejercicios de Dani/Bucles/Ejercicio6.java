package ejercicios4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int n = scan.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i * n);
		}
		
		scan.close();
	}
}
