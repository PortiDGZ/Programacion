package application;

import javafx.animation.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.util.*;

public class Ejercicio20 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Ejercicio 20");
		
		// Crear hexágono
		Polygon hexagono = new Polygon();
		
		Double[] puntos = {(double) 250, (double) 0, (double) 500, (double) 150, (double) 500, (double) 600, (double) 250, (double) 750, (double) 0, (double) 600, (double) 0, (double) 150};
		hexagono.getPoints().addAll(puntos);
		
		hexagono.setFill(Color.BLUE);
		
		// Crear rotación
		RotateTransition rotacion = new RotateTransition(Duration.millis(3000), hexagono);
		 
		rotacion.setByAngle(18);
		
		// Crear paneles y escenas
		BorderPane panel = new BorderPane();
		
		panel.setCenter(hexagono);
		
		Scene escena = new Scene(panel, 1200, 800);
		
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
		
		// Rotar hexágono
		rotacion.play();
	}

}