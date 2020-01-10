package Ejercicio4;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		int num;
		
		int suma = 0;
		
		int media;
				
		int cont = 0;
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce numeros: ");
		
		do {
			
			num = entrada.nextInt();
			
			suma = num + suma;
			
			cont = cont + 1;
			
			media = suma/cont;
			
			}while(suma <= 10000);
		
System.out.println("Ha introducido: " + cont + " numeros");
		
		System.out.println("La media es " + media);
		
		System.out.println("El máximo es " + suma);
		

	}

}
