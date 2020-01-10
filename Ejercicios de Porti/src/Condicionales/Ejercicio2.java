package Ejercicio3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println("Introduce la hora: ");
	
		Scanner hora = new Scanner(System.in);
		
		int horaN = hora.nextInt();
		
	hora.close();
	
		
		if(horaN >= 6 & horaN <= 12) {
			
			System.out.println("Buenos días");
	}
		
		if(horaN >= 13 & horaN <= 20) {
			
			System.out.println("Buenas tardes.");

		}
		
		if(horaN >= 21 & horaN <= 5) {
			
			System.out.println("Buenas noches.");
		}
		
	}
}
		
		
