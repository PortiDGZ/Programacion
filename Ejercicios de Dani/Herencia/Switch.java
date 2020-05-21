package ejerciciosHerencia;

public class Switch extends ProductoElectronico {
	
	// Atributos
	private String edicion = "";
	private String colorJoycon = "";
	
	// Constructores
	public Switch(double precio, double consumo, int cantidad, String edicion, String colorJoycon) {
		super(precio, consumo, cantidad);
		this.edicion = edicion;
		this.colorJoycon = colorJoycon;
	}
	
	// ToString
	@Override
	public String toString() {
		return "Switch [edicion=" + edicion + ", colorJoycon=" + colorJoycon + ", precio=" + precio + "€ , codigo="
				+ codigo + ", consumo=" + consumo + ", cantidad=" + cantidad + "]";
	}

}
