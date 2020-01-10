package ejerciciosAmpliación;

public class Ejercicio12 {

	public static void main(String[] args) {
		int pares = 0;
		int impares = 0;
		
		for(int i = 25; i <= 50; i++) {
			if(i % 2 == 0) {
				pares += i;
			} else {
				impares += i;
			}
		}
		
		System.out.println("Suma de los pares: " + pares);
		System.out.println("Suma de los impares: " + impares);
	}
}
