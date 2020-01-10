package Ejercicio5;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		boolean catorce = false;
Scanner entrada = new Scanner(System.in);
		
		int num;
		System.out.print("Introduce números: ");
		do {
			
			num = entrada.nextInt();
			
			if(num == 14) {
				
				catorce = true;
				
			}
			
		}while(num != 27);
		
		if(catorce = true) {
			
			System.out.print("Se ha leído el 14");
			
		}
	}

}
