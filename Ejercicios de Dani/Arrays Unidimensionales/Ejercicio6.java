package arraysUnidimensionales;

public class Ejercicio6 {

	public static void main(String[] args) {
		int[] tabla = new int[15];
		
		Ejercicio5.rellenarPorTeclado(tabla);
		
		System.out.println();
		
		rotar(tabla);
		
		Ejercicio1.print(tabla);
	}

	public static void rotar(int[] tabla) {
		for(int i = 1; i <= tabla.length - 1; i++) {
			int aux = tabla[0];
			tabla[0] = tabla[i];
			tabla[i] = aux;
		}
	}

}
