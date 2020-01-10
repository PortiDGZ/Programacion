package Ejercicio3;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		float nota1;
		float nota2;
		float media;
		String aptitud;
		
		Scanner notas = new Scanner(System.in);
		
		System.out.println("Introduce la nota del primer examen: ");
		
		nota1 = notas.nextFloat();
		
		System.out.println("Introduce la nota del segundo examen: ");
		
		nota2 = notas.nextFloat();
		
		media = (nota1 + nota2) /2;
		
		if(media >= 5.0 & media <= 10.0) {
			
			System.out.println("Enhorabuena, estás aprobado con una media de: " + media);
			
		}else System.out.println("¿Cuál ha sido el resultado de la recuperación?(apto/no apto): ");
		
		notas.nextLine();
		
		aptitud = notas.nextLine().toLowerCase();
		
		
		if(aptitud .contentEquals("apto")) {

			media = 5;
			
			System.out.println("Tu media es de: " + media);
			
		}else System.out.println("Tu media es: " + media);

	}
}