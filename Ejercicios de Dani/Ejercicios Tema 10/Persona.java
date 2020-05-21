package Ejercicios;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class Persona {

	// Atributos
	private String dni;
	private String apellidos;
	private String nombre;
	private char sexo;
	private LocalDate nacimiento;
	private double peso;
	private double altura;

	// Constructores
	public Persona() {
		dni = null;
		apellidos = "*sin especificar*";
		nombre = "*sin especificar*";
		sexo = 'V';
		nacimiento = LocalDate.now();
		peso = 50;
		altura = 170;
	}
	
	public Persona(String dni, String apellidos, String nombre, char sexo, String nacimiento, double peso,
			double altura) {
		super();
		this.dni = dni;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.sexo = sexo;
		setNacimiento(nacimiento);
		this.peso = peso;
		this.altura = altura;
	}
	
	public Persona(String apellidos, String nombre) {
		super();
		this.apellidos = apellidos;
		this.nombre = nombre;
	}
	
	public Persona(String dni, String apellidos, char sexo) {
		super();
		this.dni = dni;
		this.apellidos = apellidos;
		this.sexo = sexo;
	}

	// Getters y setters

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			this.nacimiento = LocalDate.parse(nacimiento, formatter);
		} catch (Exception e) {
			System.out.println("La fecha no es válida.");
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// ToString
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", apellidos=" + apellidos + ", nombre=" + nombre + ", sexo=" + sexo
				+ ", nacimiento=" + nacimiento + ", peso=" + peso + ", altura=" + altura + "]";
	}

	// Muestra los datos de la persona
	public void verDatosPersona() {
		System.out.println(this);
	}

	// Pide por teclado todos los atributos
	public void leerDatosPersona() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduzca los datos: ");

		System.out.print("DNI: ");
		this.dni = scan.nextLine();

		System.out.print("Apellidos: ");
		this.apellidos = scan.nextLine();

		System.out.print("Nombre: ");
		this.nombre = scan.nextLine();

		System.out.print("Sexo (V/M): ");
		this.sexo = scan.nextLine().toUpperCase().charAt(0);

		System.out.print("Fecha de nacimiento: ");
		setNacimiento(scan.nextLine());

		System.out.print("Peso: ");
		this.peso = scan.nextDouble();

		System.out.print("Altura: ");
		this.altura = scan.nextDouble();
	}

}
