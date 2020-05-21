package ejerciciosHerencia;

import java.util.Arrays;

public class Profesor extends Empleado {
	
	// Atributos
	private int experiencia;
	private String[] cursos;
	
	// Constructores
	public Profesor(String dNI, String nombre, String direccion, String telefono, int experiencia, String[] cursos) {
		super(dNI, nombre, direccion, telefono);
		this.experiencia = experiencia;
		this.cursos = cursos;
	}
	
	// Getters y setters
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	
	// ToString
	@Override
	public String toString() {
		return "Profesor [experiencia=" + experiencia + ", cursos=" + Arrays.toString(cursos) + ", getDNI()=" + getDNI()
				+ ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion() + ", getTelefono()="
				+ getTelefono() + "]";
	}
	
	

}
