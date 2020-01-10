package ejercicios4;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		
		do {
			System.out.print("Introduce un número entero positivo: ");
			n = scan.nextInt();
			System.out.println();
		} while(n <= 0);
		
		for(int i = 0; i < 5; i++) {
			boolean primo = true;
			for(int j = (n + i) / 2; j > 1; j--) {
				if((n + i) % j == 0) {
					primo = false;
					j = -1;
				}
			}
			if(primo) {
				System.out.println((n + i) + " es primo");
			} else {
				System.out.println((n + i) + " no es primo");
			}
		}
		
		scan.close();
	}

}
