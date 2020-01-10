package Ejercicio3;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		char ch;
		
		String direccion;
		
		System.out.printf("Con que letra o símbolo hacer la pirámide: ");
		
		Scanner letra = new Scanner(System.in);

		ch = letra.nextLine().charAt(0);
		
		System.out.println("Introduzca la direccion de la pirámide: ");
		
		direccion = letra.nextLine();
		
		direccion.toLowerCase();		
		
		
		switch(direccion) {
		
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
		
		}
	}


