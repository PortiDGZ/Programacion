package productos;

import java.io.Serializable;
import java.util.Scanner;

import core.Dinero;
import core.Main;

public abstract class Producto implements Serializable {
	
	// Atributos
	protected String nombre = "";
	private Dinero precio = new Dinero(0);
	
	// Constructores
	public Producto(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = new Dinero(precio);
	}
	
	public Producto() {
	}
	
	// Pide los datos del producto por teclado
	protected void pedirProducto() {
		boolean bucle = true;
		
		do {
			System.out.print("Nombre del producto: ");
			try {
				nombre = Main.scan.nextLine();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido correctamente.");
			}
		} while (bucle);
		
		bucle = true;
		do {
			System.out.println("Precio del producto: ");
			try {
				precio = new Dinero(Main.scan.nextDouble());
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido correctamente.");
			}
			Main.scan.nextLine();
		} while (bucle);
	}
	
	// ToString
	public String toString() {
		return nombre + "\nPrecio: " + precio;
	}
	
	// Getters
	public Dinero getPrecio() {
		return precio;
	}

}
