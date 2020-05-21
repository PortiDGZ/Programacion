package ejerciciosTema9;

public class Coche {
	
	// Atributos
	private String modelo = "";
	private String fabricante = "";
	private float precio;
	public byte iva;
	
	// Getters y setters
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public byte getIva() {
		return iva;
	}
	public void setIva(byte iva) {
		this.iva = iva;
	}
	
	// Constructores
	
	public Coche() {
		super();
	}
	public Coche(String modelo, String fabricante, float precio, byte iva) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.precio = precio;
		this.iva = iva;
	}
	public Coche(String modelo, String fabricante, float precio) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.precio = precio;
	}
	
	// Override toString
	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", fabricante=" + fabricante + ", precio=" + precio + ", iva=" + iva
				+ ", precioReal()=" + precioReal() + "]";
	}
	
	// Override equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		if (iva != other.iva)
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
			return false;
		return true;
	}
	
	// Precio con IVA
	private float precioReal() {
		return precio * (1 + (float) iva / 100);
	}
	
	// Muestra el modelo de coche y su precio con IVA
	public void consulta() {
		System.out.print("Coche [modelo = " + modelo + ", precio con IVA = " + precioReal() + "]");
	}
	
	// Subir o bajar el precio sin IVA del coche tanto como se indique
	public void actualizarPrecio(byte porcentaje) {
		precio *= porcentaje + 100;
		precio /= 100;
	}

}
