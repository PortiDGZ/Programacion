package application;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.transform.*;
import javafx.stage.*;

public class Ejercicio19 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Ejercicio 19");
		
		// Crear cubo
		Box cubo = new Box();
		
		cubo.setDepth(250);
		cubo.setWidth(250);
		cubo.setHeight(250);
		
		// Crear Rotate
		Rotate tx = new Rotate(0, 0, 0, 0, Rotate.X_AXIS);
		tx.setAngle(30);
		
		Rotate ty = new Rotate(0, 0, 0, 0, Rotate.Y_AXIS);
		ty.setAngle(50);
		
		Rotate tz = new Rotate(0, 0, 0, 0, Rotate.Z_AXIS);
		tz.setAngle(30);
		
		cubo.getTransforms().addAll(tx, ty, tz);
		
		// Crear paneles y escenas
		BorderPane panel = new BorderPane();
		
		panel.setCenter(cubo);
		
		Scene escena = new Scene(panel, 800, 500);
		
		primaryStage.setScene(escena);
		
		// Mostrar la ventana
		primaryStage.show();
	}

}