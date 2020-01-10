package ejerciciosFunciones;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el segundo: ");
		int s = scan.nextInt();
		
		int m = (int) Math.floor(s / 60.0) + 1;
		
		m = Math.min(m, 90);
		
		System.out.println("Nos encontramos en el minuto " + m + ".");
		
		scan.close();
	}
}
