package Ejercicios_M�todos;

import java.util.Scanner;

public class Ejercicio5 {
	
	//Este metodo convierte un n�mero en base 10 a su equivalente en base 2
	public static int decimalABinario(int n) {
		int bin = Ejercicio1.juntaNumeros(1, n % 2);
		
		while(n > 2) {
			n /= 2; //En cada iteraci�n, el decimal es reducido a la mitad
			bin = Ejercicio1.pegaPorDetras(bin, n % 2); //En cada iteraci�n, al n�mero se le a�ade el resto del decimal entre 2
		}
		
		bin = Ejercicio1.pegaPorDetras(bin, n / 2); //Finalmente, se le a�ade el cociente del decimal resultante (2 � 1) entre 2
		
		//El n�mero resultante est� invertido y tiene una cifra sobrante.
		//Esto es as� para evitar que se ignoren los 0 al colocarlos a la izquierda.
		//Se deveulve a la normalidad y se quita la cifra sobrante:
		bin = Ejercicio1.voltea(bin);
		bin = Ejercicio1.quitaPorDetras(bin, 1);
		
		return bin;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca un n�mero en decimal: ");
		int n = scan.nextInt();
		System.out.println();
		
		int bin = decimalABinario(n);
		
		System.out.println("El n�mero en binario es: " + bin);
		
		scan.close();
	}
}
