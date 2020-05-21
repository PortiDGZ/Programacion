package ejerciciosHerencia;

public class SoftwareCD extends CD {
	
	// Atributos
	private String programa = "";

	
	// Constructores
	public SoftwareCD(String nombre, double precio, String programa) {
		super(nombre, precio);
		this.programa = programa;
	}

	// ToString
	@Override
	public String toString() {
		return "SoftwareCD [programa=" + programa + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
