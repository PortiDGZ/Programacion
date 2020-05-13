package application;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.*;

public class Ejercicio18 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Ejercicio 18");
		
		// Crear Path
		Path p1 = new Path();
		
		p1.getElements().addAll(new MoveTo(108, 71));
		p1.getElements().addAll(new LineTo(269, 250));
		p1.getElements().addAll(new LineTo(232, 52));
		p1.getElements().addAll(new LineTo(126, 232));
		p1.getElements().addAll(new LineTo(321, 161));
		p1.getElements().addAll(new LineTo(108, 71));
		p1.setStroke(Color.BLUE);
		
		// Crear paneles y escenas
		HBox panel = new HBox();
		
		panel.getChildren().add(p1);
		
		Scene escena = new Scene(panel, 800, 500);
		
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}

}