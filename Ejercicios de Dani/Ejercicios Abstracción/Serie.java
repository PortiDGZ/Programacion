package EjerciciosAbstraccion;

public class Serie implements Entregable {
	
	// Atributos
	private String titulo;
	private int temporadas = 3;
	private boolean entregado;
	private String genero;
	private String creador;
	
	// Constructores
	public Serie() {
		super();
	}
	
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, int temporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
	}

	// Getters
	public String getTitulo() {
		return titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	// Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	// ToString
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
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
		return temporadas - ((Serie )a).temporadas;
	}

}
