package examen;

import java.util.Scanner;

public class Ejercicio1 {

	// Genera un array n x m con números aleatorios de rango [min, max]
	public static int[][] generaArrayBiInt(int n, int m, int min, int max) {
		// Crea una tabla
		int[][] tabla = new int[n][m];

		rellenaRandom(tabla, min, max);

		// Devuelve la tabla
		return tabla;
	}

	// Rellena un array n x m con números aleatorios de rango [min, max]
	public static void rellenaRandom(int[][] tabla, int min, int max) {
		// Itera por filas
		for (int[] fila : tabla) {
			// Itera por columnas
			for (int i = 0; i <= fila.length - 1; i++) {
				// Rellena el elemento de la fila y la columna actual
				fila[i] = (int) (Math.random() * (max - min + 1) + min);
			}
		}
	}

	// Devuelve una fila de un array bidimensional
	public static int[] filaDeArrayBiInt(int[][] tabla, int i) {
		return tabla[i];
	}

	// Devuelve una columna de un array bidimensional
	public static int[] columnaDeArrayBiInt(int[][] tabla, int j) {
		// Creamos un array para guardar los valores de la columna
		int l = tabla.length;
		int[] columna = new int[l];

		// Itera por filas
		for (int i = 0; i <= l - 1; i++) {
			// Rellena columna con el valor j de la fila actual
			columna[i] = tabla[i][j];
		}

		return columna;
	}

	// Imprime un array bidimensional
	public static void printBi(int[][] tabla) {
		// Itera por cada fila y la imprime con printFila()
		for (int i = 0; i <= tabla.length - 1; i++) {
			printFila(tabla[i]);
			System.out.println();
		}
	}

	// Imprime un array monodimensional
	public static void printFila(int[] fila) {
		// Itera por cada miembro y lo imprime
		for (int i = 0; i <= fila.length - 1; i++) {
			System.out.print(fila[i]);
			if (i != fila.length - 1) {
				System.out.print(", ");
			}
		}
	}

	public static int[] buscaEnArrayBiInt(int[][] tabla, int n) {
		// Array para guardar la posición
		int[] pos = { -1, -1 };

		// Itera por cada fila
		for (int i = 0; i <= tabla.length - 1; i++) {
			// Itera por cada columna
			for (int j = 0; j <= tabla[i].length - 1; j++) {
				// Comprueba si es la que buscamos
				if (tabla[i][j] == n) {
					// Si la es, la devuelve
					pos[0] = i;
					pos[1] = j;
					return pos;
				}
			}
		}

		// Devuelve -1, -1 si no encuentra nada
		return pos;
	}

	// Devuelve la diagonal de un array bidimensional cuadrado.
	// Si no es cuadrado, devuelve una matriz vacía.
	public static int[] diagonal(int[][] tabla) {
		int l = tabla.length;

		// Array para guardar la columna
		int[] diag = new int[l];

		// Si el array no es cuadrado, se salta este paso
		if (l == tabla[0].length) {
			// Itera por cada fila
			for (int i = 0; i <= tabla.length - 1; i++) {
				// Introduce el número de la diagonal de esta fila en diag
				diag[i] = tabla[i][i];
			}
		}

		return diag;
	}

	// Muestra al usuario todas las operaciones que puede realizar y el número correspondiente
	public static void mostrarOpciones() {
		System.out.println("Por favor, escoja una opción:");
		System.out.println("Generar un array aleatorio - 1");
		System.out.println("Ver el array - 2");
		System.out.println("Ver una fila del array - 3");
		System.out.println("Ver una columna del array - 4");
		System.out.println("Ver la posición de un número en el array - 5");
		System.out.println("Ver la diagonal del array - 6");
		System.out.println("Salir - 7");
		System.out.println();
	}

	public static void main(String[] args) {
		int[][] tabla = new int[0][0];
		Scanner scan = new Scanner(System.in);

		int opcion = 0;

		// Bucle que realiza operaciones hasta que se introduce un 7
		do {
			mostrarOpciones();
			opcion = scan.nextInt();
			System.out.println();

			// Ejecuta la operación correspondiente usando los métodos creados
			switch (opcion) {
			case 1:
				// Se crea una nueva tabla y se muestra
				System.out.print("Número de filas: ");
				int n = scan.nextInt();
				System.out.print("Número de columnas: ");
				int m = scan.nextInt();
				System.out.print("Valor mínimo de cada elemento: ");
				int min = scan.nextInt();
				System.out.print("Valor máximo de cada elemento: ");
				int max = scan.nextInt();
				System.out.println();

				tabla = generaArrayBiInt(n, m, min, max);
			case 2:
				// Se muestra la tabla
				System.out.println("Este es el array: ");
				printBi(tabla);
				break;
			case 3:
				// Se muestra una fila de la tabla si existe
				System.out.print("Fila: ");
				int fila = scan.nextInt();
				System.out.println();

				if (fila >= 0 && fila <= tabla.length - 1) {
					System.out.println("Esta es la fila: ");
					printFila(filaDeArrayBiInt(tabla, fila));
					System.out.println();
				} else {
					System.out.println("La fila especificada no existe.");
				}
				break;
			case 4:
				// Se muestra una columna de la tabla si existe
				System.out.print("Columna: ");
				int columna = scan.nextInt();
				System.out.println();

				if (columna >= 0 && columna <= tabla[0].length - 1) {
					System.out.println("Esta es la columna: ");
					printFila(columnaDeArrayBiInt(tabla, columna));
					System.out.println();
				} else {
					System.out.println("La columna especificada no existe.");
				}
				break;
			case 5:
				// Se muestra la posición de un número de la tabla si existe
				System.out.print("Número: ");
				int numero = scan.nextInt();
				System.out.println();

				int[] posicion = buscaEnArrayBiInt(tabla, numero);
				if (posicion[0] != -1) {
					System.out.print("El número está en la posición ");
					printFila(posicion);
					System.out.println(".");
				} else {
					System.out.println("No se ha encontrado el número.");
				}
				break;
			case 6:
				// Se muestra la diagonal de la tabla si es cuadrada
				if (tabla.length == tabla[0].length) {
					System.out.println("Esta es la diagonal: ");
					printFila(diagonal(tabla));
					System.out.println();
				} else {
					System.out.println("El array no es cuadrado.");
				}
				break;
			}

			System.out.println();
		} while (opcion != 7);

		System.out.println("Gracias por usar este programa.");

		scan.close();
	}

}
