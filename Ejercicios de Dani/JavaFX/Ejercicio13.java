package application;
	
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Ejercicio13 extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Ejercicio 13");
		
		// Crear bot�n
		Button boton = new Button();
		
		// Crear texto del bot�n
		boton.setText("Bot�n 1");
		
		// Crear fondo azul
		Rectangle fondo = new Rectangle(0, 0, 120, 120);
		fondo.setFill(Color.DARKBLUE);
		
		// Layout
		StackPane layout = new StackPane();
		
		layout.getChildren().add(fondo);
		layout.getChildren().add(boton);
		
		// Crear una escena con el bot�n y el rect�ngulo
		Scene escena = new Scene(layout, 150, 150);
		
		// A�adir la escena a la ventana
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}