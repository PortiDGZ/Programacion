package ejerciciosHerencia;

public class SensorRemolacha extends Sensor {

	// Implementación de método abstracto
	@Override
	public boolean necesitaRiego(int suelo, int aire) {
		return suelo < 15 || (suelo < 25 && aire < 10);
	}
	
	// Implementación de método abstracto
	@Override
	public boolean suficienteRiego(int suelo, int temperatura) {
		return temperatura < 0 || suelo > 30;
	}

}
