package ejerciciosHerencia;

public class Television extends Electrodomestico {
	
	// Atributos
	private double resolucion = 20;
	private boolean tdt;
	
	// Constructores
	public Television() {
		super();
	}
	
	public Television(double precio, double peso) {
		super(precio, peso);
	}
	
	public Television(double precio, String color, char consumo, double peso, double resolucion, boolean tdt) {
		super(precio, color, consumo, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	
	// Getters
	public double getResolucion() {
		return resolucion;
	}

	public boolean hasTdt() {
		return tdt;
	}
	
	// Devuelve el precio final sumando un añadido por la resolución y el TDT
	@Override
	public double precioFinal() {
		double precio = super.precioFinal();
		
		if (resolucion > 40) {
			precio *= 1.3;
		}
			
		if (tdt) {
			precio += 50;
		}
		
		return precio;
	}

}
