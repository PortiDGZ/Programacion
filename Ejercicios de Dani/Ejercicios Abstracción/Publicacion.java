package EjerciciosAbstraccion;

public abstract class Publicacion {
	
	// Atributos
	private int codigo;
	private int a�o;
	private String titulo = "";
	
	// Constructor
	public Publicacion(int codigo, int a�o, String titulo) {
		super();
		this.codigo = codigo;
		this.a�o = a�o;
		this.titulo = titulo;
	}
	
	// Getters
	public int getCodigo() {
		return codigo;
	}

	public int getA�o() {
		return a�o;
	}

	// ToString
	@Override
	public String toString() {
		return "codigo = " + codigo + ", a�o = " + a�o + ", titulo = " + titulo + ", ";
	}

}
