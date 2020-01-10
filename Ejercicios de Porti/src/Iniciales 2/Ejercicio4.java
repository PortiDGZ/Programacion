package Ejercicio2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int e;
		
		int a;
		
		Scanner Euros = new Scanner(System.in);
		
		System.out.println("Introduzca la cantidad en €: ");
		
		e = Euros.nextInt();
		
		a = e*166;
		
		System.out.println("La cantidad en pesetas es:" + a);
		

	}

}
