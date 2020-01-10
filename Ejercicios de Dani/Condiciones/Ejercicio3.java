package ejercicios3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Número: ");
		int numero = scan.nextInt();
		System.out.println();
		
		switch(numero) {
		case 1:
			System.out.println("Lunes.");
			break;
		case 2:
			System.out.println("Martes.");
			break;
		case 3:
			System.out.println("Miércoles.");
			break;
		case 4:
			System.out.println("Jueves.");
			break;
		case 5:
			System.out.println("Viernes.");
			break;
		case 6:
			System.out.println("Sábado.");
			break;
		case 7:
			System.out.println("Domingo.");
			break;
		}
		
		scan.close();
	}

}
