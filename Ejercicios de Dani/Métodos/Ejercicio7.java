package Ejercicios_Métodos;

import java.util.Scanner;

public class Ejercicio7 {
	//Este método convierte cada cifra de un número en una sucesión de "|" y las separa por un guión
	public static String convierteEnPalotes(int n) {
		String palos = "";
		int l = Ejercicio1.digitos(n);
		
		for(int i = 0; i <= l - 1; i++) { //Una iteración por cada cifra
			int cifra = Ejercicio1.digitoN(n, i); //Se obtiene la cifra
			String cifraPalos = cifraAPalos(cifra); //La cifra es convertida a una sucesión de "|"
			palos = palos + "-" + cifraPalos; //Se añade a la cadena un guión y la cifra convertida
		}
		
		palos = palos.substring(1); //Se elimina un guión sobrante al principio de la cadena
		
		return palos;
	}
	
	//Este método devuelve un número de "|" igual al número introducido
	public static String cifraAPalos(int n) {
		String palos = "";
		
		for(int i = 1; i <= n; i++) {
			palos = palos + "|";
		}
		
		return palos;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		int n = scan.nextInt();
		System.out.println();
		
		String palos = convierteEnPalotes(n);
		
		System.out.println(palos);
		
		scan.close();
	}
}
