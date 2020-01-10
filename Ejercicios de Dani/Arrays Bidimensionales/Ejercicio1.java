package arraysBidimensionales;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[][] tabla = new int[3][6];
		
		rellenar(tabla);
		
		print(tabla);
	}

	public static void rellenar(int[][] tabla) {
		tabla[0][0] = 0;
		tabla[0][1] = 30;
		tabla[0][2] = 2;
		tabla[0][5] = 0;
		tabla[1][0] = 75;
		tabla[1][4] = 0;
		tabla[2][2] = -2;
		tabla[2][3] = 9;
		tabla[2][5] = 11;
	}
	
	public static void printFila(int[] tabla) {
		for(int i = 0; i <= tabla.length - 1; i++) {
			System.out.print(tabla[i]);
			if(i != tabla.length - 1) {
				System.out.print(", ");
			}
		}
	}
	
	public static void print(int[][] tabla) {
		System.out.print("{");
		
		for(int i = 0; i <= tabla.length - 1; i++) {
			printFila(tabla[i]);
			if(i != tabla.length - 1) {
				System.out.println(", ");
			}
		}
		
		System.out.println("}");
	}
	
}
