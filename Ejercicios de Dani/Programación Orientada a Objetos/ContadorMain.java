package ejerciciosTema9;

public class ContadorMain {

	public static void main(String[] args) {
		// Contador a 0
		Contador c0 = new Contador();

		// Mostrar que est� a 0
		System.out.println("c0 est� en " + c0.getValor());

		// Contador a 55
		Contador c55 = new Contador(55);

		// Mostrar que est� a 55
		System.out.println("c55 est� en " + c55.getValor());
		
		// Aumentar
		c55.incrementar();
		
		// Mostrar que est� a 56
		System.out.println("c55 est� en " + c55.getValor());
		
		// Copia de c55
		Contador c55_copia = new Contador(c55);
		
		// Mostrar que la copia est� igual
		System.out.println("c55_copia est� en " + c55_copia.getValor());
	}

}
