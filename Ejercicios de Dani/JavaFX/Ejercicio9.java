package application;
	
import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class Ejercicio9 extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Ejercicio 9");
		
		// Crear botones
		Button boton1 = new Button();
		Button boton2 = new Button();
		Button boton3 = new Button();
		
		// Crear texto de los botones
		boton1.setText("Posición 0, 0");
		boton2.setText("Posición 0, 1");
		boton3.setText("Posición 0, 2");
		
		// Layout de los botones
		GridPane botones = new GridPane();
		
		botones.add(boton1, 0, 0);
		botones.add(boton2, 0, 1);
		botones.add(boton3, 0, 2);
		
		// Cambiar márgenes
		Insets rectangulo = new Insets(0, 0, 10, 0);
		GridPane.setMargin(boton1, rectangulo);
		GridPane.setMargin(boton2, rectangulo);
		
		// Crear una escena con los botones
		Scene escena = new Scene(botones, 50, 100);
		
		// Añadir la escena a la ventana
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
