package ejercicios3;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca la base imponible: ");
		double base = scan.nextDouble();
		
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		scan.nextLine();
		String stringIVA = scan.nextLine().toLowerCase();
		
		System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
		String stringPromo = scan.nextLine().toLowerCase();
		
		System.out.printf("%-22s %10.2f€ \n", "Base imponible", base);
		
		int IVA = 0;
		
		switch(stringIVA) {
		case "general":
			IVA = 21;
			break;
		case "reducido":
			IVA = 10;
			break;
		case "superreducido":
			IVA = 6;
			break;
		}
		
		System.out.printf("IVA (%2d%-15s %10.2f€ \n", IVA, "%)", base * IVA / 100);
		
		double precioIVA = base + base * IVA / 100;
		
		System.out.printf("%-22s %10.2f€ \n", "Precio con IVA", precioIVA);
		
		double promo = 0;
		
		switch(stringPromo) {
		case "mitad":
			promo = - precioIVA / 2;
			break;
		case "meno5":
			if(precioIVA < 5) {
				promo = - precioIVA;
			} else {
				promo = - 5;
			}
			break;
		case "5porc":
			promo = - precioIVA * 5 / 100;
			break;
		}
		
		System.out.printf("Cód. promo. (%-5s)    %10.2f€ \n", stringPromo, promo);
		
		double TOTAL = precioIVA + promo;
		
		System.out.printf("%-22s %10.2f€", "TOTAL", TOTAL);
		
		scan.close();
	}
}
