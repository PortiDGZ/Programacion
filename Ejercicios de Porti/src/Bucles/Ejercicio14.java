package Ejercicio4;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int num;
		int esprimo = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		num = entrada.nextInt();
		
		do {
			
			if(num % num == 0 & num % 1 == 0 & !(num % 2 == 0) & !(num % 3 == 0) & !(num % 5 == 0) & !(num % 7 == 0) & !(num % 11 == 0)) {
			
				esprimo = 1;
				
				System.out.println("El número es primo.");
			
		}
			
			if(num % num == 0 & num % 1 == 0 || (num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0) || (num % 7 == 0) || (num % 11 == 0)) {
				
				System.out.println("No es primo, introduce otro número: ");
				
				num = entrada.nextInt();
				
			}
		

	}while(esprimo != 1);

}
}