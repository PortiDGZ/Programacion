package ejerciciosAmpliaci�n;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escribe un n�mero entero y positivo: ");
		int N = scan.nextInt();
		
		int suma = 0;
		
		for(int i = 1; i <= N; i++) {
			suma += i * 3;
		}
		
		System.out.println("La suma de los " + N + " primeros m�ltiplos de 3 es " + suma + ".");
		
		scan.close();
	}
}
