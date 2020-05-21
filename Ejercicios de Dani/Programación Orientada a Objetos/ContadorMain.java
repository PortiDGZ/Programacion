package ejerciciosTema9;

public class ContadorMain {

	public static void main(String[] args) {
		// Contador a 0
		Contador c0 = new Contador();

		// Mostrar que está a 0
		System.out.println("c0 está en " + c0.getValor());

		// Contador a 55
		Contador c55 = new Contador(55);

		// Mostrar que está a 55
		System.out.println("c55 está en " + c55.getValor());
		
		// Aumentar
		c55.incrementar();
		
		// Mostrar que está a 56
		System.out.println("c55 está en " + c55.getValor());
		
		// Copia de c55
		Contador c55_copia = new Contador(c55);
		
		// Mostrar que la copia está igual
		System.out.println("c55_copia está en " + c55_copia.getValor());
	}

}
