package productos;

import java.util.Scanner;

import core.Dinero;
import core.Main;

public class PC extends Producto implements Fisico {

	// Atributos
	String tipo = "sobremesa";
	int ram; // GB

	// Constructores
	public PC(String nombre, int precio, String tipo, int ram) {
		super(nombre, precio);
		this.tipo = tipo;
		this.ram = ram;
	}

	public PC() {
		pedirProducto();
	}

	// Encarga el producto
	@Override
	public void encargar() {
		System.out.println("El pedido llegará en aproximadamente una semana.");
	}

	// ToString
	public String toString() {
		return super.toString() + "\n" + tipo + "\nRAM: " + ram + " GB";
	}

	// Pide los datos del producto por teclado
	@Override
	protected void pedirProducto() {
		super.pedirProducto();

		boolean bucle = true;

		do {
			System.out.print("Tipo de PC: ");
			try {
				tipo = Main.scan.nextLine();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido correctamente.");
			}
		} while (bucle);

		bucle = true;

		do {
			System.out.print("Memoria RAM: ");
			try {
				ram = Main.scan.nextInt();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido correctamente.");
			}
			Main.scan.nextLine();
		} while (bucle);
	}

}
