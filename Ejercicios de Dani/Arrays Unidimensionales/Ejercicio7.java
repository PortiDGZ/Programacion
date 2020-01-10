package arraysUnidimensionales;

public class Ejercicio7 {

	public static void main(String[] args) {
		int[] tabla = new int[8];
		
		Ejercicio4.rellenarRandom(tabla);
		
		mostrarParesImpares(tabla);
	}

	public static void mostrarParesImpares(int[] tabla) {
		for(int i = 0; i <= tabla.length - 1; i++) {
			System.out.println(tabla[i] + " " + parOImpar(tabla[i]));
		}
	}

	public static String parOImpar(int i) {
		if(i % 2 == 0) {
			return "par";
		}
		
		return "impar";
	}

}
