package EjerciciosAbstraccion;

public class Circunferencia extends ObjetoGeometrico {
	
	// Atributos
	double radio;

	// Constructores
	public Circunferencia(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
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
}
