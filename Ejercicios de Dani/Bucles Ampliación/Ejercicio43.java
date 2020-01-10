package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio43 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escribe un número entero y positivo: ");
		int N = scan.nextInt();
		
		for(int i = 2; i <= N; i++) {
			boolean primo = true;
			
			for(int j = i / 2; j >= 2; j--) {
				if(i % j == 0) {
					primo = false;
				}
			}
			
			if(primo) {
				System.out.print(i + " ");
			}
		}
		
		scan.close();
	}
}
