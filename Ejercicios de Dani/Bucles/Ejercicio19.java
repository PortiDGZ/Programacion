package ejercicios4;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Número de filas a mostrar: ");
		int n = scan.nextInt();
		
		for(int i = 0; i <= n; i++) {
			for(int espacios = n - i; espacios > 0; espacios--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for(int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		scan.close();
	}
}
