package application;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;

public class Ejercicio21 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Ejercicio 21");
		
		// Crear gradiente
		RadialGradient gradiente = new RadialGradient(0, 0, 0.5, 0.5, 1, true, CycleMethod.NO_CYCLE, new Stop[] {
		        new Stop(0, Color.WHITE),
		        new Stop(0.1, Color.RED),
		        new Stop(0.35, Color.DARKRED)
		    });
		
		// Crear círculo
		Circle circulo = new Circle(200);
		
		circulo.setFill(gradiente);
		
		// Crear paneles y escenas
		BorderPane panel = new BorderPane();
		
		panel.setCenter(circulo);
		
		Scene escena = new Scene(panel, 500, 500);
		
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}

}