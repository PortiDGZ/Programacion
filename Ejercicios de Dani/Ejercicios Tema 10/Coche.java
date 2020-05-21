package Ejercicios;

import java.util.Arrays;

public class Coche {
	
	// Atributos
	private String marca = "";
	private String modelo = "";
	private String matricula = "";
	private String[] ocupantes = new String[1];
	
	// Constructores
	public Coche(String marca, String modelo, String matricula, String[] ocupantes) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.ocupantes = ocupantes;
	}
	
	private Coche(Coche copia) {
		marca = copia.marca;
		modelo = copia.modelo;
		matricula = copia.matricula;
		ocupantes = copia.ocupantes;
	}
	
	// Getters
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public String[] getOcupantes() {
		return ocupantes;
	}

	// Setters
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setOcupantes(String[] ocupantes) {
		this.ocupantes = ocupantes;
	}
	
	// Clone
	public Coche clone() {
		return new Coche(this);
	}

	// ToString
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", ocupantes="
				+ Arrays.toString(ocupantes) + "]";
	}

}
