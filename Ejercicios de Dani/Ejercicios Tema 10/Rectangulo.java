package Ejercicios;

public class Rectangulo {
	
	// Atributos
	private double base;
	private double altura;
	
	// Constructores
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	// Area
	public double area() {
		return base * altura;
	}
	
	// Perimetro
	public double perimetro() {
		return base * 2 + altura * 2;
	}
	
	// Muestra visualmente el rectángulo
	public void visualizar() {
		for(int i = 1; i <= altura; i++) {
			for(int j = 1; j <= base; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
}
