package Ejercicio4;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		
		
		int num;
		
		int i;
		
		boolean premoh;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número. ");
		
		num = entrada.nextInt();
		
		while(num < 0) {
			
			System.out.print("Introduce otro número: ");
			
			num = entrada.nextInt();
			
		}
		
		for(i = num; i < num + 5; i++) {
				premoh = true;
				for(num = i/2; num > 1; num--) {
					
					if(i % num == 0) {
						
						premoh = false;
			
		}

	}
				
				if(premoh) {
					
					System.out.println(num + " es primo");
					
				}
				
				if(!premoh) {
					
					System.out.println(num + " no es primo");
				}

}
		
	}
}
