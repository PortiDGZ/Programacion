package Ejercicio5;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int base;
		
		int exp;
		
		int i;
		
		int resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la base: ");
		
		base = entrada.nextInt();
		
		System.out.println("Introduce el exponente: ");
		
		exp = entrada.nextInt();
		
		resultado = base;
		
		for(i = 1; i < exp; i++) {
			
			resultado = base*resultado;
			
		}
		
		System.out.println(resultado);
		

	}

}
