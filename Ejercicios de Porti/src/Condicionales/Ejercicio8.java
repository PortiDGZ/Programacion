package Ejercicio3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int num1c;
		int num2c;
		int num3c;
		int aux;
		System.out.println("Introduce tres números enteros: ");
		
		Scanner num1 = new Scanner(System.in);
		
		num1c = num1.nextInt();
		num2c = num1.nextInt();
		num3c = num1.nextInt();
		
		if(num1c < num2c) {
			aux = num1c;
			num1c = num2c;
			num2c = aux;
			
		}
		
		if(num1c < num3c) {
			aux = num1c;
			num1c = num3c;
			num3c = aux;
		}
		
		if(num2c<num3c) {
			aux = num2c;
			num2c = num3c;
			num3c = aux;
		}
		System.out.println(num1c);
		System.out.println(num2c);
		System.out.println(num3c);

	}

}
