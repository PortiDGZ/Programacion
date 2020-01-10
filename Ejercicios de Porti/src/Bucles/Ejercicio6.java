package Ejercicio4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int i;
		int num;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("De que numero desea la tabla de multiplicar: ");
		
		num = entrada.nextInt();
		
		for(i = 0; i<=10; i++) {
			
			System.out.println(num * i);
		}

	}

}
