package EjerciciosAbstraccion;

import java.util.Scanner;

public class Rectangulo extends ObjetoGeometrico {

	// Atributos
	protected double base;
	protected double altura;

	// Constructores
	public Rectangulo(double x, double y, double base, double altura) {
		super(x, y);
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo() {
		super();
	}

	// Area
	@Override
	public double area() {
		return base * altura;
	}

	// Perímetro
	@Override
	public double perimetro() {
		return base * 2 + altura * 2;
	}

	// Cambiar tamaño
	@Override
	public void redimensiona(float porcentaje) {
		base *= porcentaje / 100;
		altura *= porcentaje / 100;
	}

	// Clase del objeto
	public String getTipo() {
		return "Rectángulo";
	}

	// Introducir base y altura
	public void leePorTeclado() {
		super.leePorTeclado();
		boolean bucle = true;

		do {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Introduce base: ");
				scan.nextDouble();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido un double.");
			}
		} while (bucle);

		bucle = true;

		do {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Introduce altura: ");
				altura = scan.nextDouble();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido un double.");
			}
		} while (bucle);
	}

}
