package ficherosYManejoDeExcepciones;

import java.util.*;

public class Ejercicio12 {
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Equipo> equipos = new ArrayList<Equipo>();

	public static void main(String[] args) {
		int opcion = 0;
		
		do {
			opciones();
			opcion = pedirOpcion("Elige una opción: ", 0, 5);
			
			switch(opcion) {
			case 1:
				altaEquipo();
				break;
			case 2:
				modificarEquipos();
				break;
			case 3:
				nuevoJugador();
				break;
			case 4:
				verEquipos();
				break;
			case 5:
				listarJugadores();
				break;
			}
		} while (opcion  != 0);
	}
	
	private static void listarJugadores() {
		if (equipos.size() > 0) {
			verEquipos();
			int equipo = pedirOpcion("Elije un equipo: ", 1, equipos.size()) - 1;
			equipos.get(equipo).verJugadores();
		}
	}

	private static void nuevoJugador() {
		if (equipos.size() > 0) {
			verEquipos();
			int equipo = pedirOpcion("Elije un equipo: ", 1, equipos.size()) - 1;
			equipos.get(equipo).añadir(new Jugador());
		}
	}

	private static void modificarEquipos() {
		if (equipos.size() > 0) {
			verEquipos();
			int equipo = pedirOpcion("Elije un equipo: ", 1, equipos.size()) - 1;
			verAtributosEquipo();
			int atributo = pedirOpcion("Elije una opción: ", 1, 7);
			switch (atributo) {
			case 1:
				equipos.get(equipo).modificarCif();
				break;
			case 2:
				equipos.get(equipo).modificarRazonSocial();
				break;
			case 3:
				equipos.get(equipo).modificarCiudad();
				break;
			case 4:
				equipos.get(equipo).modificarPais();
				break;
			case 5:
				equipos.get(equipo).modificarTemporadas();
				break;
			case 6:
				equipos.get(equipo).modificarPosicion();
				break;
			case 7:
				equipos.get(equipo).modificarGanador();
				break;
			}
		}
	}

	private static void verAtributosEquipo() {
		System.out.println("1 - CIF.");
		System.out.println("2 - Razón social.");
		System.out.println("3 - Ciduad.");
		System.out.println("4 - País.");
		System.out.println("5 - Temporadas en la categoría.");
		System.out.println("6 - Posición en la última temporada.");
		System.out.println("7 - Ganador del campeonato en alguna ocasión.");
	}

	private static void verEquipos() {
		for(int i = 0; i < equipos.size(); i++) {
			System.out.println("Equipo " + (i + 1));
			
			System.out.println(equipos.get(i));
			System.out.println();
		}
	}

	private static void altaEquipo() {
		if(equipos.size() < 20) {
			equipos.add(new Equipo());
		} else {
			System.out.println("Se ha alcanzado el máximo de equipos.");
			System.out.println();
		}
	}

	private static int pedirOpcion(String string, int i, int j) {
		int n = 0;
		boolean bucle = true;
		
		do {
			try {
				System.out.print(string);
				n = scan.nextInt();
				bucle = false;
			} catch (InputMismatchException e) {
				System.out.println();
				System.out.println("No se ha introducido un número.");
				scan.nextLine();
			} 
		} while (n > j || n < i || bucle);
		scan.nextLine();
		System.out.println();
		
		return n;
	}

	static void opciones() {
		System.out.println("1 - Alta de equipo.");
		System.out.println("2 - Modificación de datos de equipo.");
		System.out.println("3 - Alta de jugador.");
		System.out.println("4 - Listado de equipos.");
		System.out.println("5 - Listado de jugadores de un equipo.");
		System.out.println("0 - Salir.");
	}

}
