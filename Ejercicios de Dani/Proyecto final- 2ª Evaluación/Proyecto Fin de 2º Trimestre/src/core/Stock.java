package core;

import java.io.*;
import java.util.*;

import productos.*;

public abstract class Stock {
	
	// Esta clase maneja el listado de productos que se pueden comprar y su lectura/escritura en un archivo .dat
	
	// Atributos
	private static ArrayList<Producto> lista = new ArrayList<Producto>();
	private static File archivo = new File("stock.dat");
	
	// Cargar el archivo, o, si no existe, crearlo e inicializar la tienda con una serie de productos predeterminados
	public static void cargarOInicializar() throws FileNotFoundException, IOException, ClassNotFoundException {
		if (archivo.exists()) {
			cargar();
		}
		else {
			inicializar();
		}
	}

	// Crear una lista de productos predeterminada y la guarda en un archivo
	private static void inicializar() throws FileNotFoundException, IOException {
		lista.add(new Juego("DOOM", 4000, 2016, "Steam"));
		lista.add(new PC("Acer", 50000, "Portátil", 8));
		lista.add(new Pelicula("EL Caballero Oscuro", 1000, 2008, 152));
		lista.add(new Suscripcion("Netflix", 800, 1));
		
		guardar();
	}

	// Guardar la lista actual en el archivo
	private static void guardar() throws FileNotFoundException, IOException {
		try(FileOutputStream fos = new FileOutputStream(archivo)) {
			try(ObjectOutputStream stream = new ObjectOutputStream(fos)) {
				archivo.delete();
				archivo.createNewFile();
				stream.writeObject(lista);
			}
		}
	}

	// Obtener la lista de productos desde un archivo
	private static void cargar() throws FileNotFoundException, IOException, ClassNotFoundException {
		try(FileInputStream fis = new FileInputStream(archivo)) {
			try(ObjectInputStream stream = new ObjectInputStream(fis)) {
				lista = (ArrayList<Producto>) stream.readObject();
			}
		}
	}
	
	// Añadir o eliminar productos y guardar la lista el archivo
	public static void añadir(Producto p) throws FileNotFoundException, IOException {
		lista.add(p);
		guardar();
	}
	
	public static void eliminar(int p) throws FileNotFoundException, IOException {
		lista.remove(p);
		guardar();
	}
	
	// Obtener producto de la lista
	public static Producto getProducto(int i) {
		return lista.get(i - 1);
	}

	// Muestra todos los productos
	public static void ver() {
		for (int i = 0; i <= lista.size() - 1; i++) {
			System.out.println("Número " + (i + 1) + ":");
			System.out.println(lista.get(i));
			System.out.println();
		}
	}

	// Número de productos en stock
	public static int tamaño() {
		return lista.size();
	}

}
