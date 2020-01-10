package ejerciciosAmpliación;

import java.util.Scanner;

public class Ejercicio21_b {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int a = n;
		int l = 0;
		
		while(a != 0) {
			a /= 10;
			l++;
		}
		
		for (int i = 0; i < l; i++) {
			int cifra = (int) (n / Math.pow(10, i)) - (int) (n / Math.pow(10, i + 1)) * 10;
			a += cifra * Math.pow(10, l - i - 1);
		}
		
		System.out.println(a);
		
		scan.close();
	}
}
