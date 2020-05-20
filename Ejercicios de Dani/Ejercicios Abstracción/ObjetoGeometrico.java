package EjerciciosAbstraccion;

public abstract class ObjetoGeometrico {
	
	// Atributos
	private double x;
	private double y;
	
	// Constructores
	public ObjetoGeometrico(double x, double y) {
		super();
		this.x = x;
		this.y = y;
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

}
