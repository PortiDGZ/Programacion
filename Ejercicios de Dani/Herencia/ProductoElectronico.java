package ejerciciosHerencia;

public class ProductoElectronico {
	
	// Atributos
	protected double precio;
	protected int codigo;
	protected double consumo;
	protected int cantidad = 1;
	
	// Atributos estáticos
	private static int contador;
	
	// Constructores
	public ProductoElectronico(double precio, double consumo, int cantidad) {
		super();
		this.precio = precio;
		this.consumo = consumo;
		this.cantidad = cantidad;
		codigo = contador++;
	}
	
	// Precio total
	public double precioTotal() {
		return cantidad * precio;
	}

	// ToString
	@Override
	public String toString() {
		return "ProductoElectronico [precio=" + precio + " €, codigo=" + codigo + ", consumo=" + consumo + ", cantidad="
				+ cantidad + "]";
	}

}
