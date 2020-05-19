package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;

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
	
	// Marcador
	private Text marcador;
	private int puntos;
	private int maximo;

	// Velocidad del rectángulo
	private final static int VELOCIDAD = 10;
	
	// Sonido de puntuación
	private AudioClip punto = new AudioClip(getClass().getResource("Shop.wav").toExternalForm());
	
	// Sonido de derrota
	private AudioClip derrota = new AudioClip(getClass().getResource("Buzzer2.wav").toExternalForm());

	// Constructor
	public Handler6(Circle pelota, Scene escena, Polygon rectangulo, Text marcador) {
		this.pelota = pelota;
		this.escena = escena;
		this.rectangulo = rectangulo;
		this.marcador = marcador;
	}

	// Handle
	@Override
	public void handle(ActionEvent arg0) {
		// Colocar rectángulo
		rectangulo.setTranslateX(escena.getWidth() / 2 - 50);
		
		// Colocar marcador
		marcador.setTranslateX(170 - escena.getWidth() / 2);
		marcador.setTranslateY(50 -escena.getHeight() / 2);
		
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

		// Cambiar la velocidad cuando la pelota se encuentre con el rectángulo y anotar un punto
		if (choquePelota()) {
			velocidadX = -4;
			puntos++;
			maximo = Math.max(maximo, puntos);
			marcador.setText("Puntuación: " + puntos + "    Máximo: " + maximo);
			punto.play();
		}

		// Movimiento de la pelota
		pelota.setTranslateX(pelota.getTranslateX() + velocidadX);
		pelota.setTranslateY(pelota.getTranslateY() + velocidadY);
		
		// Reiniciar partida
		if(pelota.getTranslateX() >= ancho + 300) {
			derrota.play();
			pelota.setTranslateX(0);
			pelota.setTranslateY(0);
			puntos = 0;
			marcador.setText("Puntuación: 0    Máximo: " + maximo);
		}
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