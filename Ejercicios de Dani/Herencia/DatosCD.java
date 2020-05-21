package ejerciciosHerencia;

public class DatosCD extends CD {
	
	// Atributos
	private double tamaño;

	// Constructores
	public DatosCD(String nombre, double precio, double tamaño) {
		super(nombre, precio);
		this.tamaño = tamaño;
	}

	// ToString
	@Override
	public String toString() {
		return "DatosCD [tamaño=" + tamaño + "Gb, nombre=" + nombre + ", precio=" + precio + "]";
	}

}
