package ejercicios4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Número de términos a mostrar: ");
		int n = scan.nextInt();
		System.out.println();
		
		int n1 = 0;
		int n2 = 1;
		int total;
		
		System.out.print("0 ");
		
		if(n > 1) {
			System.out.print("1 ");
		}
		
		for(int i = 2; i < n; i++) {
			total = n1 + n2;
			System.out.print(total + " ");
			n1 = n2;
			n2 = total;
		}
		
		scan.close();
	}
}
