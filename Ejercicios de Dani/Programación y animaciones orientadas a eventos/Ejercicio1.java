package application;
	
import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;


public class Ejercicio1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Crear Text
		Text texto1 = new Text("Sumando 1:");
		Text texto2 = new Text("Sumando 2:");
		Text texto3 = new Text("Resultado (presiona enter):");
		
		// Crear TextField
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		
		// Crear Text donde mostrar la suma
		Text suma = new Text();
		suma.setStyle("-fx-font: 24 arial;");
		
		// Crear panel
		VBox panel = new VBox();
		panel.getChildren().addAll(texto1, t1, texto2, t2, texto3, suma);
		VBox.setMargin(suma, new Insets(30, 0, 0, 80));
		
		// Crear handler para los TextField
		t1.setOnAction(new Handler1(t1, t2, suma));
		t2.setOnAction(new Handler1(t1, t2, suma));
		
		// Crear escena
		Scene escena = new Scene(panel, 200, 200);
		primaryStage.setScene(escena);
		primaryStage.setTitle("Ejercicio 1");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
