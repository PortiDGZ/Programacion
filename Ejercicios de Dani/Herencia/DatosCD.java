package ejerciciosHerencia;

public class DatosCD extends CD {
	
	// Atributos
	private double tama�o;

	// Constructores
	public DatosCD(String nombre, double precio, double tama�o) {
		super(nombre, precio);
		this.tama�o = tama�o;
	}

	// ToString
	@Override
	public String toString() {
		return "DatosCD [tama�o=" + tama�o + "Gb, nombre=" + nombre + ", precio=" + precio + "]";
	}

}
