package arraysUnidimensionales;

import java.util.Scanner;

public class Arrays10 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		char continuar = 's';
		
		System.out.print("Número de mesas: ");
		int[] mesas = new int[Ejercicio3.leerInt()];
		rellenarRandom(mesas);
		System.out.println();
		printMesas(mesas);

		do {
			int personas = preguntarPersonas();
			int mesa = elegirMesa(personas, mesas);
			colocar(personas, mesa, mesas);
			printMesas(mesas);
			
			System.out.print("�Desea continuar? (s/n) ");
			continuar = scan.next().charAt(0);
			System.out.println();
		} while (continuar != 'n');

		scan.close();
	}

	public static void printMesas(int[] mesas) {
		System.out.println("Estado de las mesas:");

		for (int elem : mesas) {
			System.out.print(elem + "/4 ");
		}
		
		System.out.println();
		System.out.println();
	}

	public static void rellenarRandom(int[] tabla) {
		for (int i = 0; i <= tabla.length - 1; i++) {
			tabla[i] = (int) (Math.random() * 5);
		}
	}

	public static int preguntarPersonas() {
		boolean proceder;
		int personas = -1;
		
		do {
			System.out.print("N�mero de personas: ");
			personas = Arrays3.leerInt();
			System.out.println();
			
			proceder = personas <= 4 && personas >= 1;

			if (!proceder) {
				if (personas > 4) {
					System.out.println("Lo siento, no admitimos grupos de " + personas + ", haga grupos de 4 personas como m�ximo e intente de nuevo.");
					System.out.println();
				} else {
					System.out.println("El n�mero de personas especificado no es v�lido.");
					System.out.println();
				}
			} 
		} while (!proceder);
		
		return personas;
	}

	public static int elegirMesa(int personas, int[] mesas) {
		int mesa = mesaVacia(mesas);
		
		if (mesa == -1) {
			mesa = mesaAdecuada(personas, mesas);
		}
		
		return mesa;
	}
	
	public static int mesaVacia(int[] mesas) {
		for (int i = 0; i <= mesas.length - 1; i++) {
			if (mesas[i] == 0) {
				return i;
			}
		}
		
		return -1;
	}

	public static int mesaAdecuada(int personas, int[] mesas) {
		for (int i = 0; i <= mesas.length - 1; i++) {
			if (mesas[i] + personas <= 4) {
				return i;
			}
		}
		
		return -1;
	}

	public static void colocar(int personas, int mesa, int[] mesas) {
		if (mesa == -1) {
			System.out.println("Lo siento, no tenemos mesas disponibles en este momento.");
			System.out.println();
		} else {
			System.out.println("Mesa " + (mesa + 1) + ". Disfruten de su estancia.");
			System.out.println();
			mesas[mesa] += personas;
		}
	}
}
