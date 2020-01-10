package arraysUnidimensionales;


public class Ejercicio1 {

	public static void main(String[] args) {
		int[] num = new int[12];
		
		rellenar(num);
		
		print(num);
	}

	public static void rellenar(int[] num) {
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
	}



	public static void print(int[] tabla) {
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
