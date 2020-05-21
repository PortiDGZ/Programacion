package ejerciciosHerencia;

public class Electrodomestico {
	
	// Constantes
	private static final int PRECIO = 1000;
	private static final String COLOR = "blanco";
	private static final char CONSUMO = 'F';
	private static final int PESO = 5;
	
	// Atributos
	protected double precio = PRECIO;
	protected String color = COLOR;
	protected char consumo = CONSUMO;
	protected double peso = PESO;
	
	// Constructores
	public Electrodomestico() {
	}

	public Electrodomestico(double precio, double peso) {
		super();
		this.precio = precio;
		this.peso = peso;
	}

	public Electrodomestico(double precio, String color, char consumo, double peso) {
		super();
		this.precio = precio;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumo);
		this.peso = peso;
	}

	
	// Getters
	public double getPrecio() {
		return precio;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}

	public double getPeso() {
		return peso;
	}
	
	// Comprueba que el consumo es una letra entre A y F
	private void comprobarConsumoEnergetico(char letra) {
		letra = Character.toUpperCase(letra);
		if (letra >= 65 && letra <= 70) {
			consumo = letra;
		}
	}
	
	// Comprueba que el color es blanco, negro, rojo, azul o gris
	private void comprobarColor(String color) {
		color = color.toLowerCase();
		switch(color) {
		case "blanco":
		case "negro":
		case "rojo":
		case "azul":
		case "gris":
			this.color = color;
			break;
		}
	}
	
	// Devuelve el precio en función del consumo
	public double precioFinal() {
		int precioExtra = 0;
		switch (consumo) {
		case 'A':
			precioExtra = 100;
			break;
		case 'B':
			precioExtra = 80;
			break;
		case 'C':
			precioExtra = 60;
			break;
		case 'D':
			precioExtra = 50;
			break;
		case 'E':
			precioExtra = 30;
			break;
		case 'F':
			precioExtra = 10;
			break;
		}
		
		if (peso >= 0 && peso < 20) {
			precioExtra += 10;
		} else if (peso >= 20 && peso < 50) {
			precioExtra += 50;
		} else if (peso >= 50 && peso < 80) {
			precioExtra += 80;
		} else {
			precioExtra += 100;
		}
		
		return precio + precioExtra;
	}

}
