package ejercicios3;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota del primer control:");
		double nota1 = scan.nextDouble();
		System.out.println();
		
		System.out.println("Nota del segundo control:");
		double nota2 = scan.nextDouble();
		System.out.println();
		
		double media = (nota1 + nota2) / 2;
		
		if(media < 5) {
			System.out.println("Nota de la recuperación (apto/no apto):");
			scan.nextLine();
			String recuperacion = scan.nextLine().toLowerCase();
			System.out.println();
			if(recuperacion.equals("apto")) {
				media = 5;
			}
		}
		
		System.out.println("La nota de la asignatura es " + media + ".");
		
		scan.close();
	}
}
