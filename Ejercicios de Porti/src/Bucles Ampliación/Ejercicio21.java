package Ejercicio5;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		
		
		String numinv;
		
		String Alberto = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un n�mero: ");
		
		numinv = entrada.nextLine();
		
		for(int i= 0; i < numinv.length(); i++) {
			
			Alberto = numinv.charAt(i) + Alberto;
			
			
		}
		
		System.out.print("El n�mero dado la vuelta es: " + Alberto);

	}

}
