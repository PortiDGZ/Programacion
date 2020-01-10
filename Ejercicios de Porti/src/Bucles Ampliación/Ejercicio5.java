package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

public static void main(String[] args) {
		
		String car = null;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce caracteres: ");
		
		do {
		
			
			car = entrada.next().charAt(0) + "";
			
			car.toLowerCase();
			
			if(car .contentEquals("a") || car .contentEquals("e") || car .contentEquals("i") || car .contentEquals("o") || car .contentEquals("u") ) {
				
				 System.out.println("Es vocal");
			}

		}while (!car .contentEquals("z"));
		
		

}
}
