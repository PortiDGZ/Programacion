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
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class Ejercicio6 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Pelota
		Circle pelota = new Circle(50);
		pelota.setFill(Color.BLUE);
		pelota.setStroke(Color.LIGHTBLUE);

		// Rectángulo
		Polygon rectangulo = new Polygon(0, 0, 50, 0, 50, 150, 0, 150);
		rectangulo.setFill(Color.BLACK);
		rectangulo.setTranslateX(450);

		// Crear panel
		StackPane panel = new StackPane();
		panel.getChildren().addAll(pelota, rectangulo);

		// Crear escena
		Scene escena = new Scene(panel, 1000, 600);
		primaryStage.setScene(escena);
		primaryStage.setTitle("Ejercicio 6");
		primaryStage.show();

		// Movimiento de la pelota
		Handler6 handler = new Handler6(pelota, escena, rectangulo);
		Timeline timelinePelota = new Timeline(new KeyFrame(Duration.millis(16), handler));
		timelinePelota.setCycleCount(Timeline.INDEFINITE);
		timelinePelota.play();

		// Movimiento del rectángulo
		escena.addEventHandler(KeyEvent.KEY_PRESSED, (tecla) -> {
			if(tecla.getCode()==KeyCode.UP) {
				handler.setTecla(1);
			} else if (tecla.getCode()==KeyCode.DOWN) {
				handler.setTecla(2);
			}
		});

	}

	public static void main(String[] args) {
		launch(args);
	}
}