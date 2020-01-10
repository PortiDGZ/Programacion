package arraysBidimensionales;

public class Ejercicio6 {

	public static void main(String[] args) {
		int[][] tabla = new int[12][12];

		rellenar(tabla);

		print(tabla);
		
		rotar(tabla);

		print(tabla);
	}
	
	public static void printFila(int[] tabla) {
		for(int i = 0; i <= tabla.length - 1; i++) {
			System.out.printf("%-4d", tabla[i]);
		}
		System.out.println();
	}

	public static void print(int[][] tabla) {
		for(int i = 0; i <= tabla.length - 1; i++) {
			printFila(tabla[i]);
		}
		System.out.println();
	}

	public static void rellenar(int[][] tabla) {
		for (int i = 0; i <= tabla.length - 1; i++) {
			for (int j = 0; j <= tabla[i].length - 1; j++) {
				tabla[i][j] = (int) (Math.random() * 101);
			}
		}
		
	}

	public static void rotar(int[][] tabla) {
		int[][] original = new int[tabla.length][tabla.length];
		int l = tabla.length;
		
		for (int i = 0; i <= l - 1; i++) {
			System.arraycopy(tabla[i], 0, original[i], 0, tabla[i].length);
		}
		
		for (int i = 0; i <= l - 1; i++) {
			for (int j = 0; j <= l - 1; j++) {
				tabla[j][l - i - 1] = original[i][j];
			}
		}
	}

}
