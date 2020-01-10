package Ejercicio5;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		int sum = 0;
		int contador = 0;
		System.out.println("Introduce números: ");
		
		do {
			
			
			
			num = entrada.nextInt();
			if(num > 0) {
			
			sum = sum + num;
			contador++;
			}
		}while(num > 0);
			
		
		int media = sum/ contador;
		
		System.out.println("La media es: " + media);
	}

}
