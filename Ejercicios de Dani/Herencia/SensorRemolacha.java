package ejerciciosHerencia;

public class SensorRemolacha extends Sensor {

	// Implementaci�n de m�todo abstracto
	@Override
	public boolean necesitaRiego(int suelo, int aire) {
		return suelo < 15 || (suelo < 25 && aire < 10);
	}
	
	// Implementaci�n de m�todo abstracto
	@Override
	public boolean suficienteRiego(int suelo, int temperatura) {
		return temperatura < 0 || suelo > 30;
	}

}
