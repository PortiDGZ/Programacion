package ejerciciosHerencia;

public class Actuador {
	
	// Atributos estáticos
	private static int idCount;
	
	// Atributos
	private int id;
	private boolean abierto;
	
	// Constructores
	public Actuador() {
		super();
		this.id = idCount++;
	}
	
	// Getters
	public boolean isAbierto() {
		return abierto;
	}
	
	// Abrir riego
	public void abreRiego() {
		abierto = true;
		System.out.println("Riego " + id + " abierto.");
	}
	
	// Cerrar riego
	public void cierraRiego() {
		abierto = false;
		System.out.println("Riego " + id + " cerrado.");
	}
		
}
