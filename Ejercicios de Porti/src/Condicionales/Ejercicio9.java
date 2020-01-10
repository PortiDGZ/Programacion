package Ejercicio3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int num1r;
		
		Scanner num1 = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		num1r = num1.nextInt();
		
		if(num1r % 2 == 0 & num1r % 5 == 0) {
			
			System.out.println(num1r + " es divisible entre 5 y es par.");
		}
		
	if(!(num1r % 2 == 0) & num1r % 5 == 0) {
			
			System.out.println(num1r + " es divisible entre 5 y no es par.");
		}
	
	if(num1r % 2 == 0 & !(num1r % 5 == 0)) {
		
		System.out.println(num1r + " no es divisible entre 5 y es par.");
	}
	
	if(!(num1r % 2 == 0) & !(num1r % 5 == 0)) {
		
		System.out.println(num1r + " no es divisible ni es par.");
	}
	
	}

}
