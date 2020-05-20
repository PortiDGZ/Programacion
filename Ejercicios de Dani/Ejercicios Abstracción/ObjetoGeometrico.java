package EjerciciosAbstraccion;

import java.util.Scanner;

public abstract class ObjetoGeometrico {
	
	// Atributos
	protected double x;
	protected double y;
	
	
	// Constructores
	public ObjetoGeometrico(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public ObjetoGeometrico() {
		super();
	}
	
	// Area
	public abstract double area();

	// Perímetro
	public abstract double perimetro();
	
	// Cambiar posición
	public void desplaza(int despX, int despY) {
		x += despX;
		y += despY;
	}
	
	// Cambiar tamaño
	public abstract void redimensiona(float porcentaje);
	
	// Clase del objeto
	public abstract String getTipo();
	
	// Introducir x e y
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
	}

}
