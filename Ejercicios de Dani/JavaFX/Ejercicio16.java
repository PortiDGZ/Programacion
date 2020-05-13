package application;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Ejercicio16 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Ejercicio 16");
		
		// Crear botón
		Button boton = new Button();
		
		boton.setText("Boton");
		
		// Añadir evento
		boton.setOnAction(new HolaMundo());
		
		// Crear paneles y escenas
		StackPane panel = new StackPane();
		
		panel.getChildren().add(boton);
		
		Scene escena = new Scene(panel, 100, 100);
		
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}

}
