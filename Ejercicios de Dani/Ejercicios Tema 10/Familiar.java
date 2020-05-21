package Ejercicios;

import java.time.*;
import java.time.format.*;

public class Familiar {
	
	// Atributos
	private String apellidos;
	private String nombre;
	private char sexo;
	private LocalDate nacimiento;
	private double peso;
	private double altura;
	
	// Constructores
	public Familiar(String apellidos, String nombre, char sexo, String nacimiento, double peso,
			double altura) {
		super();
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.sexo = sexo;
		setNacimiento(nacimiento);
		this.peso = peso;
		this.altura = altura;
	}
	
	// Setters
	private void setNacimiento(String nacimiento) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			this.nacimiento = LocalDate.parse(nacimiento, formatter);
		} catch (Exception e) {
			System.out.println("La fecha no es válida.");
		}
	}
	
	// ToString
	@Override
	public String toString() {
		return "Familiar [apellidos=" + apellidos + ", nombre=" + nombre + ", sexo=" + sexo + ", nacimiento="
				+ nacimiento + ", peso=" + peso + ", altura=" + altura + "]";
	}

}
