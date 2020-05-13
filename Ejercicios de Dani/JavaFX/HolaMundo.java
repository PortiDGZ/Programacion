package application;

import javafx.event.*;

public class HolaMundo implements EventHandler<ActionEvent> {

	// Ejercicio 16
	
	@Override
	public void handle(ActionEvent evento) {
		System.out.println("¡Hola mundo!");
	}

}
