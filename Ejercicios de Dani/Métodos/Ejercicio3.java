package Ejercicios_Métodos;

public class Ejercicio3 {

	public static void main(String[] args) {
		for(int i = 2; i <= 99999; i++) {
			if(Ejercicio1.esCapicua(i)) {
				System.out.println(i);
			}
		}
	}
}
