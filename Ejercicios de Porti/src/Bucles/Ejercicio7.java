package Ejercicio4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		
		int i = 1;
		
		int j;
		
		int num;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el número: ");
		
		num = entrada.nextInt();
		
		j = num;
		
		while(j > 10) {
			
			j /= 10;
			
			i++;
		}
		
		System.out.println(num + " tiene " + i + " dígitos");		

	}

}
