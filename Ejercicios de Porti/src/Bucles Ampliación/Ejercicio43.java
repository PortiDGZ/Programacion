package Ejercicio5;

import java.util.Scanner;

public class Ejercicio43 {

	public static void main(String[] args) {
		
		int i;
		
		int N = 0;
		
		
		int contador = 2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número N: ");
		
		N = entrada.nextInt();
	
		  for(i = 2; i<=N; i++) {
			  boolean primo = true;
			 for(int j = 2; j<= i/2; j++) {
				 
				 if(i % j==0) {
					 
					 primo = false;
					 
				 }
			 } if(primo) {
				 
				 System.out.println("El número " + i + " es primo");
				 
			 }
			 
		  }
		}
	}
