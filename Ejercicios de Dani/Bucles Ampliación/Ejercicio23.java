package ejerciciosAmpliación;

public class Ejercicio23 {

	public static void main(String[] args) {
		for(int i = 5; i <= 25; i++) {
			long n = 1;
			for(int j = i; j >= 2; j--) {
				n *= j;
			}
			System.out.println(n);
		}
	}
}
