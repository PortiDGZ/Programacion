package arraysBidimensionales;

public class Ejercicio4 {

	public static void main(String[] args) {
		int[][] tabla = new int[6][10];

		rellenar(tabla);

		Ejercicio1.print(tabla);
		System.out.println();

		System.out.println("Posición del mínimo: " + posMin(tabla));
		System.out.println();

		System.out.println("Posición del máximo: " + posMax(tabla));
		System.out.println();
	}

	public static String posMax(int[][] tabla) {
		int maximo = tabla[0][0], x = 0, y = 0;

		for (int i = 0; i <= tabla.length - 1; i++) {
			for (int j = 0; j <= tabla[i].length - 1; j++) {
				if (tabla[i][j] > maximo) {
					maximo = tabla[i][j];
					x = i;
					y = j;
				}
			}
		}

		return "(" + x + ", " + y + ")";
	}

	private static String posMin(int[][] tabla) {
		int minimo = tabla[0][0], x = 0, y = 0;

		for (int i = 0; i <= tabla.length - 1; i++) {
			for (int j = 0; j <= tabla[i].length - 1; j++) {
				if (tabla[i][j] < minimo) {
					minimo = tabla[i][j];
					x = i;
					y = j;
				}
			}
		}

		return "(" + x + ", " + y + ")";
	}

	public static void rellenar(int[][] tabla) {
		for (int i = 0; i <= tabla.length - 1; i++) {
			for (int j = 0; j <= tabla[i].length - 1; j++) {
				tabla[i][j] = (int) (Math.random() * 1001);
			}
		}
	}

}
