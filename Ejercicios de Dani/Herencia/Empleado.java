package ejerciciosHerencia;

public class Empleado {
	
	// Atributos
	private String DNI = "";
	private String nombre = "";
	private String direccion = "";
	private String telefono = "";
	
	// Constructores
	public Empleado(String dNI, String nombre, String direccion, String telefono) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	// Getters y setters
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	// ToString
	@Override
	public String toString() {
		return "Empleado [DNI=" + DNI + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}

}
