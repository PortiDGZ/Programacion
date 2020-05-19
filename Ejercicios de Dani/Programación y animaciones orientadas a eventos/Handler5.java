package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;

public class Handler5 implements EventHandler<ActionEvent> {
	
	// Objetos de la ventana
	private Circle pelota;
	private Scene escena;
	
	// Velocidad de movimiento
	private int velocidadX = 2;
	private int velocidadY = 1;

	// Constructor
	public Handler5(Circle pelota, Scene escena) {
		this.pelota = pelota;
		this.escena = escena;
	}

	// Handle
	@Override
	public void handle(ActionEvent arg0) {
		// Punto en el que debe chocar
		double ancho = escena.getWidth() / 2 - pelota.getRadius();
		double alto = escena.getHeight() / 2 - pelota.getRadius();
		
		// Cambiar la velocidad cuando deba chocar
		if(pelota.getTranslateX() >= ancho) {
			velocidadX = -2;
		}
		
		if(pelota.getTranslateX() <= - ancho) {
			velocidadX = 2;
		}
		
		if(pelota.getTranslateY() >= alto) {
			velocidadY = -1;
		}
		
		if(pelota.getTranslateY() <= - alto) {
			velocidadY = 1;
		}
		
		// Movimiento de la pelota
		pelota.setTranslateX(pelota.getTranslateX() + velocidadX);
		pelota.setTranslateY(pelota.getTranslateY() + velocidadY);
	}

}
