package core;

import java.io.Serializable;

public class Dinero implements Serializable {

	// Esta clase encapsula la cantidad de dinero como céntimos y realiza conversión
	// automática de y a euros

	// Atributos
	private int centimos;

	// Constructor EN CÉNTIMOS
	public Dinero(int centimos) {
		this.centimos = Math.max(0, centimos);
	}
	
	public Dinero(double euros) {
		centimos =  Math.max(0, (int) (euros * 100));
	}

	// Getters
	public int getCentimos() {
		return centimos;
	}

	public double getEuros() {
		return (double) centimos / 100;
	}
	
	// Añadir o restar dinero
	public void añadirCentimos(int centimos) {
		this.centimos += centimos;
	}
	
	public void añadirEuros(double euros) {
		centimos += (int) (euros * 100);
	}
	
	public void restarCentimos(int centimos) {
		this.centimos -= centimos;
		this.centimos = Math.max(0, this.centimos);
	}
	
	public void restarEuros(double euros) {
		centimos -= (int) (euros * 100);
		centimos = Math.max(0, centimos);
	}
	
	public void restar(Dinero precio) {
		centimos -= precio.centimos;
		centimos = Math.max(0, centimos);
	}

	// ToString
	public String toString() {
		return Double.toString(getEuros()) + " €";
	}

	// CompareTo
	public int compareTo(Dinero precio) {
		return centimos - precio.centimos;
	}

}
