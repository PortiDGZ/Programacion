package ejercicios4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n = 0;
		int i = -1;
		double media = 0;
		
		do {
			i++;
			media += n;
			System.out.print("Introduce un número: ");
			n = scan.nextDouble();
		} while(n >= 0);
		
		media /= i;
		System.out.println("La media es " + media + ".");
		
		scan.close();
	}
}
