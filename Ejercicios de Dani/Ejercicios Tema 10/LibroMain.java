package Ejercicios;

import java.util.*;

public class LibroMain {
	
	private static int opcion;
	
	private static Scanner scan = new Scanner(System.in);
	
	private static ArrayList<Libro> lista = new ArrayList<Libro>();

	public static void main(String[] args) {
		do {
			menu();
			proceso();
		} while (opcion != 5);
		
		scan.close();
	}

	private static void proceso() {
		switch(opcion) {
		case 1:
			insertarLibro();
			break;
		case 2:
			verTodo();
			break;
		case 3:
			mostrarMasReciente();
			break;
		case 4:
			mostrarPrecioMedio();
			break;
		}
	}

	private static void mostrarPrecioMedio() {
		if (lista.isEmpty()) {
			System.out.println("No hay libros.");
			System.out.println();
		} else {
			System.out.println(precioMedio());
			System.out.println();
		}
	}

	private static double precioMedio() {
		double total = 0;
		
		for (Libro elem : lista) {
			total += elem.getPrecio();
		}
		
		return total / lista.size();
	}

	private static void mostrarMasReciente() {
		if (lista.isEmpty()) {
			System.out.println("No hay libros.");
			System.out.println();
		} else {
			System.out.println(masReciente());
			System.out.println();
		}
	}

	private static Libro masReciente() {
		Libro masReciente = lista.get(0);
		
		for (Libro elem : lista) {
			if (elem.comparaFecha(masReciente) > 0) {
				masReciente = elem;
			}
		}
		
		return masReciente;
	}

	private static void verTodo() {
		if (lista.isEmpty()) {
			System.out.println("No hay libros.");
			System.out.println();
		} else {
			for (Libro elem : lista) {
				System.out.println(elem);
				System.out.println();
			} 
		}
	}

	private static void insertarLibro() {
		System.out.print("Titulo del libro: ");
		String titulo = scan.nextLine();
		
		System.out.print("Autor del libro: ");
		String autor = scan.nextLine();
		
		System.out.print("Editorial del libro: ");
		String editorial = scan.nextLine();
		
		System.out.print("Fecha de compra del libro: ");
		String fecha = scan.nextLine();
		
		System.out.print("Precio del libro: ");
		double precio = scan.nextDouble();
		scan.nextLine();
		
		lista.add(new Libro(titulo, autor, editorial, fecha, precio));
		
		System.out.println();
	}

	private static void menu() {
		do {
			mostrarMenu();
			elegirOpcion();
			System.out.println();
		} while (opcion > 5 || opcion < 1);
	}

	private static void elegirOpcion() {
		opcion = scan.nextInt();
		scan.nextLine();
	}

	private static void mostrarMenu() {
		System.out.println("Elija una opción:");
		System.out.println("1 - Introducir libro.");
		System.out.println("2 - Ver libros.");
		System.out.println("3 - Ver libro más reciente.");
		System.out.println("4 - Ver precio medio de los libros.");
		System.out.println("5 - Salir.");
		System.out.println();
	}

}
