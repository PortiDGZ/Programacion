package Ejercicio3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		float nota1s;
		float nota2s;
		float nota3s;
		float notaf = 0;
		
		Scanner nota1 = new Scanner(System.in);
		
		Scanner nota2 = new Scanner(System.in);
		
		Scanner nota3 = new Scanner(System.in);
		
		System.out.println("Introduce la primera nota: ");
		
		nota1s = nota1.nextFloat();
		
		System.out.println("Introduce la segunda nota: ");
		
		nota2s = nota2.nextFloat();
		
		System.out.println("Introduce la tercera nota: ");
		
		nota3s = nota3.nextFloat();
		
		
		System.out.println("Ahora se realizará la media de las notas: ");
		
		System.out.println("Nota 1: + " + nota1s + " Nota 2: + " + nota2s + " Nota 3: + " + nota3s + " /3 " + " = " + ((nota1s + nota2s + nota3s)/ 3));
		
		notaf = (nota1s + nota2s + nota3s)/3;
		
		if(notaf <5.0) {
			
			System.out.println("Insuficiente");
		}else
		
		if(notaf >= 5.0 & notaf < 6.0) {
			
			System.out.println("Suficiente");
		}else
		
		if(notaf >= 6.0 & notaf < 7.0) {
	
	System.out.println("Bien");
}
		
		if(notaf >= 7.0 & notaf < 9.0) {
			
			System.out.println("Notable");
		}else
		
		if(notaf >= 9.0 & notaf <= 10) {
			
			System.out.println("Sobresaliente");
		}

		
	}

}