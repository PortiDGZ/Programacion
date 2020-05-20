package EjerciciosAbstraccion;

public class Rectangulo extends ObjetoGeometrico {
	
	// Atributos
	double base;
	double altura;

	// Constructores
	public Rectangulo(double x, double y, double base, double altura) {
		super(x, y);
		this.base = base;
		this.altura = altura;
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

}
