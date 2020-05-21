package ejerciciosTema9;

import java.util.*;

public class EmpleadoMain {
	
	// Array de empleados
	static Empleado[] lista;
	
	// Scanner
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Inicializa la lista de empleados con un número de elementos introducido por teclado
		lista = new Empleado[pedirInt(20, "Número de empleados: ")];
		
		// Pedir empleados
		pedirEmpleados();
		
		// Pedir salario por hora extra
		Empleado.setSueldoHoraExtra(pedirDouble("Precio de la hora extra: "));
		scan.close();
		
		// Ordenar por salario
		ordenarSalario();
		
		// Mostrar empleado que más cobra y el que menos
		mostrarExtremos();
		
		// Mostrar empleado que más cobra por horas extra y el que menos
		mostrarExtremosSalarioExtra();
		
		// Mostrar todo ordenado
		System.out.println("Empleados ordenados por sueldo:");
		System.out.println();
		mostrar(lista);
	}
	
	// Ordena la lista de empleados por salario de menor a mayor usando un bubblesort
	static void ordenarSalario() {
		boolean desordenado;
		
		do {
			desordenado = iteracion();
		} while (desordenado);
	}

	static boolean iteracion() {
		boolean desordenado = false;
		
		for (int i = 1; i <= lista.length - 1; i++) {
			if (lista[i - 1].getSueldo() > lista[i].getSueldo()) {
				cambiar(i);
				desordenado = true;
			}
		}
		
		return desordenado;
	}

	static void cambiar(int i) {
		Empleado aux = lista [i];
		lista [i] = lista [i - 1];
		lista [i - 1] = aux;
	}

	// Mostrar empleado que más cobra por horas extra y el que menos
	static void mostrarExtremosSalarioExtra() {
		Empleado mayor = lista [0];
		Empleado menor = lista [0];
		
		for (Empleado elem : lista) {
			if (mayor.complemento() < elem.complemento()) {
				mayor = elem;
			}
			
			if (menor.complemento() > elem.complemento()) {
				menor = elem;
			}
		}
		
		System.out.println("Empleado que más cobra por horas extra:");
		System.out.println();
		System.out.println(mayor);
		System.out.println();
		
		System.out.println("Empleado que menos cobra por horas extra:");
		System.out.println();
		System.out.println(menor);
		System.out.println();
	}

	// Mostrar empleado que más cobra y el que menos
	static void mostrarExtremos() {
		System.out.println("Empleado que más cobra:");
		System.out.println();
		System.out.println(lista[lista.length - 1]);
		System.out.println();
		
		System.out.println("Empleado que menos cobra:");
		System.out.println();
		System.out.println(lista[0]);
		System.out.println();
	}

	// Muestra un array
	static <E> void mostrar(E[] lista2) {
		for (E elem : lista2) {
			System.out.println(elem);
			System.out.println();
		}
	}

	// Rellena la lista de empleados por teclado
	static void pedirEmpleados() {
		for (int i = 0; i <= lista.length - 1; i++) {
			System.out.println("Empleado " + (i + 1) + ".");
			System.out.println();
			lista[i] = pedirEmpleado();
		}
	}

	// Pide por teclado los datos de un empleado
	static Empleado pedirEmpleado() {
		String nif = pedirString("Introduzca el NIF: ");
		Empleado empl = new Empleado(nif);
		
		String nombre = pedirString("Introduzca el nombre: ");
		empl.setNombre(nombre);
		
		double sueldo = pedirDouble("Introduzca el sueldo: ");
		empl.setSueldo(sueldo);
		
		int horas = pedirInt(80, "Introduzca las horas extra: ");
		empl.setHorasExtra(horas);
		
		double irpf = pedirDouble("Introduzca el IRPF: ");
		empl.setIrpf(irpf);
		
		int hijos = pedirInt("Introduzca los hijos: ");
		empl.setHijos(hijos);
		
		if (pedirString("¿Está casado (s/n)? ").toLowerCase().charAt(0) == 's') {
			empl.setCasado(true);
		}
		
		return empl;
	}

	// Pide un double por teclado
	static double pedirDouble(String s) {
		System.out.print(s);
		double n = scan.nextDouble();
		scan.nextLine();
		System.out.println();
		
		return n;
	}

	// Pide un string por teclado
	private static String pedirString(String s) {
		System.out.print(s);
		String r = scan.nextLine();
		System.out.println();
		return r;
	}

	// Pide un número por teclado
	static int pedirInt(int max, String s) {
		int n = 0;
		
		do {
			System.out.print(s);
			n = scan.nextInt();
			scan.nextLine();
			System.out.println();
		} while (n > max);
		
		return n;
	}
	
	static int pedirInt(String s) {
		System.out.print(s);
		int n = scan.nextInt();
		scan.nextLine();
		System.out.println();
		
		return n;
	}

}
