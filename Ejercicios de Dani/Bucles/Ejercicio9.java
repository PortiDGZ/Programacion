package ejercicios4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int n = scan.nextInt();
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("%1d %10d %10d \n", n + i, (int) Math.pow(n + i, 2), (int) Math.pow(n + i, 3));
		}
		
		scan.close();
	}
}
