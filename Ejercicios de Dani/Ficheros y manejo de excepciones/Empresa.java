package ficherosYManejoDeExcepciones;

public class Empresa {

	// Atributos
	private String cif = "";
	private String razonSocial = "";
	private String ciudad = "";
	private String pais = "";

	// Constructor
	public Empresa() {
		modificarCif();

		modificarRazonSocial();

		modificarCiudad();

		modificarPais();
	}

	// Obtener atributos desde teclado
	public void modificarCif() {
		System.out.print("CIF: ");
		cif = Ejercicio12.scan.nextLine();
		System.out.println();
	}

	public void modificarRazonSocial() {
		System.out.print("Razón social: ");
		razonSocial = Ejercicio12.scan.nextLine();
		System.out.println();
	}

	public void modificarCiudad() {
		System.out.print("Ciudad: ");
		ciudad = Ejercicio12.scan.nextLine();
		System.out.println();
	}

	public void modificarPais() {
		System.out.print("País: ");
		pais = Ejercicio12.scan.nextLine();
		System.out.println();
	}

	// Getters
	public String getCif() {
		return cif;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getPais() {
		return pais;
	}

	// Setters
	public void setCif(String cif) {
		this.cif = cif;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public void setCiudad(String ciduad) {
		this.ciudad = ciduad;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	// ToString
	public String toString() {
		return "CIF: " + cif + "\nRazón social: " + razonSocial + "\nCiudad: " + ciudad + "\nPais: " + pais;
	}
}
