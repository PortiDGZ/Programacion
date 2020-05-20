package EjerciciosAbstraccion;

public class Revista extends Publicacion {

	// Atributos
	private int numero;

	// Constructor
	public Revista(int codigo, int año, String titulo, int numero) {
		super(codigo, año, titulo);
		this.numero = numero;
	}

	// ToString
	@Override
	public String toString() {
		return "Revista " + super.toString() + "numero = " + numero;
	}

}
