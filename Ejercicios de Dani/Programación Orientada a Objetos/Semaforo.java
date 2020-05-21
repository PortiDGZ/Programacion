package ejerciciosTema9;

public class Semaforo {

	// Atributos
	private String colorSemaforo = "rojo";

	// Constructores
	public Semaforo() {
	}

	public Semaforo(String color) {
		colorSemaforo = color;
	}

	// Getters y setters
	public String getColor() {
		return colorSemaforo;
	}

	public void setColor(String colorSemaforo) {
		this.colorSemaforo = colorSemaforo;
	}

	// PuedoPasar: false si colorSemaforo es "rojo"
	public boolean puedoPasar() {
		if (colorSemaforo.equals("rojo")) {
			return false;
		}

		return true;
	}

	// Override
	@Override
	public String toString() {
		return "Semaforo [colorSemaforo=" + colorSemaforo + "]";
	}

}
