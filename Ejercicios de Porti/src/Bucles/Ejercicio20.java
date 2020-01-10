package Ejercicio4;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		int num;
		
		int contador = 0;
		
		int suma = 0;
		
		int i;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número: "); 
		
		num = entrada.nextInt();
		
		for(i = 1; i <= num; i++) {
			
			if(i % 3 == 0) {
				
				contador = contador + 1;
				
				suma = suma + i;
				
			}
			
			
		}
		System.out.println("Hay " + contador + " múltiplos de 3");
		
		System.out.println("La suma es: " + suma);

	}

}
