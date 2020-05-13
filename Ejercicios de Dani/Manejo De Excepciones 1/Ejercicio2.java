package manejoDeExcepciones;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Crear gatos
		Gato Garfield = new Gato('M');
		Gato Felix = new Gato('M');
		Gato Lisa = new Gato('H');
		
		// Aparear gatos
		try {
			Gato cria = Garfield.apareaCon(Lisa);
		} catch (ExcepcionApareamientoImposible e) {
			System.out.println("Apareamiento imposible. Deben ser de distinto sexo.");
		}
		
		try {
			Gato cria2 = Garfield.apareaCon(Felix);
		} catch (ExcepcionApareamientoImposible e) {
			System.out.println("Apareamiento imposible. Deben ser de distinto sexo.");
		}
	}

}
