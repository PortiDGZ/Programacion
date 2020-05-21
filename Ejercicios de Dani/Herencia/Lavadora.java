package ejerciciosHerencia;

public class Lavadora extends Electrodomestico {
	
	// Constantes
	private final static int CARGA = 5;
	
	// Atributos
	private double carga = CARGA;

	// Constructores
	public Lavadora() {
		super();
	}

	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}

	public Lavadora(double precio, String color, char consumo, double peso, double carga) {
		super(precio, color, consumo, peso);
		this.carga = carga;
	}

	// Getters
	public double getCarga() {
		return carga;
	}

	// Devuelve el precio final sumando un añadido por la carga
	@Override
	public double precioFinal() {
		int precioExtra = 0;
		
		if (carga > 30) {
			precioExtra = 50;
		}
		
		return super.precioFinal() + precioExtra;
	}

}
