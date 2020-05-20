package EjerciciosAbstraccion;

import java.util.Scanner;

public class Circunferencia extends ObjetoGeometrico {

	// Atributos
	private double radio;

	// Constructores
	public Circunferencia(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}

	public Circunferencia() {
		super();
	}

	// Area
	@Override
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}

	// Perímetro
	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}

	// Cambiar tamaño
	@Override
	public void redimensiona(float porcentaje) {
		radio *= porcentaje / 100;
	}

	// Clase del objeto
	public String getTipo() {
		return "Circunferencia";
	}

	// Introducir radio
	public void leePorTeclado() {
		super.leePorTeclado();
		boolean bucle = true;

		do {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Introduce radio: ");
				radio = scan.nextDouble();
				bucle = false;
			} catch (Exception e) {
				System.out.println("No se ha introducido un double.");
			}
		} while (bucle);
	}
}
