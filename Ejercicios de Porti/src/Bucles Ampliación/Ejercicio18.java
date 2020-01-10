package Ejercicio5;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		int N;
		
		int i;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		
		N = entrada.nextInt();
		
		for(i = 1; i<=N; i++) {
			
			
			if(N%i != 0) {
				
				
				System.out.println(i);
				
			}
			
			
		}
		
		

	}

}
