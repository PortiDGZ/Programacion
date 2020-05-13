package application;
	
import javafx.application.*;
import javafx.geometry.Orientation;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class Ejercicio6 extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Ejercicio 6");
		
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
		
		// Crear una escena con los botones
		Scene escena = new Scene(botones, 100, 100);
		
		// Añadir la escena a la ventana
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}