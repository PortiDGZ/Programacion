package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;

public class Handler5 implements EventHandler<ActionEvent> {
	
	// Objetos de la ventana
	private Circle pelota;
	private Scene escena;
	
	// Velocidad total
	private int velocidadX = 2;
	private int velocidadY = 1;
	
	// Velocidad de movimiento actual
	private int velocidadXActual = 2;
	private int velocidadYActual = 1;

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
			velocidadXActual = - velocidadX;
		}
		
		if(pelota.getTranslateX() <= - ancho) {
			velocidadXActual = velocidadX;
		}
		
		if(pelota.getTranslateY() >= alto) {
			velocidadYActual = - velocidadY;
		}
		
		if(pelota.getTranslateY() <= - alto) {
			velocidadYActual = velocidadY;
		}
		
		// Movimiento de la pelota
		pelota.setTranslateX(pelota.getTranslateX() + velocidadXActual);
		pelota.setTranslateY(pelota.getTranslateY() + velocidadYActual);
	}

	public void aumentarVelocidad() {
		velocidadX += 2;
		velocidadY += 1;
		
		actualizarVelocidad();
	}

	private void actualizarVelocidad() {
		if (velocidadXActual < 0) {
			velocidadXActual = - velocidadX;
		} else {
			velocidadXActual = velocidadX;
		}
		
		if (velocidadYActual < 0) {
			velocidadYActual = - velocidadY;
		} else {
			velocidadYActual = velocidadY;
		}
	}
	
	public void disminuirVelocidad() {
		velocidadX -= 2;
		velocidadY -= 1;
		
		velocidadX = Math.max(velocidadX, 2);
		velocidadY = Math.max(velocidadY, 1);
		
		actualizarVelocidad();
	}

}
