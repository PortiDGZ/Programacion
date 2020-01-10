package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escribe un número entero y positivo: ");
		int N = scan.nextInt();
		
		for(int i = 2; i <= N; i++) {
			if(N % i != 0) {
				System.out.print(i + " ");
			}
		}
		
		scan.close();
	}
}
