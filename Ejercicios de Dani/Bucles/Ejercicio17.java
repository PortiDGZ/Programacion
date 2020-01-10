package ejercicios4;

public class Ejercicio17 {

	public static void main(String[] args) {
		boolean primo;
		
		for(int n = 2; n <= 100; n++) {
			primo = true;
			for(int i = n / 2; i > 1; i--) {
				if(n % i == 0) {
					primo = false;
					i = -1;
				}
			}
			if(primo) {
				System.out.print(n + " ");
			}
		}
	}
}
