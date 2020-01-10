package ejercicios4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escribe la base: ");
		int b = scan.nextInt();
		System.out.print("Escribe el exponente: ");
		int e = scan.nextInt();
		
		int resultado = b;
		
		for(int i = 1; i < e; i++) {
			resultado *= b;
		}
		
		System.out.println();
		System.out.println("Resultado: " + resultado);
		
		scan.close();
	}
}
