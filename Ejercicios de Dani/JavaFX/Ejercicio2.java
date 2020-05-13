package application;
	
import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class Ejercicio2 extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Ejercicio 2");
		
		// Crear botones
		Button boton1 = new Button();
		Button boton2 = new Button();
		Button boton3 = new Button();
		
		// Crear texto de los botones
		boton1.setText("Bot�n 1");
		boton2.setText("Bot�n 2");
		boton3.setText("Bot�n 3");
		
		// Layout de los botones
		VBox botones = new VBox();
		
		botones.getChildren().add(boton1);
		botones.getChildren().add(boton2);
		botones.getChildren().add(boton3);
		
		// Cambiar m�rgenes
		Insets rectangulo = new Insets(10, 30, 10, 30);
		VBox.setMargin(boton1, rectangulo);
		VBox.setMargin(boton2, rectangulo);
		VBox.setMargin(boton3, rectangulo);
		
		// Crear una escena con los botones
		Scene escena = new Scene(botones, 50, 150);
		
		// A�adir la escena a la ventana
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}