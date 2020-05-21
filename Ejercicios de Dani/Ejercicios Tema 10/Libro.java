package Ejercicios;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Libro {
	
	// Atributos
	private String titulo = "";
	private String autor = "";
	private String editorial = "";
	private LocalDate fechaCompra = LocalDate.now();
	private double precio;
	
	// Constructores
	public Libro(String titulo, String autor, String editorial, String fechaCompra, double precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		setFechaCompra(fechaCompra);
		this.precio = precio;
	}
	
	// Getters
	public double getPrecio() {
		return precio;
	}
	
	// Setters
	private void setFechaCompra(String fecha) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			fechaCompra = LocalDate.parse(fecha, formatter);
		} catch (Exception e) {
			System.out.println("La fecha no es válida.");
		}
	}
	
	// ToString
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", fechaCompra="
				+ fechaCompra + ", precio=" + precio + "]";
	}
	
	// Menor a 0 si esta fecha es anterior, 0 si es igual, mayor si es posterior
	public int comparaFecha(Libro comparado) {
		return fechaCompra.compareTo(comparado.fechaCompra);
	}

}
