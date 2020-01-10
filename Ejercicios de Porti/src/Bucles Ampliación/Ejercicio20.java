package Ejercicio5;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		double nota;
		
		double aux;
		
		double notaux;
		
		double notamax = -1;
		
		double notamin = 11;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce notas (una nota inválida detendrá la introducción): ");
		
		do {
			
			nota = entrada.nextDouble();
				if(nota >= 0 && nota <= 10) {
				if(nota > notamax) {
					
					notamax = nota;
					
				}
				
					if(nota < notamin) {
						
						notamin = nota;
					}
				}
					
			}while(nota >= 0 && nota <= 10);
			
			
				System.out.println("La nota máxima es: " + notamax);
				
				System.out.println("La nota minima es: " + notamin);
			
	}			
}

