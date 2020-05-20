package EjerciciosAbstraccion;

import java.util.*;

public class Ejercicio2Main {

	private static ArrayList<ObjetoGeometrico> lista = new ArrayList<ObjetoGeometrico>();

	public static void main(String[] args) {
		// Bucle que muestra, recoge y procesa opciones
		int opcion = 0;

		do {
			mostrarOpciones();
			opcion = recogerOpcion();

			switch (opcion) {
			case 1:
				insertar();
				break;
			case 2:
				verLista();
				break;
			case 3:
				System.out.println("Área total: " + areaTotal());
				break;
			}

			System.out.println();
		} while (opcion != 4);
	}

	// Muestra el tipo, área y perímetro de cada objeto de lista
	private static void verLista() {
		for(ObjetoGeometrico elem : lista) {
			System.out.println(elem.getTipo());
			System.out.println("Área: " + elem.area());
			System.out.println("Perímero: " + elem.perimetro());
			System.out.println();
		}
	}

	// Añadir un objeto a lista
	private static void insertar() {
		mostrarClases();
		int clase = recogerOpcion();
		
		if (clase <= 3 && clase >= 1) {
			ObjetoGeometrico figura = null;
			switch (clase) {
			case 1:
				figura = new Circunferencia();
				break;
			case 2:
				figura = new Rectangulo();
				break;
			case 3:
				figura = new Cuadrado();
				break;
			}
			figura.leePorTeclado();
			lista.add(figura);
		}
	}

	// Tipos de figuras que se pueden crear
	private static void mostrarClases() {
		System.out.println("1. Circunferencia");
		System.out.println("2. Rectángulo");
		System.out.println("3. Cuadrado");
		System.out.println("4. Salir");
		System.out.println();
	}

	// Pide por teclado un integer que representa la acción escogida
	private static int recogerOpcion() {
		boolean bucle = true;
		int opcion = 0;

		do {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Elige una opción: ");
				opcion = scan.nextInt();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido un integer.");
			}
		} while (bucle);

		System.out.println();

		return opcion;
	}

	// Lista de acciones posibles
	private static void mostrarOpciones() {
		System.out.println("1. Introducir figura");
		System.out.println("2. Ver lista");
		System.out.println("3. Ver área total");
		System.out.println("4. Salir");
		System.out.println();
	}

	// Calcula la suma de las areas de la lista
	private static double areaTotal() {
		double area = 0;

		for (ObjetoGeometrico elem : lista) {
			area += elem.area();
		}

		return area;
	}

}
