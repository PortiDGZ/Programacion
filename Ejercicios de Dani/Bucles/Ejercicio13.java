package ejercicios4;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escribe la base: ");
		double b = scan.nextDouble();
		System.out.print("Escribe el exponente: ");
		int e = scan.nextInt();
		System.out.println();
		
		double resultado = b;
		System.out.println(resultado);
		
		for(int i = 1; i < e; i++) {
			resultado *= b;
			System.out.println(resultado);
		}
		
		scan.close();
	}
}
