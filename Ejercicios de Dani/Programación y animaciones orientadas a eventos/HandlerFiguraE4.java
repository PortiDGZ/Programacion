package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class HandlerFiguraE4 implements EventHandler<ActionEvent> {

	// Atributos, no se usan todos en una sola figura
	private int tipo;
	private Stage opciones;
	private Stage figura;
	private TextField tf1; // Aquí se guarda el radio en el caso del círculo
	private TextField tf2;
	private TextField tf3; // Solo el triángulo usa este
	private TextField tf4; // Solo el triángulo usa este
	private TextField tf5; // Solo el triángulo usa este
	private TextField tf6; // Solo el triángulo usa este
	private ColorPicker contornoPicker;
	private RadioButton si;
	private ColorPicker rellenoPicker;

	// Constructores, se usa uno u otro dependiendo del tipo de figura

	// Círculo
	public HandlerFiguraE4(int tipo, Stage opciones, TextField radio, ColorPicker contornoPicker, RadioButton si,
			ColorPicker rellenoPicker) {
		super();
		this.tipo = tipo;
		this.opciones = opciones;
		this.tf1 = radio;
		this.contornoPicker = contornoPicker;
		this.si = si;
		this.rellenoPicker = rellenoPicker;
	}

	// Rectángulo y rombo
	public HandlerFiguraE4(int tipo, Stage opciones, TextField base, TextField altura, ColorPicker contornoPicker,
			RadioButton si, ColorPicker rellenoPicker) {
		super();
		this.tipo = tipo;
		this.opciones = opciones;
		tf1 = base;
		tf2 = altura;
		this.contornoPicker = contornoPicker;
		this.si = si;
		this.rellenoPicker = rellenoPicker;
	}

	// Triángulo
	public HandlerFiguraE4(int tipo, Stage opciones, TextField tf1, TextField tf2, TextField tf3, TextField tf4,
			TextField tf5, TextField tf6, ColorPicker contornoPicker, RadioButton si, ColorPicker rellenoPicker) {
		super();
		this.tipo = tipo;
		this.opciones = opciones;
		this.tf1 = tf1;
		this.tf2 = tf2;
		this.tf3 = tf3;
		this.tf4 = tf4;
		this.tf5 = tf5;
		this.tf6 = tf6;
		this.contornoPicker = contornoPicker;
		this.si = si;
		this.rellenoPicker = rellenoPicker;
	}

	// Handle dependiendo de tipo
	@Override
	public void handle(ActionEvent arg0) {
		try {
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

			figura.show();
		} catch (Exception e) {
		}
	}

	// Métodos para crear el Stage
	private void rectangulo() throws Exception {
		// Tratar de obtener parámetros del rectángulo a partir de los datos
		// introducidos en el constructor
		// Puede lanzar excepciones
		double base = Double.parseDouble(this.tf1.getText());
		double altura = Double.parseDouble(this.tf2.getText());
		Color contorno = contornoPicker.getValue();
		Color relleno = rellenoPicker.getValue();
		boolean rellenar = si.isSelected();

		// Si todo va bien, crear el círculo
		Polygon rectangulo = new Polygon(0, 0, 0, altura, base, altura, base, 0);
		rectangulo.setStroke(contorno);
		if (rellenar) {
			rectangulo.setFill(relleno);
		} else {
			rectangulo.setFill(new Color(1, 1, 1, 0.1));
		}

		// Crear botón para volver
		Button volver = new Button("Atrás");
		volver.setOnAction(e -> {
			figura.close();
			opciones.show();
		});

		// Crear panel
		BorderPane panel = new BorderPane();

		panel.setCenter(rectangulo);
		panel.setBottom(volver);

		// Crear escena
		Scene escena = new Scene(panel, 500, 500);

		// Crear stage
		figura = new Stage();
		figura.setTitle("Rectángulo");
		figura.setScene(escena);
		figura.show();
	}

	private void triangulo() throws Exception {
		// Tratar de obtener parámetros del triángulo a partir de los datos
		// introducidos en el constructor
		// Puede lanzar excepciones
		double x1 = Double.parseDouble(this.tf1.getText());
		double y1 = Double.parseDouble(this.tf2.getText());
		double x2 = Double.parseDouble(this.tf3.getText());
		double y2 = Double.parseDouble(this.tf4.getText());
		double x3 = Double.parseDouble(this.tf5.getText());
		double y3 = Double.parseDouble(this.tf6.getText());
		Color contorno = contornoPicker.getValue();
		Color relleno = rellenoPicker.getValue();
		boolean rellenar = si.isSelected();

		// Si todo va bien, crear el círculo
		Polygon triangulo = new Polygon(x1, y1, x2, y2, x3, y3);
		triangulo.setStroke(contorno);
		if (rellenar) {
			triangulo.setFill(relleno);
		} else {
			triangulo.setFill(new Color(1, 1, 1, 0.1));
		}

		// Crear botón para volver
		Button volver = new Button("Atrás");
		volver.setOnAction(e -> {
			figura.close();
			opciones.show();
		});

		// Crear panel
		BorderPane panel = new BorderPane();

		panel.setCenter(triangulo);
		panel.setBottom(volver);

		// Crear escena
		Scene escena = new Scene(panel, 500, 500);

		// Crear stage
		figura = new Stage();
		figura.setTitle("Triángulo");
		figura.setScene(escena);
		figura.show();
	}

	private void circulo() throws Exception {
		// Tratar de obtener parámetros del círculo a partir de los datos introducidos
		// en el constructor
		// Puede lanzar excepciones
		double radio = Double.parseDouble(this.tf1.getText());
		Color contorno = contornoPicker.getValue();
		Color relleno = rellenoPicker.getValue();
		boolean rellenar = si.isSelected();

		// Si todo va bien, crear el círculo
		Circle circulo = new Circle(radio);
		circulo.setStroke(contorno);
		if (rellenar) {
			circulo.setFill(relleno);
		} else {
			circulo.setFill(new Color(1, 1, 1, 0.1));
		}

		// Crear botón para volver
		Button volver = new Button("Atrás");
		volver.setOnAction(e -> {
			figura.close();
			opciones.show();
		});

		// Crear panel
		BorderPane panel = new BorderPane();

		panel.setCenter(circulo);
		panel.setBottom(volver);

		// Crear escena
		Scene escena = new Scene(panel, 500, 500);

		// Crear stage
		figura = new Stage();
		figura.setTitle("Círculo");
		figura.setScene(escena);
		figura.show();
	}

	private void rombo() throws Exception {
		// Tratar de obtener parámetros del rombo a partir de los datos
		// introducidos en el constructor
		// Puede lanzar excepciones
		double dMayor = Double.parseDouble(this.tf1.getText());
		double dMenor = Double.parseDouble(this.tf2.getText());
		
		if (dMayor < dMenor) {
			// Intercambiarlos si el tamaño es el inverso
			double aux = dMayor;
			dMayor = dMenor;
			dMenor = aux;
		}
		
		Color contorno = contornoPicker.getValue();
		Color relleno = rellenoPicker.getValue();
		boolean rellenar = si.isSelected();

		// Si todo va bien, crear el círculo
		Polygon rombo = new Polygon(dMenor / 2, 0, dMenor, dMayor / 2, dMenor / 2, dMayor, 0, dMayor / 2);
		rombo.setStroke(contorno);
		if (rellenar) {
			rombo.setFill(relleno);
		} else {
			rombo.setFill(new Color(1, 1, 1, 0.1));
		}

		// Crear botón para volver
		Button volver = new Button("Atrás");
		volver.setOnAction(e -> {
			figura.close();
			opciones.show();
		});

		// Crear panel
		BorderPane panel = new BorderPane();

		panel.setCenter(rombo);
		panel.setBottom(volver);

		// Crear escena
		Scene escena = new Scene(panel, 500, 500);

		// Crear stage
		figura = new Stage();
		figura.setTitle("Rombo");
		figura.setScene(escena);
		figura.show();
	}

}
