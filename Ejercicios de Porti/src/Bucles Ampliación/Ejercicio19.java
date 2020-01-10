package Ejercicio5;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		double num;
		
		double cont = 0;
		
		double suma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce varios números (el cero detendra la introduccion): ");
		
		do {
			num = entrada.nextInt();
			
			if(num > 0) {
				
				cont++;
				
				suma = suma + num;
			}
			
			
		}while(num != 0);
		
		double media = suma/cont;
		
		System.out.print("La media aritmética de los números introducidos es: " + media);
		

	}

}
