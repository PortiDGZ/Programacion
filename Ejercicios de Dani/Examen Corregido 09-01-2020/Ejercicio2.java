package examen;

import java.util.Scanner;

public class Ejercicio2 {

	// Devuelve el factorial del n�mero introducido
	public static long factorial(long n) {
		long resultado = 1;

		// Se multiplica por cada n�mero anterior
		for (long i = 2; i <= n; i++) {
			resultado *= i;
		}

		return resultado;
	}

	// Devuelve la cifra indicada de un n�mero, comenzando en 1 por la derecha
	public static long cifra(long n, long pos) {
		// N�mero sin las cifras a la derecha de la deseada
		long resultado = (long) (n / Math.pow(10, pos - 1));

		// El n�mero de arriba cambiando la cifra deseada por un 0
		long izquierda = (resultado / 10) * 10;

		// La diferencia entre ambos es la cifra deseada
		resultado -= izquierda;

		return resultado;
	}

	// Devuelve el tama�o de un n�mero
	public static long longitud(long n) {
		long l = 0;

		// Bucle que itera hasta que no le queden cifras al n�mero
		while (n > 0) {
			// Cuenta una cifra
			l++;

			// Le quita una cifra al n�mero
			n /= 10;
		}

		return l;
	}

	// Devuelve el n�mero al rev�s
	public static long voltearNum(long n) {
		long volteado = 0;

		// Bucle que itera por cada cifra del n�mero desde la izquierda
		for (long i = 1; i <= longitud(n); i++) {
			// Coloca la cifra en la posici�n m�s a la derecha vac�a
			volteado += cifra(n, i) * Math.pow(10, longitud(n) - i);
		}

		return volteado;
	}

	// Sustituye una cifra de un n�mero por otra aleatoria
	public static long cambiarDigito(long n, long pos) {
		// Comenzar desde la izquierda y desde el 1
		pos = longitud(n) - pos;
		
		// Cambiamos por 0 la posici�n deseada
		n -= cifra(n, pos + 1) * (long) Math.pow(10, pos);

		// Generamos la nueva cifra
		long cifra = (long) (Math.random() * 10);

		// Colocamos la cifra
		n += cifra * (long) Math.pow(10, pos);

		return n;
	}

	// Muestra al usuario todas las operaciones que puede realizar y el n�mero
	// correspondiente
	public static void mostrarOpciones() {
		System.out.println("Por favor, escoja una opci�n:");
		System.out.println("Voltear un n�mero - 1");
		System.out.println("Calcular un factorial - 2");
		System.out.println("Cambiar una cifra de un n�mero por otra aleatoria - 3");
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

			// Tiene lugar la opci�n elegida
			switch (opcion) {
			case 1:
				// Se pide un n�mero y se voltea
				System.out.print("N�mero a voltear: ");
				long aVoltear = scan.nextLong();
				System.out.println();

				System.out.print("N�mero volteado: ");
				System.out.println(voltearNum(aVoltear));
				break;
			case 2:
				// Se pide un n�mero y se obtiene el factorial
				System.out.print("N�mero para obtener factorial: ");
				long fact = scan.nextLong();
				System.out.println();

				System.out.print("Factorial: ");
				System.out.println(factorial(fact));
				break;
			case 3:
				// Se pide un n�mero y una posici�n y se cambia la cifra en esa posici�n por
				// otra aleatoria
				System.out.print("N�mero original: ");
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
