package Ejercicios;

public class HoraMain {

	public static void main(String[] args) {
		Hora h1 = new Hora(15, 26, 45);
		Hora h2 = new Hora(90, 56, 32);

		System.out.println(h1);
		System.out.println(h2);

		h1.incrementar(3, 500, 250);

		System.out.println();
		System.out.println(h1);

		System.out.println();
		System.out.println(h1.menorQue(h2) ? "H1 es menor que H2." : "H1 es mayor o igual que H2.");
	}

}
