package arraysUnidimensionales;

public class Ejercicio5 {

	public static void main(String[] args) {
		int[] tabla = new int[10];
		
		rellenarPorTeclado(tabla);
		
		System.out.println();
		
		mostrarMaximoYMinimo(tabla);
	}

	public static void mostrarMaximoYMinimo(int[] tabla) {
		int maximo = maximo(tabla);
		int minimo = minimo(tabla);
		
		for(int i = 0; i <= tabla.length - 1; i++) {
			System.out.print(tabla[i]);
			if(i == maximo) {
				System.out.print(" máximo");
			}
			if(i == minimo) {
				System.out.print(" mínimo");
			}
			System.out.println();
		}
	}

	public static int minimo(int[] tabla) {
		int min = 0;
		
		for(int i = 1; i <= tabla.length - 1; i++) {
			if(tabla[min] > tabla[i]) {
				min = i;
			}
		}
		
		return min;
	}

	public static int maximo(int[] tabla) {
		int max = 0;
		
		for(int i = 1; i <= tabla.length - 1; i++) {
			if(tabla[max] < tabla[i]) {
				max = i;
			}
		}
		
		return max;
	}
	

	
	public static void rellenarPorTeclado(int[] tabla) {
		for(int i = 0; i <= tabla.length - 1; i++) {
			tabla[i] = Ejercicio3.pedirInt();
		}
	}

}
