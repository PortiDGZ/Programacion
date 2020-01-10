package Ejercicio4;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int n;
		int i;
		int alm = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		n = entrada.nextInt();
		
		if(n >= 0) {
			
			
			for(i = n + 1; i <= n + 100  ; i++) {
			
				 alm += i;
			}
			
			System.out.println("La suma de los 100 números siguientes es: " + alm);
			
		}

	}

}
