package Ejercicios;

import java.util.*;

public class EmpleadoMain {

	private static Scanner scan = new Scanner(System.in);
	
	private static ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

	public static void main(String[] args) {
		int n = numeroEmpleados();
		leerEmpleados(n);
		leerHorarios(365);
		mayorYMenor();
		medias();
	}

	private static void medias() {
		System.out.println("Media diaria de horas trabajadas:");
		System.out.println();
		
		for (int i = 0; i <= listaEmpleados.size() - 1; i++) {
			System.out.println("Empleado " + i + ": " + listaEmpleados.get(i).mediaHoras());
		}
	}

	private static void mayorYMenor() {
		Empleado mayor = listaEmpleados.get(0);
		Empleado menor = mayor;
		
		for (int i = 1; i <= listaEmpleados.size() - 1; i++) {
			Empleado actual = listaEmpleados.get(i);
			mayor = Empleado.mayor(mayor, actual);
			menor = Empleado.menor(menor, actual);
		}
		
		System.out.println("El empleado que más horas ha trabajado es:");
		System.out.println(mayor);
		System.out.println();
		
		System.out.println("El empleado que menos horas ha trabajado es:");
		System.out.println(menor);
		System.out.println();
	}

	private static void leerHorarios(int dias) {
		for (int i = 0; i <= listaEmpleados.size() - 1; i++) {
			System.out.println("Empleado " + (i + 1) + ":");
			System.out.println();
			listaEmpleados.get(i).setHoras(dias, scan);
			System.out.println();
		}
	}

	private static void leerEmpleados(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("Empleado " + i + ":");
			System.out.println();
			listaEmpleados.add(leerEmpleado());
			System.out.println();
		}
	}

	private static int numeroEmpleados() {
		System.out.print("Introduce el número de empleados: ");
		int n = scan.nextInt();
		scan.nextLine();
		System.out.println();
		return n;
	}
	
	private static Empleado leerEmpleado() {
		System.out.print("Nombre: ");
		String nombre = scan .nextLine();
		
		System.out.print("Apellidos: ");
		String apellidos = scan.nextLine();
		
		System.out.print("Teléfono: ");
		int telefono = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Domicilio: ");
		String domicilio = scan.nextLine();
		
		System.out.print("Fecha de nacimiento (dd/mm/yyyy): ");
		String nacimiento = scan.nextLine();
		scan.nextLine();
		
		System.out.print("Fecha de alta en la empresa (dd/mm/yyyy): ");
		String alta = scan.nextLine();
		scan.nextLine();
		
		System.out.println();
		
		return new Empleado(nombre, apellidos, telefono, domicilio, nacimiento, alta);
	}

}
