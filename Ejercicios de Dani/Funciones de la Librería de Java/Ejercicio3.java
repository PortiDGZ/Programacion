package ejerciciosFunciones;

public class Ejercicio3 {

	public static void main(String[] args) {
		double media = 0;
		int minimo = 200;
		int maximo = 0;
		
		for(int i = 1; i <= 50; i++) {
			int n = (int) (Math.random() * 100 + 100);
			System.out.print(n + " ");
			media += n;
			minimo = Math.min(minimo, n);
			maximo = Math.max(maximo, n);
		}
		
		media /= 50;
		
		System.out.println();
		System.out.println("Mínimo: " + minimo);
		System.out.println("Máximo: " + maximo);
		System.out.printf("Media: %.2f \n", media);
	}
}
