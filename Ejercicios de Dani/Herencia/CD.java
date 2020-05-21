package ejerciciosHerencia;

public class CD {
	
	// Atributos
	protected String nombre = "";
	protected double precio;
	
	// Constructores
	public CD(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	// Devuelve true si el parámetro coincide con el atributo nombre
	public boolean comparar(String nombre) {
		return nombre.equals(this.nombre);
	}

}
