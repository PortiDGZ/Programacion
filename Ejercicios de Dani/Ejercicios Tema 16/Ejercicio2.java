package application;

import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ejercicio2 extends Application {

	@Override
	public void start(Stage primaryStage) {
		// Texto
		Text t1 = new Text("Usuario:");
		Text t2 = new Text("Contraseña:");
		
		// TextField
		TextField usuario = new TextField();
		TextField contraseña = new TextField();
		
		// Botón
		Button bt1 = new Button("Aceptar");
		bt1.setOnAction(e -> {
			boolean coincidencia = false;
			File usuarios = new File("usuarios.txt");
			try (Scanner scan = new Scanner(usuarios)) {
				usuarios.createNewFile();
				
				while(scan.hasNextLine() && !coincidencia) {
					String[] datos = scan.nextLine().split(" ");
					coincidencia = datos[0].equals(usuario.getText()) && datos[1].equals(contraseña.getText());
				}
			} catch (IOException e1) {
			}
			
			if(coincidencia) {
				JOptionPane.showMessageDialog(null, "Usted ha accedido a la aplicación.");
			} else {
				JOptionPane.showMessageDialog(null, "El usuario y la contraseña no coinciden.");
			}
		});
		
		Button bt2 = new Button("Reset");
		bt2.setOnAction(e -> {
			usuario.setText("");
			contraseña.setText("");
		});
		
		Button bt3 = new Button("Cerrar");
		bt3.setOnAction(e -> {
			primaryStage.close();
		});
		
		// Panel
		GridPane panel = new GridPane();
		panel.add(t1, 0, 0);
		panel.add(t2, 0, 1);
		panel.add(usuario, 1, 0);
		panel.add(contraseña, 1, 1);
		panel.add(bt1, 0, 2);
		panel.add(bt2, 1, 2);
		panel.add(bt3, 2, 2);
		
		Insets i = new Insets(10);
		GridPane.setMargin(t1, i);
		GridPane.setMargin(t2, i);
		GridPane.setMargin(usuario, i);
		GridPane.setMargin(contraseña, i);
		GridPane.setMargin(bt1, i);
		GridPane.setMargin(bt2, new Insets(0, 0, 0, 60));
		GridPane.setMargin(bt3, i);
		
		// Escena
		Scene escena = new Scene(panel, 400, 150);
		primaryStage.setScene(escena);
		primaryStage.setTitle("Ejercicio 2");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
