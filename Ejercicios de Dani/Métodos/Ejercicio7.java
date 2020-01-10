package Ejercicios_M�todos;

import java.util.Scanner;

public class Ejercicio7 {
	//Este m�todo convierte cada cifra de un n�mero en una sucesi�n de "|" y las separa por un gui�n
	public static String convierteEnPalotes(int n) {
		String palos = "";
		int l = Ejercicio1.digitos(n);
		
		for(int i = 0; i <= l - 1; i++) { //Una iteraci�n por cada cifra
			int cifra = Ejercicio1.digitoN(n, i); //Se obtiene la cifra
			String cifraPalos = cifraAPalos(cifra); //La cifra es convertida a una sucesi�n de "|"
			palos = palos + "-" + cifraPalos; //Se a�ade a la cadena un gui�n y la cifra convertida
		}
		
		palos = palos.substring(1); //Se elimina un gui�n sobrante al principio de la cadena
		
		return palos;
	}
	
	//Este m�todo devuelve un n�mero de "|" igual al n�mero introducido
	public static String cifraAPalos(int n) {
		String palos = "";
		
		for(int i = 1; i <= n; i++) {
			palos = palos + "|";
		}
		
		return palos;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca un n�mero: ");
		int n = scan.nextInt();
		System.out.println();
		
		String palos = convierteEnPalotes(n);
		
		System.out.println(palos);
		
		scan.close();
	}
}
