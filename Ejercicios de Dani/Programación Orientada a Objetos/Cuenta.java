package ejerciciosTema9;

public class Cuenta {

	// Atributos
	private String titular = "";
	private double cantidad;

	// Constructores
	public Cuenta(String titular) {
		this.titular = titular;
	}

	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	// Getters
	public String getTitular() {
		return titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	// Setters
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	// Ingresar: se aumenta cantidad si el parámetro es positivo
	public void ingresar(double ingreso) {
		if (ingreso > 0) {
			cantidad += ingreso;
		}
	}

	// Retirar: se disminuye cantidad (mínimo 0)
	public void retirar(double retiro) {
		cantidad -= retiro;
		cantidad = Math.max(cantidad, 0);
	}

}
