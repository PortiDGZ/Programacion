package ejerciciosAmpliación;

public class Ejercicio12_b {

	public static void main(String[] args) {
		int pares = 0;
		int impares = 0;
		int i = 25;
		
		while(i <= 50) {
			if(i % 2 == 0) {
				pares += i;
			} else {
				impares += i;
			}
			i++;
		}
		
		System.out.println("Suma de los pares: " + pares);
		System.out.println("Suma de los impares: " + impares);
	}
}
