package application;
	
import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class Ejercicio7 extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Ejercicio 7");
		
		// Crear botones
		Button boton1 = new Button();
		Button boton2 = new Button();
		Button boton3 = new Button();
		
		// Crear texto de los botones
		boton1.setText("Botón 1");
		boton2.setText("Botón 2");
		boton3.setText("Botón 3");
		
		// Layout de los botones
		FlowPane botones = new FlowPane();
		
		botones.getChildren().add(boton1);
		botones.getChildren().add(boton2);
		botones.getChildren().add(boton3);
		
		// Colocar los botones en vertical
		botones.setOrientation(Orientation.VERTICAL);
		
		// Cambiar márgenes
		Insets rectangulo = new Insets(0, 0, 10, 0);
		FlowPane.setMargin(boton1, rectangulo);
		FlowPane.setMargin(boton2, rectangulo);
		FlowPane.setMargin(boton3, rectangulo);
		
		// Crear una escena con los botones
		Scene escena = new Scene(botones, 100, 120);
		
		// Añadir la escena a la ventana
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}