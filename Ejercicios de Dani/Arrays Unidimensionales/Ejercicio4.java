package arraysUnidimensionales;

public class Ejercicio4 {

	public static void main(String[] args) {
		int[] numero = new int[20];
		
		rellenarRandom(numero);
		
		int[] cuadrado = cuadrado(numero);
		
		int[] cubo = cubo(numero);
		
		mostrar3(numero, cuadrado, cubo);
	}

	public static void mostrar3(int[] numero, int[] cuadrado, int[] cubo) {
		for(int i = 0; i <= numero.length - 1; i++) {
			System.out.printf("%-10d %-10d %d \n", numero[i], cuadrado[i], cubo[i]);
		}
	}

	public static int[] cuadrado(int[] numero) {
		int[] cuadrado = new int[numero.length];
		
		for(int i = 0; i <= numero.length - 1; i++) {
			cuadrado[i] = (int) Math.pow(numero[i], 2);
		}
		
		return cuadrado;
	}
	
	public static int[] cubo(int[] numero) {
		int[] cubo = new int[numero.length];
		
		for(int i = 0; i <= numero.length - 1; i++) {
			cubo[i] = (int) Math.pow(numero[i], 3);
		}
		
		return cubo;
	}

	public static void rellenarRandom(int[] tabla) {
		for(int i = 0; i <= tabla.length - 1; i++) {
			tabla[i] = (int) (Math.random() * 101);
		}
	}

}
