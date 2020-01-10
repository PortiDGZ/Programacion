package ejerciciosFunciones;

public class Ejercicio7 {

	public static void main(String[] args) {
		int n1 = (int) (Math.random() * 6 + 1);
		System.out.println(n1);
		int n2 = (int) (Math.random() * 6 + 1);
		System.out.println(n2);
		System.out.println();
		
		while(n1 != n2) {
			n1 = (int) (Math.random() * 6 + 1);
			System.out.println(n1);
			n2 = (int) (Math.random() * 6 + 1);
			System.out.println(n2);
			System.out.println();
		}
	}
}
