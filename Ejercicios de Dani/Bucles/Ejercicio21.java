package ejercicios4;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int m = scan.nextInt();
		System.out.print("Introduce otro número: ");
		int n = scan.nextInt();
		System.out.println();
		
		int longitud = Integer.toString(m).length();
		int par = 0;
		int impar = 0;
		
		for(int i = 0; i < longitud; i++) {
			int cifra = Integer.parseInt(Integer.toString(m).charAt(i) + "");
			if(cifra % 2 == 0) {
				par = Integer.parseInt(Integer.toString(par) + cifra);
			} else {
				impar = Integer.parseInt(Integer.toString(impar) + cifra);
			}
			
			cifra = Integer.parseInt(Integer.toString(n).charAt(i) + "");
			if(cifra % 2 == 0) {
				par = Integer.parseInt(Integer.toString(par) + cifra);
			} else {
				impar = Integer.parseInt(Integer.toString(impar) + cifra);
			}
		}
		
		System.out.println("El número formado por los dígitos pares es " + par + ".");
		System.out.println("El número formado por los dígitos impares es " + impar + ".");
		
		scan.close();
	}
}
