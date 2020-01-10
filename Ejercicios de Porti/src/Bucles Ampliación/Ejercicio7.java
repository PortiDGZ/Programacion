package Ejercicio5;

import java.util.Scanner;

public class Ejercicio7 {

public static void main(String[] args) {
		
		int car = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce números: ");
		
		do {
		
			
			car = entrada.nextInt();
			
			
			if(car % 2 != 0) {
				
				 System.out.println("Es impar");
			}

		}while(car != 0);
		
		

}
}
