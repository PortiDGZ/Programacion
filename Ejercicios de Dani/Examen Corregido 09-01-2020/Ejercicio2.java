package examen;

import java.util.Scanner;

public class Ejercicio2 {

	// Devuelve el factorial del número introducido
	public static long factorial(long n) {
		long resultado = 1;

		// Se multiplica por cada número anterior
		for (long i = 2; i <= n; i++) {
			resultado *= i;
		}

		return resultado;
	}

	// Devuelve la cifra indicada de un número, comenzando en 1 por la derecha
	public static long cifra(long n, long pos) {
		// Número sin las cifras a la derecha de la deseada
		long resultado = (long) (n / Math.pow(10, pos - 1));

		// El número de arriba cambiando la cifra deseada por un 0
		long izquierda = (resultado / 10) * 10;

		// La diferencia entre ambos es la cifra deseada
		resultado -= izquierda;

		return resultado;
	}

	// Devuelve el tamaño de un número
	public static long longitud(long n) {
		long l = 0;

		// Bucle que itera hasta que no le queden cifras al número
		while (n > 0) {
			// Cuenta una cifra
			l++;

			// Le quita una cifra al número
			n /= 10;
		}

		return l;
	}

	// Devuelve el número al revés
	public static long voltearNum(long n) {
		long volteado = 0;

		// Bucle que itera por cada cifra del número desde la izquierda
		for (long i = 1; i <= longitud(n); i++) {
			// Coloca la cifra en la posición más a la derecha vacía
			volteado += cifra(n, i) * Math.pow(10, longitud(n) - i);
		}

		return volteado;
	}

	// Sustituye una cifra de un número por otra aleatoria
	public static long cambiarDigito(long n, long pos) {
		// Comenzar desde la izquierda y desde el 1
		pos = longitud(n) - pos;
		
		// Cambiamos por 0 la posición deseada
		n -= cifra(n, pos + 1) * (long) Math.pow(10, pos);

		// Generamos la nueva cifra
		long cifra = (long) (Math.random() * 10);

		// Colocamos la cifra
		n += cifra * (long) Math.pow(10, pos);

		return n;
	}

	// Muestra al usuario todas las operaciones que puede realizar y el número
	// correspondiente
	public static void mostrarOpciones() {
		System.out.println("Por favor, escoja una opción:");
		System.out.println("Voltear un número - 1");
		System.out.println("Calcular un factorial - 2");
		System.out.println("Cambiar una cifra de un número por otra aleatoria - 3");
		System.out.println("Salir - 4");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcion = 0;

		// Pide operaciones hasta que se introduce un 4
		do {
			// Se muestran las opciones y se pide una
			mostrarOpciones();
			opcion = scan.nextInt();

			// Tiene lugar la opción elegida
			switch (opcion) {
			case 1:
				// Se pide un número y se voltea
				System.out.print("Número a voltear: ");
				long aVoltear = scan.nextLong();
				System.out.println();

				System.out.print("Número volteado: ");
				System.out.println(voltearNum(aVoltear));
				break;
			case 2:
				// Se pide un número y se obtiene el factorial
				System.out.print("Número para obtener factorial: ");
				long fact = scan.nextLong();
				System.out.println();

				System.out.print("Factorial: ");
				System.out.println(factorial(fact));
				break;
			case 3:
				// Se pide un número y una posición y se cambia la cifra en esa posición por
				// otra aleatoria
				System.out.print("Número original: ");
				long original = scan.nextLong();
				System.out.println();

				System.out.print("Posicion a cambiar: ");
				long posi = scan.nextLong();
				System.out.println();

				System.out.print("Resultado: ");
				System.out.println(cambiarDigito(original, posi));
				break;
			}

			System.out.println();
		} while (opcion != 4);

		System.out.println("Gracias por usar este programa.");

		scan.close();
	}

}
