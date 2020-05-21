package ejerciciosTema9;

public class Contador {

	// Atributos
	private int valor;

	// Constructores
	public Contador() { // Constructor no-arg
	}

	public Contador(int valor) {
		this.valor = valor;
	}

	// Constructor copia
	public Contador(Contador original) {
		valor = original.valor;
	}

	// Getters
	public int getValor() {
		return valor;
	}

	// Setters
	public void setValor(int valor) {
		this.valor = valor;
	}

	// Incrementar: aumenta 1
	public void incrementar() {
		valor++;
	}

	// Decrementar: disminuye 1
	public void decrementar() {
		valor--;
	}

}
