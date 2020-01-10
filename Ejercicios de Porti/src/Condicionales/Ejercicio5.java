package Ejercicio3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		Scanner medias = new Scanner(System.in);
		
		System.out.println("Introduce las notas: ");
		
		nota1 = medias.nextFloat();
		nota2 = medias.nextFloat();
		nota3 = medias.nextFloat();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("La media es: " + media);
		
		
		
	}
	
}
