package ejerciciosHerencia;

public class AudioCD extends CD {
	
	// Atributos
	protected String autor = "";

	// Constructores
	public AudioCD(String nombre, double precio, String autor) {
		super(nombre, precio);
		this.autor = autor;
	}

	// ToString
	@Override
	public String toString() {
		return "AudioCD [autor=" + autor + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
