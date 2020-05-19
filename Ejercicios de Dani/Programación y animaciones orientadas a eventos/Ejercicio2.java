package application;
	
import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;


public class Ejercicio2 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Crear Text donde mostrar la suma
		Text texto1 = new Text("Operando 1:");
		Text texto2 = new Text("Operando 2:");
		Text texto3 = new Text("Resultado:");
		
		// Crear TextField
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		
		// Crear Text donde mostrar la operación
		Text operacion = new Text();
		operacion.setStyle("-fx-font: 24 arial;");
		
		// Crear radiales
		ToggleGroup operaciones = new ToggleGroup();
		
		RadioButton suma = new RadioButton("Sumar");
		suma.setToggleGroup(operaciones);
		suma.fire();
		RadioButton resta = new RadioButton("Restar");
		resta.setToggleGroup(operaciones);
		RadioButton producto = new RadioButton("Multiplicar");
		producto.setToggleGroup(operaciones);
		RadioButton cociente = new RadioButton("Dividir");
		cociente.setToggleGroup(operaciones);
		
		// Crear botton de realizar operación
		Button boton = new Button("Calcular");
		boton.setOnAction(e -> {
			try {
				double n1 = Double.parseDouble(t1.getText());
				double n2 = Double.parseDouble(t2.getText());
				
				if (suma.isSelected()) {
					operacion.setText(Double.toString(n1 + n2));
				} else if (resta.isSelected()) {
					operacion.setText(Double.toString(n1 - n2));
				} else if (producto.isSelected()) {
					operacion.setText(Double.toString(n1 * n2));
				} else if (cociente.isSelected()) {
					operacion.setText(Double.toString(n1 / n2));
				}
			} catch (NumberFormatException e1) {
			}
		});
		
		// Crear panel
		VBox panel = new VBox();
		panel.getChildren().addAll(suma, resta, producto, cociente, texto1, t1, texto2, t2, boton, texto3, operacion);
		VBox.setMargin(operacion, new Insets(30, 0, 0, 80));
		
		// Crear escena
		Scene escena = new Scene(panel, 200, 280);
		primaryStage.setScene(escena);
		primaryStage.setTitle("Ejercicio 2");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}