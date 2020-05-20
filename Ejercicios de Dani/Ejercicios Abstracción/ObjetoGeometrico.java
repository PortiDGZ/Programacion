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

	// Per�metro
	public abstract double perimetro();
	
	// Cambiar posici�n
	public void desplaza(int despX, int despY) {
		x += despX;
		y += despY;
	}
	
	// Cambiar tama�o
	public abstract void redimensiona(float porcentaje);

}
