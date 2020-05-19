package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.*;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.*;
import javafx.scene.control.Button;
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

		// Crear botones de velocidad
		Button mas = new Button("+");
		mas.setTranslateX(-480);
		mas.setTranslateY(-280);
		
		Button menos = new Button("-");
		menos.setTranslateX(-440);
		menos.setTranslateY(-280);

		// Crear panel
		StackPane panel = new StackPane();
		panel.getChildren().addAll(pelota, mas, menos);

		// Crear escena
		Scene escena = new Scene(panel, 1000, 600);
		primaryStage.setScene(escena);
		primaryStage.setTitle("Ejercicio 5");
		primaryStage.show();

		// Movimiento de la pelota
		Handler5 handler = new Handler5(pelota, escena);
		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(16), handler));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

		// Accion de los botones
		mas.setOnAction(e -> {
			handler.aumentarVelocidad();
		});
		
		menos.setOnAction(e -> {
			handler.disminuirVelocidad();
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}