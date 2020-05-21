package ejerciciosTema9;

public class Libro {
	
	// Atributos
	private String nombre = "";
	private String autor = "";
	private int ejemplares = 0;
	private int prestados = 0;
	
	// Constructores
	public Libro() { // Constructor no-arg
	}
	
	public Libro(String nombre, String autor, int ejemplares, int prestados) {
		this.nombre = nombre;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}
	
	// Getters
	public String getNombre() {
		return nombre;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getEjemplares() {
		return ejemplares;
	}
	
	public int getPrestados() {
		return prestados;
	}
	
	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
	// Préstamo: marca el libro como prestado
	public boolean prestamo() {
		if (prestados < ejemplares) {
			prestados++;
			return true;
		}
		return false;
	}
	
	// Devolución: marca el libro como devuelto
	public boolean devolucion() {
		if (prestados > 0) {
			prestados--;
			return true;
		}
		return false;
	}

	// Override toString
	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados="
				+ prestados + "]";
	}

}
