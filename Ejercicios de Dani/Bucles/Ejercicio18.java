package ejercicios4;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n = 0;
		double media = 0;
		double total = 0;
		int contador = 0;
		
		do {
			System.out.print("Introduce un número: ");
			n = scan.nextDouble();
			
			contador++;
			total += n;
		} while(total <= 10000);
		
		media = total / contador;
		
		System.out.println();
		System.out.println("Ha introducido " + contador + " números.");
		System.out.println("Su suma es " + total + ".");
		System.out.println("Su media es " + media + ".");
		
		scan.close();
	}
}
