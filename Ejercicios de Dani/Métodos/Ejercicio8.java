package Ejercicios_Métodos;

import java.util.Scanner;

public class Ejercicio8 {
	//Este método covierte una cifra de 0 a 9 en su determinante numeral correspondiente
	public static String cifraAString(int cifra) {
		String s = "";
		
		switch(cifra) {
		case 0:
			s = "cero";
			break;
			
		case 1:
			s = "uno";
			break;
			
		case 2:
			s = "dos";
			break;
			
		case 3:
			s = "tres";
			break;
			
		case 4:
			s = "cuatro";
			break;
			
		case 5:
			s = "cinco";
			break;
			
		case 6:
			s = "seis";
			break;
			
		case 7:
			s = "siete";
			break;
			
		case 8:
			s = "ocho";
			break;
			
		case 9:
			s = "nueve";
			break;
		}
		
		return s;
	}
	
	//Este método covierte cada cifra de un número en su determinante numeral correspondiente y los separa con ", "
	private static String convierteEnPalabras(int n) {
		String palabras = "";
		int l = Ejercicio1.digitos(n);
		
		for(int i = 0; i <= l - 1; i++) { //Una iteración por cada cifra
			int cifra = Ejercicio1.digitoN(n, i); //Obtiene la cifra
			String palabra = cifraAString(cifra); //Convierte la cifra en determinante
			
			palabras = palabras + palabra + ", "; //Añade la cifra y un ", " a la cadena
		}
		
		palabras = palabras.substring(0, palabras.length() - 2); // Elimina una coma sobrante al final
		
		return palabras;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		int n = scan.nextInt();
		System.out.println();
		
		String palabras = convierteEnPalabras(n);
		
		System.out.println(palabras);
		
		scan.close();
	}
}
