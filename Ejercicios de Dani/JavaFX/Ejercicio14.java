package application;
	
import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Ejercicio14 extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Ejercicio 14");
		
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
		
		// Cambiar posici�n del panel
		StackPane.setAlignment(boton, Pos.BOTTOM_RIGHT);
		StackPane.setAlignment(fondo, Pos.BOTTOM_RIGHT);
		Insets margen = new Insets(0, 10, 10, 0);
		StackPane.setMargin(boton, margen);
		StackPane.setMargin(fondo, margen);
		
		// Crear una escena con el bot�n y el rect�ngulo
		Scene escena = new Scene(layout, 200, 200);
		
		// A�adir la escena a la ventana
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}