package arraysUnidimensionales;

public class Ejercicio2 {

	public static void main(String[] args) {
		char[] simbolo = new char[10];
		
		rellenar(simbolo);
		
		print(simbolo);
	}

	public static void rellenar(char[] simbolo) {
		simbolo[0] = 'a';
		simbolo[1] = 'x';
		simbolo[4] = '@';
		simbolo[6] = ' ';
		simbolo[7] = '+';
		simbolo[8] = 'Q';
	}
	
	public static void print(char[] tabla) {
		System.out.print('{');
		for(int i = 0; i <= tabla.length - 1; i++) {
			System.out.print(tabla[i]);
			if(i != tabla.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println('}');
	}

}
