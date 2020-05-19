package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class Handler6 implements EventHandler<ActionEvent> {

	// Objetos de la ventana
	private Circle pelota;
	private Scene escena;
	private Polygon rectangulo;

	// Velocidad de la pelota
	private int velocidadX = 4;
	private int velocidadY = -2;
	
	// Tecla pulsada 1 = arriba, 2 = abajo
	private int tecla;

	// Velocidad del rectángulo
	private final static int VELOCIDAD = 10;

	// Constructor
	public Handler6(Circle pelota, Scene escena, Polygon rectangulo) {
		this.pelota = pelota;
		this.escena = escena;
		this.rectangulo = rectangulo;
	}

	// Handle
	@Override
	public void handle(ActionEvent arg0) {
		// Movimiento del rectángulo
		switch (tecla) {
		case 1:
			rectangulo.setTranslateY(Math.max(rectangulo.getTranslateY() - VELOCIDAD, 75 - escena.getHeight() / 2));
			break;
		case 2:
			rectangulo.setTranslateY(Math.min(rectangulo.getTranslateY() + VELOCIDAD, escena.getHeight() / 2 - 75));
			break;
		}
		
		tecla = 0;
		
		// Punto en el que debe chocar
		double ancho = escena.getWidth() / 2 - pelota.getRadius();
		double alto = escena.getHeight() / 2 - pelota.getRadius();

		// Cambiar la velocidad cuando deba chocar
		if (pelota.getTranslateX() <= -ancho) {
			velocidadX = 4;
		}

		if (pelota.getTranslateY() >= alto) {
			velocidadY = -4;
		}

		if (pelota.getTranslateY() <= -alto) {
			velocidadY = 2;
		}

		// Cambiar la velocidad cuando la pelota se encuentre con el rectángulo
		if (choquePelota()) {
			velocidadX = -4;
		}

		// Movimiento de la pelota
		pelota.setTranslateX(pelota.getTranslateX() + velocidadX);
		pelota.setTranslateY(pelota.getTranslateY() + velocidadY);
	}

	private boolean choquePelota() {
		return pelota.getTranslateX() >= rectangulo.getTranslateX() - pelota.getRadius() - 25
				&& pelota.getTranslateX() <= rectangulo.getTranslateX() - pelota.getRadius() + 25
				&& pelota.getTranslateY() <= rectangulo.getTranslateY() + 75
				&& pelota.getTranslateY() >= rectangulo.getTranslateY() - 75;
	}

	public void setTecla(int code) {
		tecla = code;
	}

}