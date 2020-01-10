package Ejercicio4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int i = 0;
		double contador = 0;
		double media;
		double sumador = 0;
		double numero = 0;
		Scanner entrada = new Scanner(System.in);
		
		while(i >= 0) {
			
			System.out.print("Introduce los números para hacer la media(se detendrá al introducir uno negativo):");
			
			sumador = sumador + numero;
			
			contador++;
			
			i = entrada.nextInt();
		}
		
		if(i < 0) {
			
			System.out.println("Ha decidido parar.");
			
		}
		
		media = sumador/contador;
		
		System.out.println("La media de los números es: " + media);

	}

}
