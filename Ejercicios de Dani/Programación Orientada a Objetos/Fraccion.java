package ejerciciosTema9;

public class Fraccion {
	
	// Atributos
	
	private double numerador;
	private double denominador = 1;
	
	// Constructores
	
	public Fraccion(double numerador, double denominador) {
		super();
		this.numerador = numerador;
		
		if (denominador != 0) {
			this.denominador = denominador;
		}
	}
	
	// Getters y setters

	public double getNumerador() {
		return numerador;
	}

	public void setNumerador(double numerador) {
		this.numerador = numerador;
	}

	public double getDenominador() {
		return denominador;
	}

	public void setDenominador(double denominador) {
		this.denominador = denominador;
	}
	
	// Valor: numerador entre denominador
	
	public double valor() {
		return numerador / denominador;
	}
	
	// Invierte: intercambia el numerador y el denominador
	
	public void invierte() {
		double aux = numerador;
		numerador = denominador;
		denominador = aux;
	}
	
	// Multiplica: producto con otra fracción
	
	public void multiplica(Fraccion factor) {
		numerador *= factor.getNumerador();
		denominador *= factor.getDenominador();
	}
	
	// Divide: cociente con otra fracción
	
	public void divide(Fraccion divisor) {
		denominador *= divisor.getNumerador();
		numerador *= divisor.getDenominador();
	}
	
	// Suma: total con otra fracción
	
	public void suma(Fraccion sumado) {
		numerador = numerador * sumado.getDenominador() + sumado.getNumerador() * denominador;
		denominador *= sumado.getDenominador();
	}
	
	// Resta: diferencia con otra fracción
	
	public void resta(Fraccion sustraendo) {
		numerador = numerador * sustraendo.getDenominador() - sustraendo.getNumerador() * denominador;
		denominador *= sustraendo.getDenominador();
	}
	
	// Override toString
	
	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + ", valor()=" + valor() + "]";
	}

}
