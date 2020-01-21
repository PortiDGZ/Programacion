package Arrays;

public class ArrayBi5 {

	public static void main(String[] args) {
		int[][] tabla = new int[6][10];

		rellenar(tabla);

		ArrayBi1.print(tabla);
		System.out.println();

		System.out.println("Posici�n del m�nimo: " + posMin(tabla));
		System.out.println();

		System.out.println("Posici�n del m�ximo: " + posMax(tabla));
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
				int n = (int) (Math.random() * 1001);
				
				while (enTabla(n, tabla)) {
					n = (int) (Math.random() * 1001);
				}
				
				tabla[i][j] = n;
			}
		}
	}

	public static boolean enTabla(int n, int[][] tabla) {
		for (int i = 0; i <= tabla.length - 1; i++) {
			for (int j = 0; j <= tabla[i].length - 1; j++) {
				if (tabla[i][j] == n) {
					return true;
				}
			}
		}
		
		return false;
	}

}

