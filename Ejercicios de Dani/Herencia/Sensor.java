package ejerciciosHerencia;

import java.util.*;

public abstract class Sensor {
	
	// Atributos
	private Random rand = new Random(); // Simula valores de humedad y temperatura

	// Getters simulados
	public int getHumedadSuelo() {
		return rand.nextInt(100);
	}

	public int getHumedadAire() {
		return rand.nextInt(100);
	}

	public int getTemperatura() {
		return rand.nextInt(60) + 20;
	}
	
	// Comprueba si se debe abrir el riego
	public abstract boolean necesitaRiego(int suelo, int aire);
	
	// Comprueba si se debe cerrar el riego
	public abstract boolean suficienteRiego(int suelo, int temperatura);

}
