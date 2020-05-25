package ficherosYManejoDeExcepciones;

import java.util.*;

public class Equipo extends Empresa {

	// Atributos
	private int temporadas;
	private int posicion;
	private boolean ganador;
	ArrayList<Jugador> plantilla = new ArrayList<Jugador>();

	// Constructor
	public Equipo() {
		super();
		
		modificarTemporadas();

		modificarPosicion();

		modificarGanador();
	}
	
	// Obtener atributos desde teclado
	public void modificarTemporadas() {
		boolean bucle = true;

		do {
			try {
				System.out.print("Temporadas en la categor�a: ");
				temporadas = Ejercicio12.scan.nextInt();
				bucle = false;
			} catch (Exception e) {
				System.out.println();
				System.out.println("No se ha introducido un n�mero.");
			}
			Ejercicio12.scan.nextLine();
			System.out.println();
		} while (bucle);
	}

	public void modificarPosicion() {
		boolean bucle = true;

		do {
			try {
				System.out.print("Posici�n en la �ltima temporada: ");
				posicion = Ejercicio12.scan.nextInt();
				bucle = false;
			} catch (Exception e) {
				System.out.println();
				System.out.println("No se ha introducido un n�mero.");
			}
			Ejercicio12.scan.nextLine();
			System.out.println();
		} while (bucle);
	}

	public void modificarGanador() {
		boolean bucle = true;

		do {
			System.out.print("�Ganador del campeonato en alguna ocasi�n? (S/N): ");
			char respuesta = Ejercicio12.scan.nextLine().toUpperCase().charAt(0);

			if (respuesta == 'S') {
				ganador = true;
				bucle = false;
			} else if (respuesta == 'N') {
				ganador = false;
				bucle = false;
			} else {
				System.out.println();
				System.out.println("No se ha introducido una respuesta adecuada.");
			}
			System.out.println();
		} while (bucle);
	}

	// Getters
	public int getTemporadas() {
		return temporadas;
	}

	public int getPosicion() {
		return posicion;
	}

	public boolean isGanador() {
		return ganador;
	}

	public ArrayList<Jugador> getPlantilla() {
		return plantilla;
	}

	// Setters
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public void setGanador(boolean ganador) {
		this.ganador = ganador;
	}

	public void setPlantilla(ArrayList<Jugador> plantilla) {
		this.plantilla = plantilla;
	}

	// ToString
	public String toString() {
		return super.toString() + "\nTemporadas en la categor�a: " + temporadas + "\nPosici�n en la �ltima temporada: " + posicion
				+ (ganador ? "\nGanador de alg�n campeonato." : "\nNunca ganador de campeonato.") + "\nJugadores: " + plantilla.size();
	}

	// A�adir un jugador a la plantilla
	public void a�adir(Jugador jugador) {
		plantilla.add(jugador);
	}

	// Mostrar todos los jugadores ordenados por dorsal
	public void verJugadores() {
		Collections.sort(plantilla);
		
		for(Jugador elem : plantilla) {
			System.out.println(elem);
			System.out.println();
		}
	}

}
