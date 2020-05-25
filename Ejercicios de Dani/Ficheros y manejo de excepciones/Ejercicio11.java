package ficherosYManejoDeExcepciones;

import java.util.*;

public class Ejercicio11 {
	
	static ArrayList<String> nombre = new ArrayList<String>();
	static ArrayList<Integer> edad = new ArrayList<Integer>();
	static Scanner scan = new Scanner(System.in);
	private static boolean pedirPersona = true;

	public static void main(String[] args) {
		do {
			try {
				pedirPersona();
			} catch (MasDe5Exception e) {
				System.out.println("Se ha alcanzado el límite de personas.");
				pedirPersona = false;
			}
		} while (pedirPersona);
		
		System.out.println();
		
		try {
			System.out.println("La edad media es " + edadMedia() + ".");
		} catch (Exception e) {
			System.out.println("No se ha introducido ninguna persona.");
		}
	}

	private static int edadMedia() throws Exception {
		int total = 0;
		
		for(Integer elem : edad) {
			total += elem;
		}
		
		return total / edad.size();
	}

	private static void pedirPersona() throws MasDe5Exception {
		if(nombre.size() > 4) {
			throw new MasDe5Exception();
		}
		
		System.out.println("Persona " + (nombre.size() + 1));
		System.out.println();
		
		System.out.print("Nombre: ");
		nombre.add(scan.nextLine());
		System.out.println();
		
		boolean bucle = true;
		int n = 0;
		
		do {
			try {
				System.out.print("Edad (0 para terminar): ");
				n = scan.nextInt();
				edad.add(n);
				bucle = false;
			} catch (InputMismatchException e) {
				System.out.println();
				System.out.println("No ha introducido un número.");
			}
			scan.nextLine();
			System.out.println();
		} while (bucle);
		
		if(n == 0) {
			nombre.remove(nombre.size() - 1);
			edad.remove(edad.size() - 1);
			pedirPersona  = false;
		}
	}

}
