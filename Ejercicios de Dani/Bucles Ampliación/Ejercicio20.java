package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double nota;
		double mayor = -1;
		double menor = 11;
		
		do {
			System.out.print("Escribe una nota entre 0 y 10: ");
			nota = scan.nextDouble();
			
			if(nota >= 0 & nota <= 10) {
				if(nota > mayor) {
					mayor = nota;
				} 
				
				if(nota < menor) {
					menor = nota;
				}
			}
		} while(nota >= 0 & nota <= 10);
		
		if(mayor < 0) {
			System.out.println("No ha introducido ningún número válido.");
		} else {
			System.out.println("La mayor es " + mayor + ".");
			System.out.println("La menor es " + menor + ".");
		}
		
		scan.close();
	}
}
