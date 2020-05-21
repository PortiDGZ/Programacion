package ejerciciosHerencia;

public class Billete extends Coleccionable {
	
	// Atributos
	private double valor;

	// Constructores
	public Billete(int cantidad, String descripcion, double valor) {
		super(cantidad, descripcion);
		this.valor = valor;
	}

	// ToString
	@Override
	public String toString() {
		return "Moneda [valor=" + valor + ", cantidad=" + cantidad + ", descripcion=" + descripcion + "]";
	}

}
