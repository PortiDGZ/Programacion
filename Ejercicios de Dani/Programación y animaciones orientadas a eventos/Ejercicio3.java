package application;

import java.util.*;

import javafx.animation.*;
import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.media.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class Ejercicio3 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Texto de instrucciones
		Text texto = new Text("Pulsa enter cuando pase la flecha.");
		texto.setStyle("-fx-font: 24 arial;");

		// Crear cuadrado
		Polygon cuadro = new Polygon(0, 0, 0, 50, 50, 50, 50, 0);
		cuadro.setStroke(Color.CORAL);
		cuadro.setStrokeWidth(5);
		cuadro.setFill(Color.CYAN);

		// Crear panel
		BorderPane panel = new BorderPane();
		panel.setCenter(cuadro);
		panel.setBottom(texto);

		// Crear escena
		Scene escena = new Scene(panel, 500, 500);
		escena.setFill(Color.CYAN);
		primaryStage.setScene(escena);
		primaryStage.setTitle("Ejercicio 3");
		primaryStage.setResizable(false);
		primaryStage.show();

		// Crear la flecha
		Image abajo = new Image(getClass().getResource("flecha b.png").toExternalForm());
		ImageView iv = new ImageView();
		iv.setImage(abajo);
		panel.setTop(iv);
		BorderPane.setMargin(iv, new Insets(0, 0, 0, 235));
		
		// Movimiento de la flecha
		TranslateTransition t1 = new TranslateTransition(Duration.millis(new Random().nextInt(3000)), iv);
		t1.setByY(10);
		t1.play();
		TranslateTransition t2 = new TranslateTransition(Duration.millis(500), iv);
		t2.setByY(500);
		t1.setOnFinished(e -> t2.play());
		t1.play();
		
		// Captar enter
		escena.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
		      if(key.getCode()==KeyCode.ENTER && iv.getTranslateY() < 320 && iv.getTranslateY() > 130) {
		    	  // Cambiar fondo
		    	  escena.setFill(Color.LIGHTGREEN);
		    	  cuadro.setFill(Color.LIGHTGREEN);
		    	  
		    	  // Mostrar texto de victoria
		    	  Text exito = new Text("¡Éxito!");
		    	  exito.setStyle("-fx-font: 24 arial;");
		    	  panel.setTop(exito);
		    	  
		    	  // Reproducir sonido de victoria
		    	  AudioClip sonido = new AudioClip(getClass().getResource("Chime2.wav").toExternalForm());
		    	  sonido.play();
		      }
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}