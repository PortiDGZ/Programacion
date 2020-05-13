package application;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.stage.*;

public class Ejercicio22 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Ejercicio 22");
		
		// Crear esfera
		Sphere e1 = new Sphere(100);
		e1.setCullFace(CullFace.FRONT);
		
		Sphere e2 = new Sphere(100);
		e2.setCullFace(CullFace.BACK);
		
		Sphere e3 = new Sphere(100);
		e3.setCullFace(CullFace.NONE);
		
		// Crear paneles y escenas
		HBox panel = new HBox();
		panel.getChildren().addAll(e1, e2, e3);
		
		Insets margen = new Insets(20, 0, 0, 20);
		HBox.setMargin(e1, margen);
		HBox.setMargin(e2, margen);
		HBox.setMargin(e3, margen);
		
		Scene escena = new Scene(panel, 750, 250);
		
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}

}