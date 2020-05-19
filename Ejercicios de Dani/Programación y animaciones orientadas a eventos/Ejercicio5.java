package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.*;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ejercicio5 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Pelota
		Circle pelota = new Circle(50);
		pelota.setFill(Color.BLUE);
		pelota.setStroke(Color.LIGHTBLUE);

		// Crear panel
		StackPane panel = new StackPane();
		panel.getChildren().addAll(pelota);

		// Crear escena
		Scene escena = new Scene(panel, 1000, 600);
		primaryStage.setScene(escena);
		primaryStage.setTitle("Ejercicio 5");
		primaryStage.show();

		// Movimiento de la pelota
		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(16), new Handler5(pelota, escena)));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
	}

	public static void main(String[] args) {
		launch(args);
	}
}