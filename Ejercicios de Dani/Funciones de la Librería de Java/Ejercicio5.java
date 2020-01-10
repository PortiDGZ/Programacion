package ejerciciosFunciones;

public class Ejercicio5 {

	public static void main(String[] args) {
		int contador = 1;
		int n = (int) (Math.random() * 101);
		System.out.println(n);
		
		while(n != 24) {
			n = (int) (Math.random() * 101);
			System.out.println(n);
			contador++;
		}
		
		System.out.println("Se han imprimido " + contador + " números.");
	}
}
