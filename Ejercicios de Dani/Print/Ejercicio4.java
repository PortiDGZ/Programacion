package ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		String P = "Programación";
		String F = "FOL";
		String E = "Entornos de Desarrollo";
		String L = "Lenguajes de Marcas";
		String S = "Sistemas Informáticos";
		String B = "Bases de Datos";
				
		System.out.printf("%-25s %-30s %-30s %-30s %-30s \n", B, S, B, S, P);
		System.out.printf("%-25s %-30s %-30s %-30s %-30s \n", B, S, B, S, L);
		System.out.printf("%-25s %-30s %-30s %-30s %-30s \n", B, S, B, S, E);
		System.out.printf("%-25s %-30s %-30s %-30s %-30s \n", F, E, L, P, E);
		System.out.printf("%-25s %-30s %-30s %-30s %-30s \n", F, P, L, P, P);
		System.out.printf("%-25s %-30s %-30s %-30s %-30s \n", F, P, L, P, P);
	}

}
