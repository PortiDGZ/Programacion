package application;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Ejercicio17 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Ejercicio 17");
		
		// Crear imagen
		ImageView i1 = new ImageView("https://www.tutorialspoint.com/javafx/images/loading_image.jpg");
		ImageView i2 = new ImageView("https://www.tutorialspoint.com/javafx/images/loading_image.jpg");
		ImageView i3 = new ImageView("https://www.tutorialspoint.com/javafx/images/loading_image.jpg");
		
		// Cambiar tamaño
		i2.setScaleX(0.5);
		i2.setScaleY(0.5);
		i3.setScaleX(0.25);
		i3.setScaleY(0.25);
				
		// Crear paneles y escenas
		HBox panel = new HBox();
		
		panel.getChildren().add(i1);
		panel.getChildren().add(i2);
		panel.getChildren().add(i3);
		
		Scene escena = new Scene(panel, 1800, 500);
		
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}

}