package ejerciciosHerencia;

public class Moneda extends Coleccionable {
	
	// Atributos
	private double valor;
	private String metal = "";
	
	// Constructores
	public Moneda(int cantidad, String descripcion, double valor, String metal) {
		super(cantidad, descripcion);
		this.valor = valor;
		this.metal = metal;
	}

	// ToString
	@Override
	public String toString() {
		return "Moneda [valor=" + valor + ", metal=" + metal + ", cantidad=" + cantidad + ", descripcion=" + descripcion
				+ "]";
	}

}
