package Ejercicio5;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		
		int N = 0;
		
		int i;
		
		char resp;
		
		int cont = 0;
		
		int suma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		do {
			
			System.out.print("Introduce un número: ");
			
			N = entrada.nextInt();
			
			if(N >=0) {
				
			
				for(i=1; i<=N; i++) {
				
					cont = (i*3) + cont;
			}
		}
			System.out.println("La suma es: " + cont);
			
			System.out.print("¿Quiere ejecutar el programa de nuevo? (S/N): ");
			
			resp = entrada.next().toUpperCase().charAt(0);
			
			if(resp == 'S') {
				
				cont = 0;
			}
		
		}while(resp == 'S');

	}

}
