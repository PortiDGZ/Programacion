package ficherosYManejoDeExcepciones;

import java.util.Scanner;

public class Ejercicio10 {
	
	static String nombre;
	static int edad;
	static double sueldo;
	static String nombre2;
	static int edad2;
	static double sueldo2;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		primerEmpleado();
		
		segundoEmpleado();
		
		if(edad < edad2) {
			mostrar1();
		} else if (edad2 > edad) {
			mostrar2();
		} else {
			mostrar1();
			System.out.println();
			mostrar2();
		}
	}

	private static void mostrar2() {
		System.out.println(nombre2);
		System.out.println(edad2 + " años");
		System.out.println(sueldo2+ " €");
	}

	private static void mostrar1() {
		System.out.println(nombre);
		System.out.println(edad + " años");
		System.out.println(sueldo + " €");
	}

	private static void segundoEmpleado() {
		System.out.print("Nombre del segundo empleado: ");
		nombre2 = scan.nextLine();
		System.out.println();
		
		boolean bucle = true;
		
		do {
			try {
				System.out.print("Edad del segundo empleado: ");
				edad2 = scan.nextInt();
				bucle = false;
			} catch (Exception x) {
				System.out.println();
				System.out.println("No se ha introducido un integer.");
			}
			scan.nextLine();
			System.out.println();
		} while (bucle);
		
		bucle = true;
		
		do {
			try {
				System.out.print("Sueldo del segundo empleado: ");
				sueldo2 = scan.nextDouble();
				bucle = false;
			} catch (Exception x) {
				System.out.println();
				System.out.println("No se ha introducido un double.");
			}
			scan.nextLine();
			System.out.println();
		} while (bucle);
	}

	private static void primerEmpleado() {
		System.out.print("Nombre del primer empleado: ");
		nombre = scan.nextLine();
		System.out.println();
		
		boolean bucle = true;
		
		do {
			try {
				System.out.print("Edad del primer empleado: ");
				edad = scan.nextInt();
				bucle = false;
			} catch (Exception e) {
				System.out.println();
				System.out.println("No se ha introducido un integer.");
			}
			scan.nextLine();
			System.out.println();
		} while (bucle);
		
		bucle = true;
		
		do {
			try {
				System.out.print("Sueldo del primer empleado: ");
				sueldo = scan.nextDouble();
				bucle = false;
			} catch (Exception e) {
				System.out.println();
				System.out.println("No se ha introducido un double.");
			}
			scan.nextLine();
			System.out.println();
		} while (bucle);
	}

}
