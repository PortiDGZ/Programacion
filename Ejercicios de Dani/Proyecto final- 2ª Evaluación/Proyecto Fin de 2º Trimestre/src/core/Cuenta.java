package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import productos.Digital;
import productos.Fisico;
import productos.Producto;

public class Cuenta implements Serializable {

	// Atributos
	private String titular = "";
	private Dinero fondos = new Dinero(0);
	private ArrayList<Producto> lista = new ArrayList<Producto>();

	// Constructor
	public Cuenta() throws FileNotFoundException, IOException {
		pedirDatos();
		guardar();
	}

	// Pide los datos de la cuenta por teclado
	private void pedirDatos() {
		boolean bucle = true;

		do {
			System.out.print("Nombre del titular: ");
			try {
				titular = Main.scan.nextLine();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido correctamente.");
			}
		} while (bucle);

		bucle = true;
		do {
			System.out.println("Dinero de la cuenta: ");
			try {
				fondos = new Dinero(Main.scan.nextDouble());
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido correctamente.");
			}
			Main.scan.nextLine();
		} while (bucle);
	}

	// Guardar el objeto en un archivo
	private void guardar() throws FileNotFoundException, IOException {
		File archivo = new File(titular + ".cuenta");

		try (FileOutputStream fos = new FileOutputStream(archivo)) {
			try (ObjectOutputStream stream = new ObjectOutputStream(fos)) {
				archivo.delete();
				archivo.createNewFile();
				stream.writeObject(this);
			}
		}
	}
	
	// ToString
	public String toString() {
		return "Titular: " + titular + "\nSaldo: " + fondos;
	}
	
	// Ver todos los productos adquiridos
	public void verAdquiridos() {
		for (int i = 0; i <= lista.size() - 1; i++) {
			System.out.println("Número " + (i + 1) + ":\n" + lista.get(i) + "\n\n");
		}
	}
	
	// Ver todos los productos físicos adquiridos
	public void verEncargables() {
		for (int i = 0; i <= lista.size() - 1; i++) {
			Producto p = lista.get(i);
			
			if(p instanceof Fisico) {
				System.out.println("Número " + (i + 1) + ":\n" + p + "\n\n");
			}
		}
	}
	
	// Ver todos los productos digitales adquiridos
	public void verDescargables() {
		for (int i = 0; i <= lista.size() - 1; i++) {
			Producto p = lista.get(i);
			
			if(p instanceof Digital) {
				System.out.println("Número " + (i + 1) + ":\n" + p + "\n\n");
			}
		}
	}

	// Getters
	public String getTitular() {
		return titular;
	}
	
	public int getSize() {
		return lista.size();
	}

	// Aumentar dinero
	public void añadirDinero() throws FileNotFoundException, IOException {
		boolean bucle = true;
		
		do {
			System.out.println("Dinero a introducir: ");
			try {
				fondos.añadirEuros(Main.scan.nextDouble());
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha escrito correctamente.");
			}
			Main.scan.nextLine();
		} while (bucle);
		
		guardar();
	}

	// Restar dinero a fondos
	public boolean pagar(Dinero precio) {
		if(fondos.compareTo(precio) > 0) {
			fondos.restar(precio);
		
			System.out.println("Carro comprado por " + precio + ".");
			System.out.println();
			return true;
		} else {
			System.out.println("No hay fondos suficientes.");
			System.out.println();
			return false;
		}
	}

	// Añadir todos los productos del carro a la lista
	public void añadirProductos(Carro carro) throws FileNotFoundException, IOException {
		lista.addAll(carro.getLista());
		
		guardar();
	}

	// Encarga un producto físico
	public void encargar(int producto) throws FileNotFoundException, IOException {
		Producto p = lista.get(producto - 1);
		
		if(p instanceof Fisico) {
			((Fisico) p).encargar();
		} else {
			System.out.println("El producto seleccionado no es encargable.");
		}
		
		guardar();
	}
	
	// Muestra la clave de un producto digital
	public void verClave(int producto) throws FileNotFoundException, IOException {
		Producto p = lista.get(producto - 1);
		
		if(p instanceof Digital) {
			((Digital) p).muestraClave();
		} else {
			System.out.println("El producto seleccionado no tiene clave asociada.");
		}
		
		guardar();
	}

}
