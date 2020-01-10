package ejercicios3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		double nota1 = scan.nextDouble();
		System.out.println();
		
		System.out.print("Nota 2: ");
		double nota2 = scan.nextDouble();
		System.out.println();
		
		System.out.print("Nota 3: ");
		double nota3 = scan.nextDouble();
		System.out.println();
		
		System.out.println("La nota media es: " + ((nota1 + nota2 + nota3) / 3));
		
		scan.close();
	}

}
