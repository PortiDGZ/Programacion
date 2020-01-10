package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int dia;
		
		System.out.printf("Escribe un número del 1 al 7: ");
		
		Scanner d = new Scanner(System.in);

		dia = d.nextInt();
			
			
			while(dia < 1 || dia > 7) {
				
				System.out.println("Escribe un número válido: ");
				
				dia = d.nextInt();
			}
			
			d.close();
			
			switch(dia) {

			case 1: System.out.println("Lunes");
			
			break;
			
			case 2: System.out.println("Martes");
			
			break;
			
			case 3: System.out.println("Miercoles");
			
			break;
			
			case 4: System.out.println("Jueves");
			
			break;
			
			case 5: System.out.println("Viernes");
			
			break;
			
			case 6: System.out.println("Sábado");
			
			break;
			
			case 7: System.out.println("Domingo");
			
			break;
	}

	}
	
}
