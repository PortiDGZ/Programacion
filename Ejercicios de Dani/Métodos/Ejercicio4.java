package Ejercicios_Métodos;

import java.util.Scanner;

public class Ejercicio4 {
	
	//Este método convierte un número binario en su equivalente decimal
	public static int binarioADecimal(int bin) {
		int l = Ejercicio1.digitos(bin);
		
		int n = 0;
		
		for(int i = 0; i <= l - 1; i++) { //Una iteración por cada cifra, comenzando desde la izquierda
			n += Ejercicio1.potencia(2, i) * Ejercicio1.digitoN(bin, l - i - 1); //Cada cifra es multiplicada por 2 elevado a la posición de la cifra y se suma al total
		}
		
		return n;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca un número en binario: ");
		int bin = scan.nextInt();
		System.out.println();
		
		int n = binarioADecimal(bin);
		
		System.out.println("Número en decimal: " + n);
		
		scan.close();
	}
}
