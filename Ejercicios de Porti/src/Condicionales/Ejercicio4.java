package Ejercicio3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int sueldo;
		int hsem;
		
		System.out.println("Cuantas horas trabajas a la semana: ");

		Scanner horas = new Scanner(System.in);

		hsem = horas.nextInt();
		
		if(hsem >= 0 & hsem <= 40) {
			
			System.out.println("El sueldo semanal es de: " + (hsem * 12));
			
		}
		
		while(hsem < 0) {
			
			System.out.println("Introduce una cantidad válida: ");
			
			
			hsem = horas.nextInt();
		}
		
		if(hsem > 40) {
		
			sueldo = 480;
			
			sueldo = sueldo + (hsem - 40) * 16;
			
			
			
			System.out.println("El sueldo semanal es de: " + (sueldo));
			
	}

}
	
}
