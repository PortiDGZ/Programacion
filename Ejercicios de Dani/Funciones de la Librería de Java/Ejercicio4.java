package ejerciciosFunciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = (int) (Math.random() * 101);
		int oportunidades = 4;
		
		System.out.println("Estoy pensando en un número. ¡Intente adivinarlo!");
		
		do {
			int entrada = scan.nextInt();
			if(n == entrada) {
				oportunidades = -1;
			} else {
				if(n > entrada) {
					System.out.println("Estoy pensando en un número mayor.");
				} else {
					System.out.println("Estoy pensando en un número menor.");
				}
				System.out.println("Oportunidades restantes: " + oportunidades);
			}
			oportunidades--;
		} while(oportunidades > -1);
		
		if(oportunidades == -2) {
			System.out.println("¡Has acertado!");
		}
		
		scan.close();
	}
}
