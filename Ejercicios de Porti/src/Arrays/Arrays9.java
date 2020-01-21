package Arrays;

public class Arrays9 {

	public static void main(String[] args) {
		int[] matriz = new int[10];
		
		Arrays5.rellenarPorTeclado(matriz);
		
		System.out.println();
		
		printIndices(matriz);
		
		Ejercicio1.print(matriz);
		
		segregarPrimosCompuestos(matriz);
		
		System.out.println();
		
		printIndices(matriz);
		
		Arrays1.print(matriz);
	}

	private static void printIndices(int[] tabla) {
		System.out.print('{');
		for(int i = 0; i <= tabla.length - 1; i++) {
			System.out.print(i);
			if(i != tabla.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println('}');
	}
	
	public static void segregarPrimosCompuestos(int[] tabla) {
		int[] original = new int[tabla.length];
		
		System.arraycopy(tabla, 0, original, 0, tabla.length);
				
		int contador = 0;
		
		for (int i = 0; i <= tabla.length - 1; i++) {
			if (primo(original[i])) {
				tabla[contador] = original[i];
				contador++;
			}
		}
		
		for (int i = 0; i <= tabla.length - 1; i++) {
			if (!primo(original[i])) {
				tabla[contador] = original[i];
				contador++;
			}
		}
	}

	public static boolean primo(int N) {
		for (int i = 2; i <= N/2; i++) {
			if (N % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
