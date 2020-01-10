package Ejercicio5;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
int base;
		
		int exp;
		
		int i;
		
		int resultado;
		char resp;
		
		Scanner entrada = new Scanner(System.in);
		do {
		System.out.println("Introduce la base: ");
		
		base = entrada.nextInt();
		
		System.out.println("Introduce el exponente: ");
		
		exp = entrada.nextInt();
		
		resultado = base;
		
		for(i = 1; i < exp; i++) {
			
			resultado = base*resultado;
			
		}
		
		System.out.println(resultado);
		
		System.out.println("¿Quiere seguir ejecutando el programa?(S/N): ");
		
		resp = entrada.next().toUpperCase().charAt(0);
		
		
		}while(resp == 'S');
System.out.println("El programa ha finalizado con éxito.");
	}

}
