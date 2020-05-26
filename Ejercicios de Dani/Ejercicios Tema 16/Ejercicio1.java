package application;
	
import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;


public class Ejercicio1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Texto
		Text t1 = new Text("Pulsa el bot�n");
		Text t2 = new Text("Elige una opci�n:");
		Text t3 = new Text("Escribe el nombre de una persona");
		Text t4 = new Text("Nombre elegido");
		Text t5 = new Text("Est�s sobre la ");
		Text t6 = new Text("Solo se puede escribir d�gitos");
		
		// TextField
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		tf2.setDisable(true);
		
		TextField tf3 = new TextField();
		tf3.textProperty().addListener(new ChangeListener<String>() {
		    @Override
		    public void changed(ObservableValue<? extends String> observable, String oldValue, 
		        String newValue) {
		        if (!newValue.matches("\\d*")) {
		            tf3.setText(newValue.replaceAll("[^\\d]", ""));
		        }
		    }
		});
		
		// ComboBox
		ComboBox<String> cbo = new ComboBox<String>();
		cbo.getItems().add("Fernando");
		cbo.getItems().add("Alberto");
		cbo.getItems().add("Arturo");
		cbo.setOnAction(e -> {
			tf2.setText(cbo.getValue());
		});
		
		// Bot�n
		Button bt1 = new Button("P�lsame");
		bt1.setOnAction(e -> {
			JOptionPane.showMessageDialog(null, "�Me has pulsado!");
		});
		
		Button bt2 = new Button("A�adir");
		bt2.setOnAction(e -> {
			cbo.getItems().add(tf1.getText());
		});
		
		// RadioButton
		RadioButton rb1 = new RadioButton("Opci�n 1");
		RadioButton rb2 = new RadioButton("Opci�n 2");
		RadioButton rb3 = new RadioButton("Opci�n 3");
		
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		rb3.setToggleGroup(tg);
		
		rb1.setOnMouseEntered(e -> {
			t5.setText("Est�s sobre la Opci�n 1");
		});
		rb2.setOnMouseEntered(e -> {
			t5.setText("Est�s sobre la Opci�n 2");
		});
		rb3.setOnMouseEntered(e -> {
			t5.setText("Est�s sobre la Opci�n 3");
		});
		
		rb1.setOnMouseExited(e -> {
			t5.setText("Est�s sobre la ");
		});
		rb2.setOnMouseExited(e -> {
			t5.setText("Est�s sobre la ");
		});
		rb3.setOnMouseExited(e -> {
			t5.setText("Est�s sobre la ");
		});
		
		// Panel
		GridPane panel = new GridPane();
		panel.add(t1, 0, 0);
		panel.add(bt1, 0, 1);
		panel.add(t2, 1, 0);
		panel.add(cbo, 1, 1);
		panel.add(t3, 2, 0);
		panel.add(tf1, 2, 1);
		panel.add(bt2, 2, 2);
		panel.add(t4, 1, 2);
		panel.add(tf2, 1, 3);
		panel.add(rb1, 0, 4);
		panel.add(rb2, 0, 5);
		panel.add(rb3, 0, 6);
		panel.add(t5, 1, 5);
		panel.add(t6, 2, 4);
		panel.add(tf3, 2, 5);
		
		Insets i = new Insets(10);
		GridPane.setMargin(t1, i);
		GridPane.setMargin(t2, i);
		GridPane.setMargin(t3, i);
		GridPane.setMargin(t4, i);
		GridPane.setMargin(t5, i);
		GridPane.setMargin(t6, i);
		GridPane.setMargin(tf1, i);
		GridPane.setMargin(tf2, i);
		GridPane.setMargin(tf3, i);
		GridPane.setMargin(cbo, i);
		GridPane.setMargin(bt1, i);
		GridPane.setMargin(bt2, i);
		GridPane.setMargin(rb1, i);
		GridPane.setMargin(rb2, i);
		GridPane.setMargin(rb3, i);
		
		// Escena
		Scene escena = new Scene(panel, 500, 300);
		primaryStage.setScene(escena);
		primaryStage.setTitle("Ejercicio 1");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}