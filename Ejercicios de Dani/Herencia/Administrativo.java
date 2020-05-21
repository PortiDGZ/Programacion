package ejerciciosHerencia;

import java.util.*;

public class Administrativo extends Empleado {
	
	// Atributos
	private String funcion = "";
	private Date fechaContrato;
	
	// Constructores
	public Administrativo(String dNI, String nombre, String direccion, String telefono, String funcion,
			Date fechaContrato) {
		super(dNI, nombre, direccion, telefono);
		this.funcion = funcion;
		this.fechaContrato = fechaContrato;
	}
	
	// Getters  y setters
	public String getFuncion() {
		return funcion;
	}
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	public Date getFechaContrato() {
		return fechaContrato;
	}
	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}
	
	// ToString
	@Override
	public String toString() {
		return "Administrativo [funcion=" + funcion + ", fechaContrato=" + fechaContrato + ", getDNI()=" + getDNI()
				+ ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion() + ", getTelefono()="
				+ getTelefono() + "]";
	}
	
	

}
