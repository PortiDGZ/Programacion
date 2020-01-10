package Ejercicio5;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int i;
		
		int N;
		
		int fact = 1;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce N (debe ser un número entero positivo comprendido entre 0 y 16): ");
		
		N = entrada.nextInt();
		
		
		for(i = 1; i<=N; i++) {
			
			fact = i*fact;
			
		}
		
		System.out.println(fact);
		

	}

}
