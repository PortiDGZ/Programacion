package ejerciciosFunciones;

public class Ejercicio13_b {

	public static void main(String[] args) {
		int d1 = (int) (Math.random() * 5 + 1);
		int d2 = (int) (Math.random() * 5 + 1);
		int j1 = d1 + d2;
		
		int d3 = (int) (Math.random() * 5 + 1);
		int d4 = (int) (Math.random() * 5 + 1);
		int j2 = d3 + d4;
		
		System.out.println("Jugador 1: " + j1 + " (" + d1 + " + " + d2 + ")");
		System.out.println("Jugador 2: " + j2 + " (" + d3 + " + " + d4 + ")");
		System.out.println();
		
		if(j1 == j2) {
			System.out.println("Empate.");
		} else {
			System.out.print("Ganador: ");
			int ganador = Math.max(j1, j2);
			if(j1 == ganador) {
				System.out.println("Jugador 1");
			} else {
				System.out.println("Jugador 2");
			}
		}
	}
}
