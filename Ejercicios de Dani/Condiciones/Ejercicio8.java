package ejercicios3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double aux;
		
		System.out.print("Número 1: ");
		double mayor = scan.nextDouble();
		System.out.println();
		
		System.out.print("Número 2: ");
		double medio = scan.nextDouble();
		System.out.println();
		
		System.out.print("Número 3: ");
		double menor = scan.nextDouble();
		System.out.println();
		
		if(mayor < medio) {
			aux = mayor;
			mayor = medio;
			medio = aux;
		}
		if(mayor < menor) {
			aux = mayor;
			mayor = menor;
			menor = aux;
		}
		if(medio < menor) {
			aux = medio;
			medio = menor;
			menor = aux;
		}
		
		System.out.println(menor);
		System.out.println(medio);
		System.out.println(mayor);
		
		scan.close();
	}

}
