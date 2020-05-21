package ejerciciosHerencia;

import java.util.*;

public class SensorMain {
	
	private final static int NUMERO = 10;
	private static Random rand = new Random();
	private static Actuador[] actuadores = new Actuador[NUMERO];
	private static Sensor[] sensores = new Sensor[NUMERO];

	public static void main(String[] args) {
		llenarSensores();
		llenarActuadores();
		
		ciclarControl(sensores);
		
	}

	private static void ciclarControl(Sensor[] sensores) {
		while (true) {
			controlaSensores(sensores);
			
			try {
				Thread.sleep(120000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static void controlaSensores(Sensor[] sensores) {
		for (int i = 0; i <= NUMERO - 1; i++) {
			controla(i);
		}
	}

	private static void controla(int i) {
		int humedadAire = leerHumedadAire(i);
		int humedadSuelo = leerHumedadSuelo(i);
		int temperatura = leerTemperatura(i);
		
		if(sensores[i].necesitaRiego(humedadSuelo, humedadAire) && !actuadores[i].isAbierto()) {
			abreRiego(i);
		} else if (sensores[i].suficienteRiego(humedadSuelo, temperatura) && actuadores[i].isAbierto()) {
			cierraRiego(i);
		}
	}

	private static void cierraRiego(int i) {
		actuadores[i].cierraRiego();
	}

	private static void abreRiego(int i) {
		actuadores[i].abreRiego();
	}

	private static int leerTemperatura(int i) {
		int temperatura = sensores[i].getTemperatura();
		return temperatura;
	}

	private static int leerHumedadSuelo(int i) {
		int humedadSuelo = sensores[i].getHumedadSuelo();
		return humedadSuelo;
	}

	private static int leerHumedadAire(int i) {
		int humedadAire = sensores[i].getHumedadAire();
		return humedadAire;
	}

	private static void llenarSensores() {
		for (int i = 0; i <= NUMERO - 1; i++) {
			sensores[i] = TrigoORemolacha();
		}
	}

	private static Sensor TrigoORemolacha() {
		if (rand.nextInt(1) == 0) {
			return new SensorTrigo();
		}
		
		return new SensorRemolacha();
	}

	private static void llenarActuadores() {
		for (int i = 0; i <= NUMERO - 1; i++) {
			actuadores[i] = new Actuador();
		}
	}

}
