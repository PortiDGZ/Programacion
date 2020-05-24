package productos;

import java.util.Scanner;

import core.Dinero;
import core.Main;

public class Juego extends Producto implements Digital, Fisico {

	// Atributos
	private int a�o;
	private String drm = "libre";
	private boolean encargado;
	private boolean claveGenerada;
	private int clave = Math.abs(codigos.nextInt());

	// Constructores
	public Juego(String nombre, int precio, int a�o, String drm) {
		super(nombre, precio);
		this.a�o = a�o;
		this.drm = drm;
	}

	public Juego() {
		pedirProducto();
	}

	// Encarga el producto
	@Override
	public void encargar() {
		if (claveGenerada) {
			System.out.println("El producto ya ha sido adquirido en digital.");
		} else {
			System.out.println("El pedido llegar� en aproximadamente una semana.");
		}
		
		encargado = true;
	}

	// Muestra la clave
	@Override
	public void muestraClave() {
		if (encargado) {
			System.out.println("El producto ya ha sido adquirido en f�sico.");
		} else {
			System.out.println("La clave de " + nombre + " es " + clave + ".");
		}
		
		claveGenerada = true;
	}

	// ToString
	public String toString() {
		return super.toString() + "\nA�o: " + a�o + "\nDRM: " + drm;
	}

	// Pide los datos del producto por teclado
	@Override
	protected void pedirProducto() {
		super.pedirProducto();

		boolean bucle = true;

		do {
			System.out.print("A�o de salida: ");
			try {
				a�o = Main.scan.nextInt();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido correctamente.");
			}
			Main.scan.nextLine();
		} while (bucle);

		bucle = true;

		do {
			System.out.print("DRM: ");
			try {
				drm = Main.scan.nextLine();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido correctamente.");
			}
		} while (bucle);
	}

}
