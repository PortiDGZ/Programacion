package ejercicios3;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		double nota1 = scan.nextDouble();
		System.out.println();
		
		System.out.print("Nota 2: ");
		double nota2 = scan.nextDouble();
		System.out.println();
		
		System.out.print("Nota 3: ");
		double nota3 = scan.nextDouble();
		System.out.println();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("La nota media es: " + media);
		
		if(media < 5) {
			System.out.println("Insuficiente.");
		} else {
			
			if(media >= 5 & media < 6) {
				System.out.println("Suficiente.");
			} else {
				
				if(media >= 6 & media < 7) {
					System.out.println("Bien.");
				} else {
					
					if(media >= 7 & media <= 9) {
						System.out.println("Notable.");
					} else {
						
						if(media >= 9) {
							System.out.println("Sobresaliente.");
						}
					}
				}
			}
		}
		
		scan.close();
	}

}
