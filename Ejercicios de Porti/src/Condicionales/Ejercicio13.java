package Ejercicio3;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		String dia;
		int horas;
		int minutos;
		int total;
		int viernes;
		
		viernes = 7020;
		
		Scanner fecha = new Scanner(System.in);
		
		System.out.println("Indica el día de la semana (Lunes a Viernes): ");
		
		dia = fecha.nextLine();
		
		dia.toLowerCase();
		
		System.out.println("Introduce la hora: ");
		
		horas = fecha.nextInt();
		
		horas = horas * 60;
		
		System.out.println("introduce los minutos: ");
		
		minutos = fecha.nextInt();
		
		total = minutos + horas; 
	
		if(dia .contentEquals("lunes")) {
			
			viernes = viernes - total;
			
			System.out.println("Quedan: "+ viernes + " minutos para el viernes");
			
			
		}
		
		if( dia .contentEquals("martes")) {
			
			total = total + 1440;
			
			viernes = viernes - total;
			
			System.out.println("Quedan: "+ viernes + " minutos para el viernes");
			
		}
		
		if( dia .contentEquals("miércoles") || dia .contentEquals("miercoles")) {
			
			total = total + 2880;
			
			viernes = viernes - total;
			
			System.out.println("Quedan: "+ viernes + " minutos para el viernes");
			
		}
		
		if( dia .contentEquals("jueves")) {
			
			total = total + 4320;
			
			viernes = viernes - total;
			
			System.out.println("Quedan: "+ viernes + " minutos para el viernes");
			
		}
		
if( dia .contentEquals("viernes")) {
			
			total = total + 5760;
			
			viernes = viernes - total;
			
			System.out.println("Quedan: "+ viernes + " minutos para el viernes");
			
		}

	}

}




