package ejercicios3;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Boolean finde = false;
		
		System.out.println("�Qu� d�a es?");
		String dia = scan.nextLine().toLowerCase();
		System.out.println();
		
		System.out.println("�Qu� hora es?");
		int hora = scan.nextInt();
		System.out.println();
		
		System.out.println("�Qu� minuto es?");
		int minuto = scan.nextInt();
		System.out.println();
		
		switch(dia) {
		case "martes":
			hora += 24;
			break;
		case "mi�rcoles":
			hora += 48;
			break;
		case "jueves":
			hora += 72;
			break;
		case "viernes":
			hora += 96;
			break;
		case "s�bado":
			finde = true;
			break;
		case "domingo":
			finde = true;
			break;
		}
		
		minuto += hora * 60;
		int respuesta = 7020 - minuto;
		
		if(respuesta <= 0) {
			finde = true;
		}
		
		if(finde) {
			System.out.println("Ya es fin de semana.");
		} else {
			if (respuesta == 1) {
				System.out.println("Queda " + respuesta + " minuto para el fin de semana.");
			} else {
				System.out.println("Quedan " + respuesta + " minutos para el fin de semana.");
			}
		}
		
		scan.close();
	}
}
