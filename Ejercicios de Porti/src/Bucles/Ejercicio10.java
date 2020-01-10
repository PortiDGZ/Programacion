package Ejercicio4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		
		int n, fib = 0;
		int almacen = 1;
		int i;
		int almacen2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce n: ");
		
		n = entrada.nextInt();
		
		System.out.print("Los " + n + " primeros números de la serie de Fibonacci son: ");
		
		for(i = 0; i <= n; i++) {
			
			 almacen2 = fib; 
			 fib = almacen + fib;
			 almacen = almacen2;
			System.out.print(almacen);
			
			
		}

	}

}
