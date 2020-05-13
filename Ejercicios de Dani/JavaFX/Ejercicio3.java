package application;
	
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class Ejercicio3 extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Ejercicio 3");
		
		// Crear botones
		Button boton1 = new Button();
		Button boton2 = new Button();
		Button boton3 = new Button();
		
		// Crear texto de los botones
		boton1.setText("Bot�n 1");
		boton2.setText("Bot�n 2");
		boton3.setText("Bot�n 3");
		
		// Layout de los botones
		HBox botones = new HBox();
		
		botones.getChildren().add(boton1);
		botones.getChildren().add(boton2);
		botones.getChildren().add(boton3);
		
		// Crear una escena con los botones
		Scene escena = new Scene(botones, 200, 50);
		
		// A�adir la escena a la ventana
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
