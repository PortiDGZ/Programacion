package application;
	
import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class Ejercicio10 extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Ejercicio 10");
		
		// Crear botones
		Button boton1 = new Button();
		Button boton2 = new Button();
		Button boton3 = new Button();
		Button boton4 = new Button();
		Button boton5 = new Button();
		Button boton6 = new Button();
		
		// Crear texto de los botones
		boton1.setText("Posición 0, 0");
		boton2.setText("Posición 0, 1");
		boton3.setText("Posición 0, 2");
		boton4.setText("Posición 1, 0");
		boton5.setText("Posición 1, 1");
		boton6.setText("Posición 1, 2");
		
		// Layout de los botones
		GridPane botones = new GridPane();
		
		botones.add(boton1, 0, 0);
		botones.add(boton2, 0, 1);
		botones.add(boton3, 0, 2);
		botones.add(boton4, 1, 0);
		botones.add(boton5, 1, 1);
		botones.add(boton6, 1, 2);
		
		// Cambiar márgenes
		Insets rectangulo = new Insets(0, 10, 10, 0);
		GridPane.setMargin(boton1, rectangulo);
		GridPane.setMargin(boton2, rectangulo);
		GridPane.setMargin(boton3, rectangulo);
		GridPane.setMargin(boton4, rectangulo);
		GridPane.setMargin(boton5, rectangulo);
		GridPane.setMargin(boton6, rectangulo);
		
		// Crear una escena con los botones
		Scene escena = new Scene(botones, 300, 150);
		
		// Añadir la escena a la ventana
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}