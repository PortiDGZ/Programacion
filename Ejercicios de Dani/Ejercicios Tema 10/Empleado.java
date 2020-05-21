package Ejercicios;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class Empleado {

	// Atributos
	private String nombre = "";
	private String apellidos = "";
	private int telefono;
	private String domicilio = "";
	private LocalDate nacimiento = LocalDate.now();
	private LocalDate alta = LocalDate.now();
	
	private double[] horariosEntrada;
	private double[] horariosSalida;

	// Constructores
	public Empleado(String nombre, String apellidos, int telefono, String domicilio, String nacimiento, String alta) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.domicilio = domicilio;
		setNacimiento(nacimiento);
		setAlta(alta);
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

	private void setAlta(String alta) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			this.alta = LocalDate.parse(alta, formatter);
		} catch (Exception e) {
			System.out.println("La fecha no es válida.");
		}
	}

	public void setHoras(int dias, Scanner scan) {
		horariosEntrada = new double[dias];
		horariosSalida = new double[dias];
		for (int i = 0; i <= dias - 1; i++) {
			System.out.println("Día " + (i + 1) + ":");
			System.out.print("Hora de entrada: ");
			horariosEntrada[i] = scan.nextDouble();
			System.out.print("Hora de salida: ");
			horariosSalida[i] = scan.nextDouble();
			System.out.println();
		}
		
	}
	
	//  Horas trabajadas
	private double totalHoras() {
		double total = 0;
		
		for (int i = 0; i <= horariosEntrada.length - 1; i++) {
			total += horariosEntrada[i] - horariosSalida[i];
		}
		
		return total;
	}
	
	// Devuelve el empleado que más horas ha trabajado
	public static Empleado mayor(Empleado e1, Empleado e2) {
		if(e1.totalHoras() < e2.totalHoras()) {
			return e2;
		}
		
		return e1;
	}
	
	// Devuelve el empleado que menos horas ha trabajado
	public static Empleado menor(Empleado e1, Empleado e2) {
		if(e1.totalHoras() > e2.totalHoras()) {
			return e2;
		}
		
		return e1;
	}
	
	// Media diaria de horas trabajadas
	public double mediaHoras() {
		return totalHoras() / horariosEntrada.length;
	}

}
