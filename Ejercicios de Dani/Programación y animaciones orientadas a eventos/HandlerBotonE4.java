package application;

import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class HandlerBotonE4 implements EventHandler<ActionEvent> {

	// Atributos
	private int tipo;
	private Stage menu;
	private Stage opciones;

	// Handle dependiendo de tipo
	@Override
	public void handle(ActionEvent arg0) {
		menu.close();

		switch (tipo) {
		case 1:
			rectangulo();
			break;
		case 2:
			triangulo();
			break;
		case 3:
			circulo();
			break;
		case 4:
			rombo();
			break;
		}

		opciones.show();
	}

	// Constructor
	public HandlerBotonE4(int tipo, Stage menu) {
		super();
		this.tipo = tipo;
		this.menu = menu;
	}

	// Métodos para crear el Stage
	private void rombo() {
		// Crear stage
		opciones = new Stage();
		opciones.setTitle("Rombo");
		opciones.setResizable(false);

		// Crear textos
		Text t1 = new Text("Ingrese la diagonal mayor");
		Text t2 = new Text("Ingrese la diagonal menor");
		Text t3 = new Text("Ingrese el color de línea");
		Text t4 = new Text("¿Desea relleno?");
		Text t5 = new Text("Ingrese el color");

		// Crear textfield para base y altura
		TextField dMayor = new TextField();
		TextField dMenor = new TextField();

		// Crear RadioButtons para confirmar relleno
		ToggleGroup confirmarRelleno = new ToggleGroup();

		RadioButton si = new RadioButton("SÍ");
		si.fire();
		RadioButton no = new RadioButton("NO");

		si.setToggleGroup(confirmarRelleno);
		no.setToggleGroup(confirmarRelleno);

		// Crear colorpicker para el contorno y el relleno
		ColorPicker contornoPicker = new ColorPicker();
		contornoPicker.setValue(Color.WHITE);

		ColorPicker rellenoPicker = new ColorPicker();
		rellenoPicker.setValue(Color.WHITE);

		// Crear botones para avanzar o retroceder
		Button avanzar = new Button("Mostrar figura");
		avanzar.setOnAction(new HandlerFiguraE4(tipo, opciones, dMayor, dMenor, contornoPicker, si, rellenoPicker));

		Button retroceder = new Button("Cancelar y volver");
		retroceder.setOnAction(e -> {
			opciones.close();
			menu.show();
		});

		// Crear panel
		GridPane panel = new GridPane();

		panel.add(t1, 0, 0);
		panel.add(dMayor, 1, 0);
		panel.add(t2, 0, 1);
		panel.add(dMenor, 1, 1);
		panel.add(t3, 0, 2);
		panel.add(contornoPicker, 1, 2);
		panel.add(t4, 0, 3);
		panel.add(si, 1, 3);
		panel.add(no, 2, 3);
		panel.add(t5, 0, 4);
		panel.add(rellenoPicker, 1, 4);
		panel.add(avanzar, 0, 5);
		panel.add(retroceder, 1, 5);

		Insets margen = new Insets(10);

		GridPane.setMargin(t1, margen);
		GridPane.setMargin(dMayor, margen);
		GridPane.setMargin(dMenor, margen);
		GridPane.setMargin(t2, margen);
		GridPane.setMargin(contornoPicker, margen);
		GridPane.setMargin(t3, margen);
		GridPane.setMargin(si, margen);
		GridPane.setMargin(no, margen);
		GridPane.setMargin(t4, margen);
		GridPane.setMargin(t5, margen);
		GridPane.setMargin(rellenoPicker, margen);
		GridPane.setMargin(avanzar, margen);
		GridPane.setMargin(retroceder, margen);

		// Crear escena
		Scene escena = new Scene(panel, 450, 270);
		opciones.setScene(escena);
	}

	private void circulo() {
		// Crear stage
		opciones = new Stage();
		opciones.setTitle("Círculo");
		opciones.setResizable(false);

		// Crear textos
		Text t1 = new Text("Ingrese el radio");
		Text t2 = new Text("Ingrese el color de línea");
		Text t3 = new Text("¿Desea relleno?");
		Text t4 = new Text("Ingrese el color");

		// Crear textfield para el radio
		TextField radio = new TextField();

		// Crear RadioButtons para confirmar relleno
		ToggleGroup confirmarRelleno = new ToggleGroup();

		RadioButton si = new RadioButton("SÍ");
		si.fire();
		RadioButton no = new RadioButton("NO");

		si.setToggleGroup(confirmarRelleno);
		no.setToggleGroup(confirmarRelleno);

		// Crear colorpicker para el contorno y el relleno
		ColorPicker contornoPicker = new ColorPicker();
		contornoPicker.setValue(Color.WHITE);

		ColorPicker rellenoPicker = new ColorPicker();
		rellenoPicker.setValue(Color.WHITE);

		// Crear botones para avanzar o retroceder
		Button avanzar = new Button("Mostrar figura");
		avanzar.setOnAction(new HandlerFiguraE4(tipo, opciones, radio, contornoPicker, si, rellenoPicker));

		Button retroceder = new Button("Cancelar y volver");
		retroceder.setOnAction(e -> {
			opciones.close();
			menu.show();
		});

		// Crear panel
		GridPane panel = new GridPane();

		panel.add(t1, 0, 0);
		panel.add(radio, 1, 0);
		panel.add(t2, 0, 1);
		panel.add(contornoPicker, 1, 1);
		panel.add(t3, 0, 2);
		panel.add(si, 1, 2);
		panel.add(no, 2, 2);
		panel.add(t4, 0, 3);
		panel.add(rellenoPicker, 1, 3);
		panel.add(avanzar, 0, 4);
		panel.add(retroceder, 1, 4);

		Insets margen = new Insets(10);

		GridPane.setMargin(t1, margen);
		GridPane.setMargin(radio, margen);
		GridPane.setMargin(t2, margen);
		GridPane.setMargin(contornoPicker, margen);
		GridPane.setMargin(t3, margen);
		GridPane.setMargin(si, margen);
		GridPane.setMargin(no, margen);
		GridPane.setMargin(t4, margen);
		GridPane.setMargin(rellenoPicker, margen);
		GridPane.setMargin(avanzar, margen);
		GridPane.setMargin(retroceder, margen);

		// Crear escena
		Scene escena = new Scene(panel, 450, 270);
		opciones.setScene(escena);
	}

	private void triangulo() {
		// Crear stage
		opciones = new Stage();
		opciones.setTitle("Triángulo");
		opciones.setResizable(false);

		// Crear textos
		Text t1 = new Text("Ingrese coordenada 1");
		Text t2 = new Text("Ingrese coordenada 2");
		Text t3 = new Text("Ingrese coordenada 3");
		Text t4 = new Text("Ingrese el color de línea");
		Text t5 = new Text("¿Desea relleno?");
		Text t6 = new Text("Ingrese el color");

		// Crear textfield para base y altura
		TextField x1 = new TextField();
		TextField y1 = new TextField();
		TextField x2 = new TextField();
		TextField y2 = new TextField();
		TextField x3 = new TextField();
		TextField y3 = new TextField();

		// Crear RadioButtons para confirmar relleno
		ToggleGroup confirmarRelleno = new ToggleGroup();

		RadioButton si = new RadioButton("SÍ");
		si.fire();
		RadioButton no = new RadioButton("NO");

		si.setToggleGroup(confirmarRelleno);
		no.setToggleGroup(confirmarRelleno);

		// Crear colorpicker para el contorno y el relleno
		ColorPicker contornoPicker = new ColorPicker();
		contornoPicker.setValue(Color.WHITE);

		ColorPicker rellenoPicker = new ColorPicker();
		rellenoPicker.setValue(Color.WHITE);

		// Crear botones para avanzar o retroceder
		Button avanzar = new Button("Mostrar figura");
		avanzar.setOnAction(
				new HandlerFiguraE4(tipo, opciones, x1, y1, x2, y2, x3, y3, contornoPicker, si, rellenoPicker));

		Button retroceder = new Button("Cancelar y volver");
		retroceder.setOnAction(e -> {
			opciones.close();
			menu.show();
		});

		// Crear panel
		GridPane panel = new GridPane();

		panel.add(t1, 0, 0);
		panel.add(x1, 1, 0);
		panel.add(y1, 2, 0);
		panel.add(t2, 0, 1);
		panel.add(x2, 1, 1);
		panel.add(y2, 2, 1);
		panel.add(t3, 0, 2);
		panel.add(x3, 1, 2);
		panel.add(y3, 2, 2);
		panel.add(t4, 0, 3);
		panel.add(contornoPicker, 1, 3);
		panel.add(t5, 0, 4);
		panel.add(si, 1, 4);
		panel.add(no, 2, 4);
		panel.add(t6, 0, 5);
		panel.add(rellenoPicker, 1, 5);
		panel.add(avanzar, 0, 6);
		panel.add(retroceder, 1, 6);

		Insets margen = new Insets(10);

		GridPane.setMargin(t1, margen);
		GridPane.setMargin(t2, margen);
		GridPane.setMargin(contornoPicker, margen);
		GridPane.setMargin(t3, margen);
		GridPane.setMargin(si, margen);
		GridPane.setMargin(no, margen);
		GridPane.setMargin(t4, margen);
		GridPane.setMargin(t5, margen);
		GridPane.setMargin(t6, margen);
		GridPane.setMargin(rellenoPicker, margen);
		GridPane.setMargin(avanzar, margen);
		GridPane.setMargin(retroceder, margen);
		GridPane.setMargin(x1, margen);
		GridPane.setMargin(x2, margen);
		GridPane.setMargin(x3, margen);
		GridPane.setMargin(y1, margen);
		GridPane.setMargin(y2, margen);
		GridPane.setMargin(y3, margen);

		// Crear escena
		Scene escena = new Scene(panel, 450, 350);
		opciones.setScene(escena);
	}

	private void rectangulo() {
		// Crear stage
		opciones = new Stage();
		opciones.setTitle("Rectángulo");
		opciones.setResizable(false);

		// Crear textos
		Text t1 = new Text("Ingrese la base");
		Text t2 = new Text("Ingrese la altura");
		Text t3 = new Text("Ingrese el color de línea");
		Text t4 = new Text("¿Desea relleno?");
		Text t5 = new Text("Ingrese el color");

		// Crear textfield para base y altura
		TextField base = new TextField();
		TextField altura = new TextField();

		// Crear RadioButtons para confirmar relleno
		ToggleGroup confirmarRelleno = new ToggleGroup();

		RadioButton si = new RadioButton("SÍ");
		si.fire();
		RadioButton no = new RadioButton("NO");

		si.setToggleGroup(confirmarRelleno);
		no.setToggleGroup(confirmarRelleno);

		// Crear colorpicker para el contorno y el relleno
		ColorPicker contornoPicker = new ColorPicker();
		contornoPicker.setValue(Color.WHITE);

		ColorPicker rellenoPicker = new ColorPicker();
		rellenoPicker.setValue(Color.WHITE);

		// Crear botones para avanzar o retroceder
		Button avanzar = new Button("Mostrar figura");
		avanzar.setOnAction(new HandlerFiguraE4(tipo, opciones, base, altura, contornoPicker, si, rellenoPicker));

		Button retroceder = new Button("Cancelar y volver");
		retroceder.setOnAction(e -> {
			opciones.close();
			menu.show();
		});

		// Crear panel
		GridPane panel = new GridPane();

		panel.add(t1, 0, 0);
		panel.add(base, 1, 0);
		panel.add(t2, 0, 1);
		panel.add(altura, 1, 1);
		panel.add(t3, 0, 2);
		panel.add(contornoPicker, 1, 2);
		panel.add(t4, 0, 3);
		panel.add(si, 1, 3);
		panel.add(no, 2, 3);
		panel.add(t5, 0, 4);
		panel.add(rellenoPicker, 1, 4);
		panel.add(avanzar, 0, 5);
		panel.add(retroceder, 1, 5);

		Insets margen = new Insets(10);

		GridPane.setMargin(t1, margen);
		GridPane.setMargin(base, margen);
		GridPane.setMargin(altura, margen);
		GridPane.setMargin(t2, margen);
		GridPane.setMargin(contornoPicker, margen);
		GridPane.setMargin(t3, margen);
		GridPane.setMargin(si, margen);
		GridPane.setMargin(no, margen);
		GridPane.setMargin(t4, margen);
		GridPane.setMargin(t5, margen);
		GridPane.setMargin(rellenoPicker, margen);
		GridPane.setMargin(avanzar, margen);
		GridPane.setMargin(retroceder, margen);

		// Crear escena
		Scene escena = new Scene(panel, 450, 270);
		opciones.setScene(escena);
	}

}
