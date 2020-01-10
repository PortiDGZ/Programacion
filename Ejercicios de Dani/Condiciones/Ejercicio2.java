package ejercicios3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Qué hora es?");
		int hora = scan.nextInt();
		System.out.println();
		
		if(hora >= 6 & hora <= 12) {
			System.out.println("Buenos días.");
		} else {
			
			if(hora >= 13 & hora <= 20) {
				System.out.println("Buenas tardes.");
			} else {
				
				if((hora >= 21 & hora <= 23) | (hora >= 0 & hora <= 5)) {
					System.out.println("Buenas noches.");
				}
			}
		}
		
		scan.close();
	}

}
