package EjerciciosAbstraccion;

public class Videojuego implements Entregable {

	// Atributos
	private String titulo;
	private int horas = 10;
	private boolean entregado;
	private String genero;
	private String compañia;

	// Constructor
	public Videojuego() {
		super();
	}

	public Videojuego(String titulo, int horas) {
		super();
		this.titulo = titulo;
		this.horas = horas;
	}

	public Videojuego(String titulo, int horas, String genero, String compañia) {
		super();
		this.titulo = titulo;
		this.horas = horas;
		this.genero = genero;
		this.compañia = compañia;
	}

	// Getters
	public String getTitulo() {
		return titulo;
	}

	public int getHoras() {
		return horas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCompañia() {
		return compañia;
	}

	// Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	// ToString
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas=" + horas + ", entregado=" + entregado + ", genero=" + genero
				+ ", compañia=" + compañia + "]";
	}

	// Métodos de Entregable
	@Override
	public void entregar() {
		entregado = true;
	}

	@Override
	public void devolver() {
		entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return entregado;
	}

	@Override
	public int compareTo(Object a) {
		return horas - ((Videojuego) a).horas;
	}

}
