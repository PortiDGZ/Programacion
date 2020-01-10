package Ejercicio4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		int contador = 0;
		int i;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número por teclado: ");
		
		num1 = entrada.nextInt();
		
			
			for(i = 0; i < 5; i++) {
				num2 = (int) Math.pow(num1, 2);
				
				num3 = (int) Math.pow(num1, 3);
				
				System.out.printf("%-30s %-30s %-10s%n", num1, num2, num3);
				
				num1 = num1 + 1;

		}

	}
}