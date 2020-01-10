package ejerciciosFunciones;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Primera nota: ");
		double n1 = scan.nextDouble();
		
		double minimo = n1;
		double maximo = n1;
		double media = n1;
		
		System.out.println((double) Math.ceil(n1 * 10) / 10);
		System.out.println((double) Math.floor(n1 * 10) / 10);
		System.out.println((int) n1);
		System.out.println();
		
		System.out.print("Segunda nota: ");
		double n2 = scan.nextDouble();
		
		minimo = Math.min(minimo, n2);
		maximo = Math.max(maximo, n2);
		media += n2;
		
		System.out.println((double) Math.ceil(n2 * 10) / 10);
		System.out.println((double) Math.floor(n2 * 10) / 10);
		System.out.println((int) n2);
		System.out.println();
		
		System.out.print("Tercera nota: ");
		double n3 = scan.nextDouble();
		
		minimo = Math.min(minimo, n3);
		maximo = Math.max(maximo, n3);
		media += n3;
		
		System.out.println((double) Math.ceil(n3 * 10) / 10);
		System.out.println((double) Math.floor(n3 * 10) / 10);
		System.out.println((int) n3);
		System.out.println();
		
		System.out.print("Cuarta nota: ");
		double n4 = scan.nextDouble();
		
		minimo = Math.min(minimo, n4);
		maximo = Math.max(maximo, n4);
		media += n4;
		
		System.out.println((double) Math.ceil(n4 * 10) / 10);
		System.out.println((double) Math.floor(n4 * 10) / 10);
		System.out.println((int) n4);
		System.out.println();
		
		System.out.print("Quinta nota: ");
		double n5 = scan.nextDouble();
		
		minimo = Math.min(minimo, n5);
		maximo = Math.max(maximo, n5);
		media += n5;
		media /= 5;
		
		System.out.println((double) Math.ceil(n5 * 10) / 10);
		System.out.println((double) Math.floor(n5 * 10) / 10);
		System.out.println((int) n5);
		System.out.println();
		
		System.out.println("Mayor: " + maximo);
		System.out.println("Menor: " + minimo);
		System.out.println("Media: " + media);
		
		scan.close();
	}
}
