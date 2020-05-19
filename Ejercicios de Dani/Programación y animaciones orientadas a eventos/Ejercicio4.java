package application;

import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.text.*;

public class Ejercicio4 extends Application {
	@Override
	public void start(Stage menu) {
		crearMenu(menu);
		menu.show();
	}

	private void crearMenu(Stage menu) {
		// Textos junto a los botones
		Text rect = new Text("1. Crear un rectángulo");
		Text tri = new Text("2. Crear un triángulo");
		Text circ = new Text("3. Crear un círculo");
		Text rom = new Text("4. Crear un rombo");

		// Botones
		Button botonRect = new Button("OK");
		Button botonTri = new Button("OK");
		Button botonCirc = new Button("OK");
		Button botonRom = new Button("OK");
		
		botonRect.setOnAction(new HandlerBotonE4(1, menu));
		botonTri.setOnAction(new HandlerBotonE4(2, menu));
		botonCirc.setOnAction(new HandlerBotonE4(3, menu));
		botonRom.setOnAction(new HandlerBotonE4(4, menu));

		// Crear panel
		GridPane panel = new GridPane();
		panel.add(rect, 0, 0);
		panel.add(botonRect, 1, 0);
		panel.add(tri, 0, 1);
		panel.add(botonTri, 1, 1);
		panel.add(circ, 0, 2);
		panel.add(botonCirc, 1, 2);
		panel.add(rom, 0, 3);
		panel.add(botonRom, 1, 3);
		
		Insets margen = new Insets(10);
		
		GridPane.setMargin(rect, margen);
		GridPane.setMargin(tri, margen);
		GridPane.setMargin(rom, margen);
		GridPane.setMargin(circ, margen);
		
		BorderPane panel2 = new BorderPane();
		Text top = new Text("MENÚ");
		panel2.setTop(top);
		BorderPane.setMargin(top, new Insets(10, 0, 0, 80));
		panel2.setCenter(panel);

		// Crear escena
		Scene escena = new Scene(panel2, 180, 180);
		menu.setScene(escena);
		menu.setTitle("Ejercicio 4");
		menu.setResizable(false);
	}

	public static void main(String[] args) {
		launch(args);
	}
}