package ficherosYManejoDeExcepciones;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Jugador implements Comparable {

	// Atributos
	private String nombre = "";
	private int dorsal;
	private LocalDate nacimiento;

	// Constructor
	public Jugador() {
		System.out.print("Nombre: ");
		nombre = Ejercicio12.scan.nextLine();
		System.out.println();

		boolean bucle = true;

		do {
			try {
				System.out.print("Dorsal: ");
				dorsal = Ejercicio12.scan.nextInt();
				bucle = false;
			} catch (Exception e) {
				System.out.println();
				System.out.println("No se ha introducido un número.");
			}
			Ejercicio12.scan.nextLine();
			System.out.println();
		} while (bucle);
		
		bucle = true;
		
		do {
			try {
				System.out.print("Fecha de nacimiento: ");
				setNacimiento(Ejercicio12.scan.nextLine());
				bucle = false;
			} catch (Exception e) {
				System.out.println();
				System.out.println("La fecha no es válida.");
			}
			System.out.println();
		} while (bucle);
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public void setNacimiento(String nacimiento) throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.nacimiento = LocalDate.parse(nacimiento, formatter);
	}

	// CompareTo
	@Override
	public int compareTo(Object j) {
		return dorsal - ((Jugador) j).dorsal;
	}
	
	// ToString
	public String toString() {
		return nombre + "\nDorsal: " + dorsal + "\nFecha de nacimiento: " + nacimiento;
	}
}
