package ejerciciosFunciones;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce la altura en metros: ");
		double h = scan.nextDouble();
		
		double t = Math.sqrt(2 * h / 9.81);
		
		System.out.println("");
		System.out.printf("Tarda en caer %.2fs.", t);
		
		scan.close();
	}
}
