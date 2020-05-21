package ejerciciosHerencia;

public class Sello extends Coleccionable {
	
	// Atributo
	private String pais = "";

	// Constructores
	public Sello(int cantidad, String descripcion, String pais) {
		super(cantidad, descripcion);
		this.pais = pais;
	}

	// ToString
	@Override
	public String toString() {
		return "Sello [pais=" + pais + ", cantidad=" + cantidad + ", descripcion=" + descripcion + "]";
	}

}
