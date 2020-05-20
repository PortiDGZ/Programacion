package EjerciciosAbstraccion;

public class Libro extends Publicacion implements Prestable {

	// Atributos
	private boolean prestado;

	// Constructor
	public Libro(int codigo, int a�o, String titulo) {
		super(codigo, a�o, titulo);
	}

	// ToString
	@Override
	public String toString() {
		return "Libro " + super.toString() + "prestado = " + prestado;
	}

	// M�todos de Prestable
	@Override
	public void prestar() {
		prestado = true;
	}

	@Override
	public void devolver() {
		prestado = false;
	}

	@Override
	public boolean prestado() {
		return prestado;
	}

}
