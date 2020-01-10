package Ejercicio5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String car;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce caracteres: ");
		
		for(int i = 0; i <= 100; i++) {
			
			car = entrada.next().charAt(0) + "";
			
			if(car .contentEquals("a") || car .contentEquals("e") || car .contentEquals("i") || car .contentEquals("o") || car .contentEquals("u") ) {
				
				 System.out.println("Es vocal");
			}

	}
		
		

}
}
