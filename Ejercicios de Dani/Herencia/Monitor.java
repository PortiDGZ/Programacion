package ejerciciosHerencia;

public class Monitor extends ProductoElectronico {
	
	// Atributos
	private double pulgadas;

	// Constructores
	public Monitor(double precio, double consumo, int cantidad, double pulgadas) {
		super(precio, consumo, cantidad);
		this.pulgadas = pulgadas;
	}

	// ToString
	@Override
	public String toString() {
		return "Monitor [pulgadas=" + pulgadas + ", precio=" + precio + " €, codigo=" + codigo + ", consumo=" + consumo
				+ ", cantidad=" + cantidad + "]";
	}
	

}
