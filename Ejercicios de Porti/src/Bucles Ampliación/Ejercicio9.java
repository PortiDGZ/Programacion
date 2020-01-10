package Ejercicio5;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		double car = 0;
		double suma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce números: ");
		
		do {
		
			
			car = entrada.nextDouble();
			
			suma = car + suma;
		

		}while(car != 0);
		
		System.out.println("La suma es: " + suma);

}
}
