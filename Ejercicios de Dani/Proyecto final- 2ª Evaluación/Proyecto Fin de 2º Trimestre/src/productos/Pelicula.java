package productos;

import java.util.Scanner;

import core.Dinero;
import core.Main;

public class Pelicula extends Producto implements Digital, Fisico {

	// Atributos
	private int año;
	private int duracion; // Minutos
	private boolean encargado;
	private boolean claveGenerada;
	private int clave = Math.abs(codigos.nextInt());

	// Constructores
	public Pelicula(String nombre, int precio, int año, int duracion) {
		super(nombre, precio);
		this.año = año;
		this.duracion = duracion;
	}

	public Pelicula() {
		pedirProducto();
	}

	// Encarga el producto
	@Override
	public void encargar() {
		if (claveGenerada) {
			System.out.println("El producto ya ha sido adquirido en digital.");
		} else {
			System.out.println("El pedido llegará en aproximadamente una semana.");
		}
		
		encargado = true;
	}

	// Muestra la clave
	@Override
	public void muestraClave() {
		if (encargado) {
			System.out.println("El producto ya ha sido adquirido en físico.");
		} else {
			System.out.println("La clave de " + nombre + " es " + clave + ".");
		}
		
		claveGenerada = true;
	}

	// ToString
	public String toString() {
		return super.toString() + "\nAño: " + año + "\nDuración: " + duracion + " minutos";
	}

	// Pide los datos del producto por teclado
	@Override
	protected void pedirProducto() {
		super.pedirProducto();

		boolean bucle = true;

		do {
			System.out.print("Año de estreno: ");
			try {
				año = Main.scan.nextInt();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido correctamente.");
			}
			Main.scan.nextLine();
		} while (bucle);

		bucle = true;

		do {
			System.out.print("Duración en minutos: ");
			try {
				duracion = Main.scan.nextInt();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido correctamente.");
			}
			Main.scan.nextLine();
		} while (bucle);
	}
}
