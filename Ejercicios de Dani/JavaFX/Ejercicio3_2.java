package application;
	
import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class Ejercicio3_2 extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Ejercicio 3");
		
		// Crear botones
		Button boton1 = new Button();
		Button boton2 = new Button();
		Button boton3 = new Button();
		
		// Crear texto de los botones
		boton1.setText("Botón 1");
		boton2.setText("Botón 2");
		boton3.setText("Botón 3");
		
		// Layout de los botones
		HBox botones = new HBox();
		
		botones.getChildren().add(boton1);
		botones.getChildren().add(boton2);
		botones.getChildren().add(boton3);
		
		// Cambiar márgenes
		Insets rectangulo = new Insets(30, 30, 10, 30);
		HBox.setMargin(boton1, rectangulo);
		HBox.setMargin(boton2, rectangulo);
		HBox.setMargin(boton3, rectangulo);
		
		// Crear una escena con los botones
		Scene escena = new Scene(botones, 400, 100);
		
		// Añadir la escena a la ventana
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}