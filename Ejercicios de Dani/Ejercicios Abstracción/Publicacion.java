package EjerciciosAbstraccion;

public abstract class Publicacion {
	
	// Atributos
	private int codigo;
	private int año;
	private String titulo = "";
	
	// Constructor
	public Publicacion(int codigo, int año, String titulo) {
		super();
		this.codigo = codigo;
		this.año = año;
		this.titulo = titulo;
	}
	
	// Getters
	public int getCodigo() {
		return codigo;
	}

	public int getAño() {
		return año;
	}

	// ToString
	@Override
	public String toString() {
		return "codigo = " + codigo + ", año = " + año + ", titulo = " + titulo + ", ";
	}

}
