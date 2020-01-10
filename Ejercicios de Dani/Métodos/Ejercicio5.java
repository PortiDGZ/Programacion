package Ejercicios_Métodos;

import java.util.Scanner;

public class Ejercicio5 {
	
	//Este metodo convierte un número en base 10 a su equivalente en base 2
	public static int decimalABinario(int n) {
		int bin = Ejercicio1.juntaNumeros(1, n % 2);
		
		while(n > 2) {
			n /= 2; //En cada iteración, el decimal es reducido a la mitad
			bin = Ejercicio1.pegaPorDetras(bin, n % 2); //En cada iteración, al número se le añade el resto del decimal entre 2
		}
		
		bin = Ejercicio1.pegaPorDetras(bin, n / 2); //Finalmente, se le añade el cociente del decimal resultante (2 ó 1) entre 2
		
		//El número resultante está invertido y tiene una cifra sobrante.
		//Esto es así para evitar que se ignoren los 0 al colocarlos a la izquierda.
		//Se deveulve a la normalidad y se quita la cifra sobrante:
		bin = Ejercicio1.voltea(bin);
		bin = Ejercicio1.quitaPorDetras(bin, 1);
		
		return bin;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca un número en decimal: ");
		int n = scan.nextInt();
		System.out.println();
		
		int bin = decimalABinario(n);
		
		System.out.println("El número en binario es: " + bin);
		
		scan.close();
	}
}
