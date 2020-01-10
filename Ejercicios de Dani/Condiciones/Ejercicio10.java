package ejercicios3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe el carácter:");
		char ch = scan.nextLine().charAt(0);
		System.out.println();
		
		System.out.println("Escribe el tipo de pirámide:");
		String tipo = scan.nextLine();
		System.out.println();
		
		switch(tipo.toLowerCase()) {
		case "arriba":
			System.out.println("   " + ch);
			System.out.println("  " + ch + ch + ch);
			System.out.println(" " + ch + ch + ch + ch + ch);
			System.out.println(ch + "" + ch + ch + ch + ch + ch + ch);
			break;
		case "abajo":
			System.out.println(ch + "" + ch + ch + ch + ch + ch + ch);
			System.out.println(" " + ch + ch + ch + ch + ch);
			System.out.println("  " + ch + ch + ch);
			System.out.println("   " + ch);
			break;
		case "derecha":
			System.out.println(ch);
			System.out.println(ch + "" + ch);
			System.out.println(ch + "" + ch + ch);
			System.out.println(ch + "" + ch + ch + ch);
			System.out.println(ch + "" + ch + ch);
			System.out.println(ch + "" + ch);
			System.out.println(ch);
			break;
		case "izquierda":
			System.out.println("   " + ch);
			System.out.println("  " + ch + "" + ch);
			System.out.println(" " + ch + "" + ch + ch);
			System.out.println(ch + "" + ch + ch + ch);
			System.out.println(" " + ch + "" + ch + ch);
			System.out.println("  " + ch + "" + ch);
			System.out.println("   " + ch);
			break;
		}
		
		scan.close();
	}

}
