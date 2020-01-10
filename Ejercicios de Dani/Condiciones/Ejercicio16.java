package ejercicios3;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
		String comida = scan.nextLine();
		
		comida = comida.toUpperCase().charAt(0) + comida.substring(1) + ":";
		
		double precio = 0;
		
		switch(comida.toLowerCase()) {
		case "palmera:":
			precio = 1.4;
			break;
		case "donut:":
			precio = 1;
			break;
		case "pitufo:":
			System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
			String pitufo = scan.nextLine().toLowerCase();
			switch(pitufo) {
			case "aceite":
				precio = 1.2;
				break;
			case "tortilla":
				precio = 1.6;
				break;
			}
			comida = "Pitufo con " + pitufo + ":";
			break;
		}
		
		System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
		String bebida = scan.nextLine();
		
		bebida = bebida.toUpperCase().charAt(0) + bebida.substring(1) + ":";
		
		double precio2 = 0;
		
		switch(bebida.toLowerCase()) {
		case "zumo:":
			precio2 = 1.5;
			break;
		case "cafe:":
			precio2 = 1.2;
			bebida = "Café:";
			break;
		case "café:":
			precio2 = 1.2;
			break;
		}
		
		System.out.printf("%-20s %4.2f€\n", comida, precio);
		System.out.printf("%-20s %4.2f€\n", bebida, precio2);
		System.out.printf("%-20s %4.2f€", "Total desayuno:", precio + precio2);
		
		scan.close();
	}
}
