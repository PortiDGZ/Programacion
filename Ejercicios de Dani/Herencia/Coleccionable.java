package ejerciciosHerencia;

public class Coleccionable {
	
	// Atributos
	protected int cantidad = 1;
	protected String descripcion = "";
	
	// Constructores
	public Coleccionable(int cantidad, String descripcion) {
		super();
		this.cantidad = cantidad;
		this.descripcion = descripcion;
	}

	// ToString
	@Override
	public String toString() {
		return "Coleccionable [cantidad=" + cantidad + ", descripcion=" + descripcion + "]";
	}

}
