package ejerciciosTema9;

public class Libro2 {

	// Atributos
	
	private String titulo = "";
	private String autor = "";
	private boolean estado = true;

	// Constructores

	public Libro2(String a, String t, boolean e) {
		autor = a;
		titulo = t;
		estado = e;
	}

	// Getters y setters
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean getEstado() {
		return estado;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	// Override toString
	
	@Override
	public String toString() {
		return "Libro2 [titulo=" + titulo + ", autor=" + autor + ", estado=" + estado + "]";
	}
	
	// Override equals
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro2 other = (Libro2) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}
