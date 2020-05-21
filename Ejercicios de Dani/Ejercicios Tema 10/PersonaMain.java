package Ejercicios;

import java.util.*;

public class PersonaMain {
	
	static ArrayList<Persona> lista = new ArrayList<Persona>();
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		leerTodos(10);
		mostrarTodos();
	}

	// Lee los datos de todas las personas
	private static void leerTodos(int cantidad) {
		for (int i = 1; i <= cantidad; i++) {
			System.out.println("Persona " + i + ".");
			Persona elem = new Persona();
			elem.leerDatosPersona();
			lista.add(elem);
			System.out.println();
		}
	}

	// Muestra los datos de todas las personas
	private static void mostrarTodos() {
		for (Persona elem : lista) {
			elem.verDatosPersona();
			System.out.println();
		}
	}

}
