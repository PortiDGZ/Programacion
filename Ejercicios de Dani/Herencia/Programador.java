package ejerciciosHerencia;

import java.util.*;

public class Programador extends Empleado {
	
	// Atributos
	private String nivel = "";
	private String[] lenguajes;
	
	// Constructores
	public Programador(String dNI, String nombre, String direccion, String telefono, String nivel, String[] lenguajes) {
		super(dNI, nombre, direccion, telefono);
		this.nivel = nivel;
		this.lenguajes = lenguajes;
	}
	
	// Getters y setters
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String[] getLenguajes() {
		return lenguajes;
	}
	public void setLenguajes(String[] lenguajes) {
		this.lenguajes = lenguajes;
	}
	
	// ToString
	@Override
	public String toString() {
		return "Programador [nivel=" + nivel + ", lenguajes=" + Arrays.toString(lenguajes) + ", getDNI()=" + getDNI()
				+ ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion() + ", getTelefono()="
				+ getTelefono() + "]";
	}

}
