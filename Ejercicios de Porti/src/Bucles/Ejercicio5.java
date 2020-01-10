package Ejercicio4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int i;
		
		int clave = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la combinación de 4 cifras: ");
		
		clave = entrada.nextInt();
		
		for(i = 0; i<=2;i++) {
			
		
		if(clave != 2907) {
			
			System.out.println("Lo siento, esa no es la combinación");
			
			System.out.print("Introduce la combinación de 4 cifras: ");
			
			clave = entrada.nextInt();
				}
		
		if(i == 2 & clave != 2907) {
			
			
			System.out.println("La caja fuerte se ha bloqueado");
		}
			
			}
		
		if(clave == 2907) {
			
			System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			
			

		}

	}
	
}
