package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.*;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.*;

public class Ejercicio6 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Text
		Text puntos = new Text("Puntos: 0");
		puntos.setTranslateX(-140);
		puntos.setTranslateY(-230);

		// Cuadrado
		Polygon cuadro = new Polygon(0, 0, 0, 50, 50, 50, 50, 0);
		cuadro.setStroke(Color.CORAL);
		cuadro.setStrokeWidth(5);
		cuadro.setFill(Color.CYAN);
		cuadro.setTranslateY(120);

		// Media
		AudioClip musica = new AudioClip(getClass().getResource("Tombtorial.m4a").toExternalForm());
		musica.play();

		// Panel
		StackPane panel = new StackPane();
		panel.getChildren().add(cuadro);
		panel.getChildren().add(puntos);

		// Timeline
		HandlerE6 handler = new HandlerE6(puntos, panel);
		Timeline tl = new Timeline(new KeyFrame(Duration.millis(15), handler));
		tl.setCycleCount(Timeline.INDEFINITE);
		tl.play();

		// Escena
		Scene escena = new Scene(panel, 400, 500);
		escena.setFill(Color.CYAN);
		primaryStage.setScene(escena);
		primaryStage.setTitle("Ejercicio 6");
		primaryStage.setResizable(false);
		primaryStage.show();

		// Detectar teclas pulsadas
		escena.addEventHandler(KeyEvent.KEY_PRESSED, (tecla) -> {
			if (tecla.getCode() == KeyCode.UP) {
				handler.setTecla(1);
			} else if (tecla.getCode() == KeyCode.DOWN) {
				handler.setTecla(2);
			} else if (tecla.getCode() == KeyCode.LEFT) {
				handler.setTecla(3);
			} else if (tecla.getCode() == KeyCode.RIGHT) {
				handler.setTecla(4);
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}