package Ejercicio5;

import java.util.Scanner;

public class Ejercicio6 {

public static void main(String[] args) {
		
		int car;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce 10 números: ");
		
		for(int i = 0; i <= 10; i++) {
			
			car = entrada.nextInt();
			
			if( car > 0 ) {
				
				 System.out.println("Es positivo");
			}else
				
				if( car < 0 ) {
					
					 System.out.println("Es negativo");
				} else
					
					if( car == 0 ) {
						
						 System.out.println("Es nulo");
					}

	}
		
		

}
}
