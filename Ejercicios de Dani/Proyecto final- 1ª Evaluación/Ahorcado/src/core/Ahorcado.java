package core;

import java.util.Scanner;

public class Ahorcado {

	// Usado en varios métodos de la clase
	static Scanner scan = new Scanner(System.in);

	// Pregunta al jugador qué variante quiere jugar
	static int pedirVariante() {
		int opcion = 0;

		mostrarVariantes();

		// Este bucle se repite hasta que la respuesta tenga sentido
		do {
			opcion = scan.nextInt();
		} while (opcion > 3 || opcion < 0);

		return opcion;
	}

	// Muestra al jugador todas las variantes y su respectivo comando
	static void mostrarVariantes() {
		System.out.println("Elija variante.");
		System.out.println("Ahorcado - 1");
		System.out.println("Ahorcado sin vocales - 2");
		System.out.println("Ahorcado con puntaje - 3");
		System.out.println();
	}

	// Este método maneja el flujo general de una partida normal
	static void partida() {
		// Se escoge una palabra y se genera una cadena de líneas a rellenar por el
		// jugador
		String palabra = elegirPalabra();
		String completar = lineas(palabra.length());

		// Esta variable recoge el número de letras que faltan por acertar
		int restantes = palabra.length();

		// Se pregunta al jugador cuántas oportunidades desea tener
		// Hace las veces de selector de dificultad
		int oportunidades = pedirOportunidades();
		System.out.println();

		int opcion = 0;

		// Este bucle pide acciones al jugador hasta que ganar o perder sean true
		boolean ganar = false;
		boolean perder = false;

		do {
			// Se muestra la palabra descubierta y las oportunidades restantes
			mostrarEstado(completar);
			System.out.println("Oportunidades restantes: " + oportunidades);
			System.out.println();

			// Se pide al jugador su acción
			opcion = pedirOpcion();

			// La acción tiene lugar
			switch (opcion) {
			case 1:
				// El jugador introduce una letra y se revela si está en la palabra, o pierde
				// una oportunidad si no lo está
				char letra = pedirLetra();
				System.out.println();

				// Se obtiene cuantas veces aparece la letra en la palabra
				int aciertos = coincidencias(letra, palabra, completar);

				if (aciertos == 0) {
					// Si ha fallado, se le comunica y pierde una oportunidad
					System.out.println("Has fallado.");
					System.out.println();

					oportunidades--;
				} else {
					// Si ha acertado, se actualiza el mapa de la palabra y el número de letras
					// restantes
					System.out.println("Letra correcta.");
					System.out.println();

					restantes -= aciertos;

					completar = llenar(completar, palabra, letra);
				}

				break;
			case 2:
				// El jugador intenta adivinar la palabra. Si la acierta, gana. Si no, pierde
				// una oportunidad.
				String intento = adivinarPalabra();
				System.out.println();

				if (intento.equals(palabra)) {
					ganar = true;
				} else {
					System.out.println("Has fallado.");
					System.out.println();

					oportunidades--;
				}

				break;
			}

			// Comprobar si la palabra está resuelta para hacer ganar al jugador
			if (restantes <= 0) {
				ganar = true;
			}

			// Comprobar si el jugador está sin oportunidades para hacerlo perder
			if (oportunidades <= 0) {
				perder = true;
			}
		} while (!ganar && !perder);
		// El juego ha terminado

		// Se comunica al jugador si ha ganado o perdido
		if (perder) {
			System.out.println("Has perdido.");
			System.out.println();
		} else if (ganar) {
			System.out.println("Has ganado.");
			System.out.println();
		}

		// Se muestra la palabra en cualquier caso
		System.out.println("La palabra es: " + palabra);
		System.out.println();
	}

	// Este método actualiza el mapa de la palabra para mostrar una nueva letra
	static String llenar(String completar, String palabra, char letra) {
		String resultado = "";

		// Itera por cada letra
		for (int i = 0; i <= palabra.length() - 1; i++) {
			if (palabra.charAt(i) == letra) {
				// Si la letra coincide, la copia al resultado
				resultado += letra;
			} else {
				// Si no coincide, la deja como estaba en completar
				resultado += completar.charAt(i);
			}
		}

		return resultado;
	}

	// Este método devuelve el número de veces que una letra aparece en la palabra
	static int coincidencias(char letra, String palabra, String completar) {
		int aciertos = 0;

		// Intera por cada letra
		for (int i = 0; i <= palabra.length() - 1; i++) {
			if (palabra.charAt(i) == letra && completar.charAt(i) != letra) {
				// Si la letra coincide y no está ya revelada, aumenta el recuento
				aciertos++;
			}
		}

		return aciertos;
	}

	// Este método muestra el mapa de la palabra separando los caracteres con
	// espacios para que puedan contarse las posiciones vacías
	static void mostrarEstado(String completar) {
		for (int i = 0; i <= completar.length() - 1; i++) {
			System.out.print(completar.charAt(i) + " ");
		}
		System.out.println();
	}

	// Este método pide una acción al jugador
	static int pedirOpcion() {
		int opcion = 0;

		// Muestra las posibles acciones
		mostrarOpciones();

		// Pide opciones hasta que la respuesta tenga sentido
		do {
			opcion = scan.nextInt();
		} while (opcion > 2 || opcion < 0);

		return opcion;
	}

	// Este método pide al jugador que adivine la palabra y devuelve su respuesta
	static String adivinarPalabra() {
		System.out.print("Palabra: ");
		return scan.next().toUpperCase().trim();
	}

	// Este método pide una letra al jugador y la devuelve en mayúsculas. Usado para
	// que el jugador intente adivinar letras.
	static char pedirLetra() {
		System.out.print("Letra: ");
		return scan.next().toUpperCase().charAt(0);
	}

	// Este método pide al jugador el número de oportunidades del que dispondrá
	static int pedirOportunidades() {
		System.out.print("Número de oportunidades: ");
		return scan.nextInt();
	}

	// Este método muestra al jugador las posibles acciones que puede realizar
	static void mostrarOpciones() {
		System.out.println("Elija una acción.");
		System.out.println("Pedir letra - 1");
		System.out.println("Adivinar palabra - 2");
		System.out.println();
	}

	// Este método genera una cadena de líneas del tamaño especificado (el de la
	// palabra)
	static String lineas(int n) {
		String l = "";

		for (int i = 1; i <= n; i++) {
			l += "_";
		}

		return l;
	}

	// Este método devuelve una palabra al azar de la lista o una introducida por teclado
	static String elegirPalabra() {
		// Muestra las opciones de contrincante
		mostrarContrincante();
		
		int opcion;
		
		// Pide opciones hasta que la respuesta tenga sentido
		do {
			opcion = scan.nextInt();
		} while (opcion > 2 || opcion < 0);
		
		// Devuelve la opción elegida
		if (opcion == 2) {
			// Se devuelve una palabra introducida por teclado
			System.out.println();
			System.out.print("Introduzca la palabra: ");
			String Palabra = scan.next().toUpperCase();
			
			limpiarPantalla();
			
			return Palabra;
		} else {
			// Se devuelve una palabra aleatoria de la lista
			int palabra = (int) (Math.random() * Lista.Palabras.length);
	
			return Lista.Palabras[palabra];
		}
	}
	
	// Limpia la pantalla de manera poco elegante
	static void limpiarPantalla() {
		for (int i = 1; i <= 55; i++) {
			System.out.println();
		}
	}
	
	// Mustra las opciones para elegir palabra
	static void mostrarContrincante() {
		System.out.println("Elija el contrincante.");
		System.out.println("Jugador vs Máquina - 1");
		System.out.println("Jugador vs Jugador - 2");
		System.out.println();
	}

	// Este método maneja el flujo general de una partida en la que no pueden
	// pedirse vocales
	static void sinVocales() {
		// Se escoge una palabra y se genera una cadena de líneas a rellenar por el
		// jugador
		String palabra = elegirPalabra();
		String completar = lineas(palabra.length());

		// Se pregunta al jugador cuántas oportunidades desea tener
		// Hace las veces de selector de dificultad
		int oportunidades = pedirOportunidades();
		System.out.println();

		int opcion = 0;

		// Este bucle pide acciones al jugador hasta que ganar o perder sean true
		boolean ganar = false;
		boolean perder = false;

		do {
			// Se muestra la palabra descubierta y las oportunidades restantes
			mostrarEstado(completar);
			System.out.println("Oportunidades restantes: " + oportunidades);
			System.out.println();

			// Se pide al jugador su acción
			opcion = pedirOpcion();

			// La acción tiene lugar
			switch (opcion) {
			case 1:
				// El jugador introduce una letra y se revela si está en la palabra, o pierde
				// una oportunidad si no lo está o si introduce una vocal
				char letra = pedirLetra();
				System.out.println();

				// Se obtiene cuantas veces aparece la letra en la palabra
				int aciertos = coincidencias(letra, palabra, completar);

				if (esVocal(letra)) {
					// Si el jugador incumple la regla especial de este modo, pierde una oportunidad
					System.out.println("¡Las vocales están prohibidas!");
					System.out.println("Pierdes una oportunidad.");
					System.out.println();

					oportunidades--;
				} else if (aciertos == 0) {
					// Si ha fallado, se le comunica y pierde una oportunidad
					System.out.println("Has fallado.");
					System.out.println();

					oportunidades--;
				} else {
					// Si ha acertado, se actualiza el mapa de la palabra
					System.out.println("Letra correcta.");
					System.out.println();

					completar = llenar(completar, palabra, letra);
				}

				break;
			case 2:
				// El jugador intenta adivinar la palabra. Si la acierta, gana. Si no, pierde
				// una oportunidad.
				String intento = adivinarPalabra();
				System.out.println();

				if (intento.equals(palabra)) {
					ganar = true;
				} else {
					System.out.println("Has fallado.");
					System.out.println();

					oportunidades--;
				}

				break;
			}

			// Comprobar si el jugador está sin oportunidades para hacerlo perder
			if (oportunidades <= 0) {
				perder = true;
			}
		} while (!ganar && !perder);
		// El juego ha terminado

		// Se comunica al jugador si ha ganado o perdido
		if (perder) {
			System.out.println("Has perdido.");
			System.out.println();
		} else if (ganar) {
			System.out.println("Has ganado.");
			System.out.println();
		}

		// Se muestra la palabra en cualquier caso
		System.out.println("La palabra es: " + palabra);
		System.out.println();
	}

	// Este método devuelve true si un caracter es una vocal mayúscula y false en
	// caso contrario
	static boolean esVocal(char letra) {
		switch (letra) {
		case 'A':
			return true;
		case 'E':
			return true;
		case 'I':
			return true;
		case 'O':
			return true;
		case 'U':
			return true;
		}

		return false;
	}

	// Este método maneja el flujo general de una partida por puntos
	static void puntaje() {
		// Se escoge una palabra y se genera una cadena de líneas a rellenar por el
		// jugador
		String palabra = elegirPalabra();
		String completar = lineas(palabra.length());

		// Esta variable recoge el número de letras que faltan por acertar
		int restantes = palabra.length();

		// Esta variable cuenta el número de fallos cometidos a los largo de la partida
		int fallos = 0;

		// Se pregunta al jugador cuántos puntos desea tener
		// Hace las veces de selector de dificultad
		int puntos = pedirPuntos();
		System.out.println();

		int opcion = 0;

		// Este bucle pide acciones al jugador hasta que ganar o perder sean true
		boolean ganar = false;
		boolean perder = false;

		do {
			// Se muestra la palabra descubierta y los puntos actuales
			mostrarEstado(completar);
			System.out.println("Puntos: " + puntos);
			System.out.println();

			// Se pide el número de puntos a apostar
			int apuesta = pedirApuesta(puntos);

			// Se pide al jugador su acción
			opcion = pedirOpcion();

			// La acción tiene lugar
			switch (opcion) {
			case 1:
				// El jugador introduce una letra y se revela si está en la palabra, o pierde
				// una puntos si no lo está
				char letra = pedirLetra();
				System.out.println();

				// Se obtiene cuantas veces aparece la letra en la palabra
				int aciertos = coincidencias(letra, palabra, completar);

				if (aciertos == 0) {
					// Si ha fallado, se le comunica y pierde los puntos apostados mas el total de
					// fallos hasta el momento
					System.out.println("Has fallado.");
					System.out.println();

					System.out.println("Pierdes los " + apuesta + " puntos apostados.");
					System.out.println();

					System.out.println("Pierdes " + fallos + " puntos extra como penalización.");
					System.out.println();

					puntos -= apuesta + fallos;
					fallos++;
				} else {
					// Si ha acertado, se actualiza el mapa de la palabra y el número de letras
					// restantes, y el jugador gana el número de puntos apostados multiplicado por
					// el número de aciertos
					System.out.println("Letra correcta.");
					System.out.println();

					System.out.println("Ganas " + apuesta * aciertos + " puntos.");
					System.out.println();

					puntos += apuesta * aciertos;

					restantes -= aciertos;

					completar = llenar(completar, palabra, letra);
				}

				break;
			case 2:
				// El jugador intenta adivinar la palabra. Si la acierta, gana. Si no, pierde
				// los puntos apostados mas el total de fallos hasta el momento
				String intento = adivinarPalabra();
				System.out.println();

				if (intento.equals(palabra)) {
					// Si acierta, gana y suma los puntos para la puntuación final
					ganar = true;

					System.out.println("Ganas " + apuesta + " puntos.");
					System.out.println();

					puntos += apuesta;
				} else {
					System.out.println("Has fallado.");
					System.out.println();

					System.out.println("Pierdes los " + apuesta + " puntos apostados.");
					System.out.println();

					System.out.println("Pierdes " + fallos + " puntos extra como penalización.");
					System.out.println();

					puntos -= apuesta + fallos;
					fallos++;
				}

				break;
			}

			// Comprobar si la palabra está resuelta para hacer ganar al jugador
			if (restantes == 0) {
				ganar = true;
			}

			// Comprobar si el jugador está sin oportunidades para hacerlo perder
			if (puntos <= 0) {
				perder = true;
			}
		} while (!ganar && !perder);
		// El juego ha terminado

		// Se comunica al jugador si ha ganado o perdido y con cuántos puntos
		if (perder) {
			System.out.println("Has perdido.");
			System.out.println();
		} else if (ganar) {
			System.out.println("Has ganado con " + puntos + " puntos.");
			System.out.println();
		}

		// Se muestra la palabra en cualquier caso
		System.out.println("La palabra es: " + palabra);
		System.out.println();
	}

	// Este método pide al jugador el número de puntos a apostar
	static int pedirApuesta(int puntos) {
		int apuesta = 0;

		// Se repite hasta que el número de puntos sea menos al total del jugador y se
		// encuentre en el rango de apuestas
		do {
			System.out.print("Puntos a apostar (1, 2 ó 3): ");
			apuesta = scan.nextInt();
			System.out.println();

			if (apuesta > puntos) {
				System.out.println("No tienes suficientes puntos.");
				System.out.println();
			}
		} while (apuesta < 1 || apuesta > 3 || apuesta > puntos);

		return apuesta;
	}

	// Este método pide al jugador el número de puntos con los que va a empezar la
	// partida
	static int pedirPuntos() {
		System.out.print("Puntos iniciales: ");
		return scan.nextInt();
	}

	// Main
	public static void main(String[] args) {
		char seguir = 's';

		// Ejecuta partidas hasta que el jugador especifica lo contrario
		do {
			// Pide al jugador el tipo de partida
			int variante = pedirVariante();
			System.out.println();

			// Ejecuta el tipo de partida especificado
			switch (variante) {
			case 1:
				partida();
				break;
			case 2:
				sinVocales();
				break;
			case 3:
				puntaje();
				break;
			}

			// Pide al jugador que indique si repetir el bucle
			System.out.println("¿Desea volver a jugar? (s/n)");
			seguir = scan.next().toLowerCase().charAt(0);
			System.out.println();
		} while (seguir != 'n');

		scan.close();
	}

}
