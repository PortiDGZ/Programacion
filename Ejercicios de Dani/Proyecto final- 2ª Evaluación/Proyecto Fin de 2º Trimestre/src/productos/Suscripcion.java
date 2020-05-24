package productos;

import java.util.Scanner;

import core.Dinero;
import core.Main;

public class Suscripcion extends Producto implements Digital {

	// Atributos
	private int duracion; // Meses
	private int clave = Math.abs(codigos.nextInt());

	// Constructores
	public Suscripcion(String nombre, int precio, int duracion) {
		super(nombre, precio);
		this.duracion = duracion;
	}

	public Suscripcion() {
		pedirProducto();
	}

	// Muestra la clave
	@Override
	public void muestraClave() {
		System.out.println("La clave de suscripción a " + nombre + " es " + clave + ".");
	}

	// ToString
	public String toString() {
		return "Suscripción a " + super.toString() + "\nDuración: " + duracion + " meses";
	}

	// Pide los datos del producto por teclado
	@Override
	protected void pedirProducto() {
		super.pedirProducto();

		boolean bucle = true;

		do {
			System.out.print("Duración en meses: ");
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
