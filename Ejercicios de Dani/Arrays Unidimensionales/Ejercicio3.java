package arraysUnidimensionales;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] tabla = new int[10];
		
		rellenar(tabla);
		
		System.out.println();
		
		Ejercicio1.print(tabla);
		
		scan.close();
	}

	public static void rellenar(int[] tabla) {
		for(int i = tabla.length - 1; i >= 0; i--) {
			tabla[i] = pedirInt();
		}
	}

	public static int pedirInt() {
		System.out.print("Introduce un número entero: ");
		
		return leerInt();
	}

	public static int leerInt() {
		String next = scan.next();
		
		while(!isInt(next)) {
			System.out.print("El número no se ha introducido correctamente. Intentelo de nuevo: ");
			next = scan.next();
		}
		
		return  Integer.parseInt(next);
	}
	
	public static boolean isInt(String s) {
	 try
	  { Integer.parseInt(s); return true; }
	 catch(NumberFormatException er)
	  { return false; }
	}

}
