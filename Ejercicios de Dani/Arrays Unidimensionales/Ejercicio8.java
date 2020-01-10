package arraysUnidimensionales;

public class Ejercicio8 {

	public static void main(String[] args) {
		int[] tabla = new int[20];
		
		Ejercicio4.rellenarRandom(tabla);
		
		segregarParesImpares(tabla);
		
		Ejercicio1.print(tabla);
	}

	public static void segregarParesImpares(int[] tabla) {
		int[] original = new int[tabla.length];
		
		System.arraycopy(tabla, 0, original, 0, tabla.length);
				
		int pares = 0, impares = tabla.length - 1;
		
		for (int i = 0; i <= tabla.length - 1; i++) {
			if (original[i] % 2 == 0) {
				tabla[pares] = original[i];
				pares++;
			} else {
				tabla[impares] = original[i];
				impares--;
			}
		}
	}
}
