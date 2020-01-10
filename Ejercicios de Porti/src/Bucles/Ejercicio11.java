package Ejercicio4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int lista = 0;
		int i;
		int positivos = 0;
		int negativos = 0;
		Scanner entrada = new Scanner(System.in);
		
		lista = entrada.nextInt();
		
		for(i = 0; i <= 8; i++) {
			
			lista = entrada.nextInt();
			
			if(lista < 0) {
				
				negativos = negativos + 1;
			}
			
			if(lista > 0) {
				
				positivos = positivos + 1;
			}
		}
		
		while(lista == 0) {
			
			System.out.println("Cero no se considera positivo ni negativo, vuelva a introducir un número: ");
			
			lista = entrada.nextInt();
			
			
			
		}
		
		System.out.println("Hay " + negativos + " números negativos.");
		
		System.out.println("Hay " + positivos + " números positivos.");
	}

}
