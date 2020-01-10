package Ejercicios_Métodos;

public class Ejercicio2 {

	public static void main(String[] args) {
		for(int i = 2; i <= 997; i++) {
			if(Ejercicio1.esPrimo(i)) {
				System.out.println(i);
			}
		}
	}
}
