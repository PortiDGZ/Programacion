package EjerciciosAbstraccion;

import java.util.Scanner;

public class Cuadrado extends Rectangulo {

	// Constructor
	public Cuadrado(double x, double y, double lado) {
		super(x, y, lado, lado);
	}

	public Cuadrado() {
		super();
	}

	// Clase del objeto
	public String getTipo() {
		return "Cuadrado";
	}

	// Introducir lado
	public void leePorTeclado() {
		boolean bucle = true;
		
		do {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Introduce x: ");
				x = scan.nextDouble();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido un double.");
			} 
		} while (bucle);
		
		bucle = true;
		
		do {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Introduce y: ");
				y = scan.nextDouble();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido un double.");
			} 
		} while (bucle);
		
		bucle = true;

		do {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Introduce lado: ");
				base = scan.nextDouble();
				altura = base;
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido un double.");
			}
		} while (bucle);
	}

}
