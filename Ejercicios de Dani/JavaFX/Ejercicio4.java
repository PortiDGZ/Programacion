package application;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Ejercicio4 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Ejercicio 3");
		
		// Crear botones
		Button top = new Button();
		Button left = new Button();
		Button center = new Button();
		Button right = new Button();
		Button bottom = new Button();
		
		// Crear texto de los botones
		top.setText("TOP");
		left.setText("LEFT");
		center.setText("CENTER");
		right.setText("RIGHT");
		bottom.setText("BOTTOM");
		
		// Layout de los botones
		BorderPane botones = new BorderPane();
		
		botones.setTop(top);
		botones.setLeft(left);
		botones.setCenter(center);
		botones.setRight(right);
		botones.setBottom(bottom);
		
		// Crear una escena con los botones
		Scene escena = new Scene(botones, 1000, 500);
		
		// Añadir la escena a la ventana
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}

}
