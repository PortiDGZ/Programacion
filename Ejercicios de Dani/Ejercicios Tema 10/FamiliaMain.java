package Ejercicios;

import java.util.*;

public class FamiliaMain {
	
	private static Scanner scan = new Scanner(System.in);
	
	private static ArrayList<Familia> lista = new ArrayList<Familia>();

	public static void main(String[] args) {
		leerFamilias(2);
		System.out.println();
		mostrarTodo();
		scan.close();
	}

	private static void leerFamilias(int m) {
		for (int i = 1; i <= m; i++) {
			System.out.println("Familia " + i + ":");
			leerFamilia();
		}
	}

	private static void leerFamilia() {
		System.out.println("Padre:");
		Familiar padre = leerFamiliar();
		
		System.out.println("Madre:");
		Familiar madre = leerFamiliar();
		
		Familia f = new Familia(padre, madre);
		
		System.out.print("Número de hijos: ");
		int n = Math.min(scan.nextInt(), 10);
		scan.nextLine();
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Hijo " + i + ":");
			f.addHijo(leerFamiliar());
		}
		
		lista.add(f);
	}

	private static Familiar leerFamiliar() {
		System.out.print("Nombre: ");
		String nombre = scan.nextLine();
		
		System.out.print("Apellidos: ");
		String apellidos = scan.nextLine();
		
		System.out.print("Sexo (H/M): ");
		char sexo = scan.nextLine().toUpperCase().charAt(0);
		
		System.out.print("Fecha de nacimiento (dd/mm/yyyy): ");
		String nacimiento = scan.nextLine();
		
		System.out.print("Peso: ");
		double peso = scan.nextDouble();
		scan.nextLine();
		
		System.out.print("Altura: ");
		double altura = scan.nextDouble();
		scan.nextLine();
		
		System.out.println();
		
		return new Familiar(apellidos, nombre, sexo, nacimiento, peso, altura);
	}

	private static void mostrarTodo() {
		for (int i = 0; i <= lista.size() - 1; i++) {
			System.out.println("Familia " + (i + 1) + ":");
			System.out.println();
			
			mostrarFamilia(i);
			
			System.out.println();
		}
	}

	private static void mostrarFamilia(int i) {
		Familia f = lista.get(i);
		
		System.out.println("Padre:");
		System.out.println(f.getPadre());
		
		System.out.println("Madre:");
		System.out.println(f.getMadre());
		
		System.out.println("Hijos:");
		for (Familiar elem : f.getHijos()) {
			System.out.println(elem);
		}
		
		System.out.println();
	}

}
