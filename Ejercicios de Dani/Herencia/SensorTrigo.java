package ejerciciosHerencia;

public class SensorTrigo extends Sensor {
	
	// Implementación de método abstracto
	@Override
	public boolean necesitaRiego(int suelo, int aire) {
		return suelo < 10 || (suelo < 20 && aire < 5);
	}

	// Implementación de método abstracto
	@Override
	public boolean suficienteRiego(int suelo, int temperatura) {
		return temperatura < 5 || suelo > 35;
	}

}
