package ejerciciosHerencia;

public class Impresora extends ProductoElectronico {
	
	//Atributos
	private double capacidad = 25;

	// Constructores
	public Impresora(double precio, double consumo, int cantidad, double capacidad) {
		super(precio, consumo, cantidad);
		this.capacidad = capacidad;
	}

	// ToString
	@Override
	public String toString() {
		return "Impresora [capacidad=" + capacidad + ", precio=" + precio + "€ , codigo=" + codigo + ", consumo="
				+ consumo + ", cantidad=" + cantidad + "]";
	}

}
