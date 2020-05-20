package EjerciciosAbstraccion;

public class Videojuego implements Entregable {

	// Atributos
	private String titulo;
	private int horas = 10;
	private boolean entregado;
	private String genero;
	private String compa�ia;

	// Constructor
	public Videojuego() {
		super();
	}

	public Videojuego(String titulo, int horas) {
		super();
		this.titulo = titulo;
		this.horas = horas;
	}

	public Videojuego(String titulo, int horas, String genero, String compa�ia) {
		super();
		this.titulo = titulo;
		this.horas = horas;
		this.genero = genero;
		this.compa�ia = compa�ia;
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

	public String getCompa�ia() {
		return compa�ia;
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

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	// ToString
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas=" + horas + ", entregado=" + entregado + ", genero=" + genero
				+ ", compa�ia=" + compa�ia + "]";
	}

	// M�todos de Entregable
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
