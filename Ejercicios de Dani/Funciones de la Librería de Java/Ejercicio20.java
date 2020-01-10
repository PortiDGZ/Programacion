package ejerciciosFunciones;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String mano = null;
		
		do {
			System.out.print("Turno del jugador (introduzca piedra, papel o tijeras): ");
			mano = scan.next().toLowerCase();
			if(!(mano.equals("tijeras") | mano.equals("papel") | mano.equals("piedra"))) {
				System.out.println();
				System.out.println("Por favor, introduzca una opción correcta.");
				System.out.println();
			}
		} while(!(mano.equals("tijeras") | mano.equals("papel") | mano.equals("piedra")));
		
		int rand = (int) (Math.random() * 3);
		
		String ordenador = null;
		
		switch(rand) {
		case 0:
			ordenador = "tijeras";
			break;
		case 1:
			ordenador = "papel";
			break;
		case 2:
			ordenador = "piedra";
			break;
		}
		
		System.out.println("Turno del ordenador: " + ordenador);
		
		System.out.println();
		
		if(ordenador.equals(mano)) {
			System.out.println("Empate.");
		} else {
			if(ordenador.equals("tijeras") & mano.equals("piedra")) {
				System.out.println("Gana el jugador.");
			} else {
				if(ordenador.equals("tijeras") & mano.equals("papel")) {
					System.out.println("Gana el ordenador.");
				} else {
					if(ordenador.equals("papel") & mano.equals("piedra")) {
						System.out.println("Gana el ordenador.");
					} else {
						if(ordenador.equals("papel") & mano.equals("tijeras")) {
							System.out.println("Gana el jugador.");
						} else {
							if(ordenador.equals("piedra") & mano.equals("tijeras")) {
								System.out.println("Gana el ordenador.");
							} else {
								System.out.println("Gana el jugador.");
							}
						}
					}
				}				
			}
		}
		
		scan.close();
	}
}
