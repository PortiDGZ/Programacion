package Ejercicios;

import java.util.*;

public class PersonaMain2 {

	static ArrayList<Persona> lista = new ArrayList<Persona>();

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		leerTodos();
		menu();
	}

	private static void menu() {
		final int FIN = 5;
		int op = 0;

		do {
			System.out.println("1 - Dar de alta.");
			System.out.println("2 - Dar de baja.");
			System.out.println("3 - Modificar datos.");
			System.out.println("4 - Mostrar todos.");
			System.out.println("5 - Salir.");

			op = scan.nextInt();
			scan.nextLine();

			switch (op) {
			case 1:
				leer();
				break;
			case 2:
				quitar();
				break;
			case 3:
				modificar();
				break;
			case 4:
				mostrarTodos();
				break;
			}
		} while (op != FIN);
	}

	private static void modificar() {
		if (lista.isEmpty()) {
			System.out.print("La lista está vacía.");
		} else {
			System.out.print("Número de la persona a modificar: ");
			Persona elem = lista.get(scan.nextInt());
			scan.nextLine();
			int dato = menuDeDatos();
			scan.nextLine();
			modificarDato(elem, dato);
			System.out.println("Dato modificado:");
			System.out.println();
		}
	}

	private static int menuDeDatos() {
		System.out.println("Dato a modificar:");
		System.out.println("1 - DNI.");
		System.out.println("2 - Apellidos.");
		System.out.println("3 - Nombre.");
		System.out.println("4 - Sexo.");
		System.out.println("5 - Fecha de nacimiento.");
		System.out.println("6 - Peso.");
		System.out.println("7 - Altura.");
		return scan.nextInt();
	}

	private static void modificarDato(Persona elem, int dato) {
		switch (dato) {
		case 1:
			System.out.print("DNI: ");
			elem.setDni(scan.nextLine());
			break;

		case 2:
			System.out.print("Apellidos: ");
			elem.setApellidos(scan.nextLine());
			break;

		case 3:
			System.out.print("Nombre: ");
			elem.setNombre(scan.nextLine());
			break;

		case 4:
			System.out.print("Sexo (V/M): ");
			elem.setSexo(scan.nextLine().toUpperCase().charAt(0));
			break;

		case 5:
			System.out.print("Fecha de nacimiento: ");
			elem.setNacimiento(scan.nextLine());
			break;

		case 6:
			System.out.print("Peso: ");
			elem.setPeso(scan.nextDouble());
			break;

		case 7:
			System.out.print("Altura: ");
			elem.setAltura(scan.nextDouble());
			break;
		}
	}

	private static void quitar() {
		if (lista.isEmpty()) {
			System.out.print("La lista está vacía.");
		} else {
			System.out.print("Número de la persona a dar de baja: ");
			boolean existe = lista.remove(scan.nextInt()) != null;
			System.out.println("Persona eliminada.");
			System.out.println();
		}

	}

	private static void leer() {
		Persona elem = new Persona();
		elem.leerDatosPersona();
		lista.add(elem);
	}

	private static void leerTodos() {
		System.out.print("Número de personas: ");

		int cantidad = Math.max(10, scan.nextInt());
		scan.nextLine();

		for (int i = 1; i <= cantidad; i++) {
			System.out.println("Persona " + i + ".");
			leer();
			System.out.println();
		}
	}

	private static void mostrarTodos() {
		for (Persona elem : lista) {
			elem.verDatosPersona();
			System.out.println();
		}
	}

}
