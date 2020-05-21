package ejerciciosHerencia;

public class MP3CD extends AudioCD {

	// Constructores
	public MP3CD(String nombre, double precio, String autor) {
		super(nombre, precio, autor);
	}
	
	// ToString
	@Override
	public String toString() {
		return "AudioCD [autor=" + autor + ", nombre=" + nombre + ", precio=" + precio + ", tipo MP3]";
	}

}
