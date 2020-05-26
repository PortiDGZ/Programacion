package application;
	
import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;


public class Ejercicio4 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Text
		Text operando1 = new Text("Operando 1:");
		Text operando2 = new Text("Operando 2:");
		
		// TextField
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();

		TextField resultado = new TextField();
		resultado.setEditable(false);
		resultado.setStyle("-fx-font: 24 arial;");
		
		// Botón
		Button suma = new Button("+");
		suma.setOnAction(e -> {
			try {
				double n1 = Double.parseDouble(tf1.getText());
				double n2 = Double.parseDouble(tf2.getText());
				resultado.setText(Double.toString(n1 + n2));
			} catch (NumberFormatException e1) {
			}
		});
		
		Button resta = new Button("-");
		resta.setOnAction(e -> {
			try {
				double n1 = Double.parseDouble(tf1.getText());
				double n2 = Double.parseDouble(tf2.getText());
				resultado.setText(Double.toString(n1 - n2));
			} catch (NumberFormatException e1) {
			}
		});
		
		Button producto = new Button("x");
		producto.setOnAction(e -> {
			try {
				double n1 = Double.parseDouble(tf1.getText());
				double n2 = Double.parseDouble(tf2.getText());
				resultado.setText(Double.toString(n1 * n2));
			} catch (NumberFormatException e1) {
			}
		});
		
		Button cociente = new Button("/");
		cociente.setOnAction(e -> {
			try {
				double n1 = Double.parseDouble(tf1.getText());
				double n2 = Double.parseDouble(tf2.getText());
				resultado.setText(Double.toString(n1 / n2));
			} catch (NumberFormatException e1) {
			}
		});
		
		Button resto = new Button("%");
		resto.setOnAction(e -> {
			try {
				double n1 = Double.parseDouble(tf1.getText());
				double n2 = Double.parseDouble(tf2.getText());
				resultado.setText(Double.toString(n1 % n2));
			} catch (NumberFormatException e1) {
			}
		});
		
		Button abs = new Button("|x|");
		abs.setOnAction(e -> {
			try {
				double n1 = Double.parseDouble(tf1.getText());
				resultado.setText(Double.toString(Math.abs(n1)));
			} catch (NumberFormatException e1) {
			}
		});
		
		Button exp = new Button("exp");
		exp.setOnAction(e -> {
			try {
				double n1 = Double.parseDouble(tf1.getText());
				double n2 = Double.parseDouble(tf2.getText());
				resultado.setText(Double.toString(Math.pow(n1, n2)));
			} catch (NumberFormatException e1) {
			}
		});
		
		Button ln = new Button("ln");
		ln.setOnAction(e -> {
			try {
				double n1 = Double.parseDouble(tf1.getText());
				resultado.setText(Double.toString(Math.log(n1)));
			} catch (NumberFormatException e1) {
			}
		});
		
		// Panel
		GridPane panel = new GridPane();
		panel.add(resultado, 0, 0);
		panel.add(operando1, 0, 1);
		panel.add(tf1, 0, 2);
		panel.add(operando2, 0, 3);
		panel.add(tf2, 0, 4);
		panel.add(suma, 1, 1);
		panel.add(resta, 2, 1);
		panel.add(producto, 1, 2);
		panel.add(cociente, 2, 2);
		panel.add(resto, 1, 3);
		panel.add(abs, 2, 3);
		panel.add(exp, 1, 4);
		panel.add(ln, 2, 4);
		
		Insets i = new Insets(10);
		GridPane.setMargin(operando1, i);
		GridPane.setMargin(operando2, i);
		GridPane.setMargin(tf1, i);
		GridPane.setMargin(tf2, i);
		
		// Escena
		Scene escena = new Scene(panel, 400, 220);
		primaryStage.setScene(escena);
		primaryStage.setTitle("Ejercicio 4");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}