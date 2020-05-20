package EjerciciosAbstraccion;

public class Revista extends Publicacion {

	// Atributos
	private int numero;

	// Constructor
	public Revista(int codigo, int a�o, String titulo, int numero) {
		super(codigo, a�o, titulo);
		this.numero = numero;
	}

	// ToString
	@Override
	public String toString() {
		return "Revista " + super.toString() + "numero = " + numero;
	}

}
