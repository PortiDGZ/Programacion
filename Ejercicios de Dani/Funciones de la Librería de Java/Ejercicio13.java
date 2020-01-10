package ejerciciosFunciones;

public class Ejercicio13 {

	public static void main(String[] args) {
		int d1 = (int) (Math.random() * 5 + 1);
		int d2 = (int) (Math.random() * 5 + 1);
		
		System.out.println("Jugador 1: " + d1);
		System.out.println("Jugador 2: " + d2);
		System.out.println();
		
		if(d1 == d2) {
			System.out.println("Empate.");
		} else {
			System.out.print("Ganador: ");
			int ganador = Math.max(d1, d2);
			if(d1 == ganador) {
				System.out.println("Jugador 1");
			} else {
				System.out.println("Jugador 2");
			}
		}
	}
}
