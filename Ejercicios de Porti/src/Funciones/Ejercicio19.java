package ejerciciosFunciones;

import java.util.Scanner;

public class Ejercicio18 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
		int a = scan.nextInt() - 2;
		
		System.out.println("Ahora introduzca la anchura de la pecera (como mínimo 4): ");
		int b = scan.nextInt() - 2;
		
		System.out.println();
		
		//Posición del pez
		int x = (int) (Math.random() * b + 1);
		int y = (int) (Math.random() * a + 1);
		
		for(int i = 1; i <= b + 2; i++) {
			System.out.print('*');
		}
		System.out.println();
		
		for(int i = 1; i <= a; i++) {
			System.out.print('*');
			for(int j = 1; j <= b; j++) {
				if(i == y & j == x) {
					System.out.print('&');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println('*');
		}
		
		for(int i = 1; i <= b + 2; i++) {
			System.out.print('*');
		}
		
		scan.close();
	}

}
