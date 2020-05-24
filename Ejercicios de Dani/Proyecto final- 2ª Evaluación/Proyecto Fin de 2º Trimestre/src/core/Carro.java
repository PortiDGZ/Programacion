package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import productos.Producto;

public class Carro implements Serializable {

	// Atributos
	private String nombre;
	private ArrayList<Producto> lista = new ArrayList<Producto>();

	// Añadir producto
	public void añadir(Producto nuevo, int cantidad) throws FileNotFoundException, IOException {
		for (int i = 1; i <= cantidad; i++) {
			lista.add(nuevo);
		}
		
		guardar();
	}

	// Eliminar producto
	public void eliminarTodos(Producto elemento) throws FileNotFoundException, IOException {
		while (lista.contains(elemento)) {
			lista.remove(elemento);
		}
		
		guardar();
	}

	public void eliminar(Producto elemento, int cantidad) throws FileNotFoundException, IOException {
		for (int i = 1; i <= cantidad; i++) {
			lista.remove(elemento);
		}
		
		guardar();
	}

	// Suma de precios
	public Dinero precioTotal() {
		int total = 0;

		for (Producto elem : lista) {
			total += elem.getPrecio().getCentimos();
		}

		return new Dinero(total);
	}

	// ToString
	public String toString() {
		String texto = "";

		for (int i = 0; i <= lista.size() - 1; i++) {
			texto += "Número " + (i + 1) + ":\n" + lista.get(i) + "\n\n";
		}

		return texto;
	}

	// Getters
	public ArrayList<Producto> getLista() {
		return lista;
	}

	// Guardar el objeto en un archivo
	private void guardar() throws FileNotFoundException, IOException {
		if (nombre != null) {
			File archivo = new File(nombre + ".carro");
			try (FileOutputStream fos = new FileOutputStream(archivo)) {
				try (ObjectOutputStream stream = new ObjectOutputStream(fos)) {
					archivo.delete();
					archivo.createNewFile();
					stream.writeObject(this);
				}
			} 
		}
	}
	
	// Crear nombre para que el carro pueda ser guardado
	public void crearArchivo() throws FileNotFoundException, IOException {
		boolean bucle = true;
		
		do {
			System.out.print("Nombre del carro: ");
			try {
				nombre = Main.scan.nextLine();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido correctamente.");
			}
		} while (bucle);
		
		System.out.println();
		
		guardar();
	}

}
