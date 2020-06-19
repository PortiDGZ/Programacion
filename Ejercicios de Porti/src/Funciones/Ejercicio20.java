package ejerciciosFunciones;

public class Ejercicio19 {

	public static void main(String[] args) {
		int maximo = -101;
		int minimo = 201;
		int media = 0;
		
		for(int i = 1; i <= 50; i++) {
			int n = (int) (Math.random() * 302 - 101);
			System.out.print(n + " ");
			media += n;
			if(n % 2 == 0) {
				maximo = Math.max(maximo, n);
			} else {
				minimo = Math.min(minimo, n);
			}
		}
		
		media /= 50;
		
		System.out.println();
		System.out.println();
		System.out.println("Máximo de los pares: " + maximo);
		System.out.println("Mínimo de los impares: " + minimo);
		System.out.println("Media: " + media);
	}
}
