package application;

import java.util.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class HandlerE6 implements EventHandler<ActionEvent> {

	// Atributos
	private Text puntosText;
	private int puntos;
	private StackPane panel;
	private ArrayList<ImageView> flechas = new ArrayList<ImageView>();
	private static final int FRAMESENTREFLECHAS = 40;
	private static final int VELOCIDADFLECHAS = 3;
	private int frames = FRAMESENTREFLECHAS / 2;
	private static Random rand = new Random();
	private int tecla;
	private int estadoContador;

	// Constructor
	public HandlerE6(Text puntos, StackPane panel) {
		super();
		puntosText = puntos;
		this.panel = panel;
	}

	// Image
	private Image arriba = new Image(getClass().getResource("flecha t.png").toExternalForm());
	private Image derecha = new Image(getClass().getResource("flecha d.png").toExternalForm());
	private Image izquierda = new Image(getClass().getResource("flecha i.png").toExternalForm());
	private Image abajo = new Image(getClass().getResource("flecha b.png").toExternalForm());
	private Image bien = new Image(getClass().getResource("bien.png").toExternalForm());
	private Image mal = new Image(getClass().getResource("mal.png").toExternalForm());
	
	private ImageView estado = new ImageView();
	
	// Handle
	@Override
	public void handle(ActionEvent arg0) {
		puntosText.setText("Puntos: " + puntos);
		
		if (frames == FRAMESENTREFLECHAS) {
			ImageView flecha = new ImageView();
			
			switch (rand.nextInt(4)) {
			case 0:
				flecha.setImage(arriba);
				break;
			case 1:
				flecha.setImage(derecha);
				break;
			case 2:
				flecha.setImage(izquierda);
				break;
			case 3:
				flecha.setImage(abajo);
				break;
			}
			
			flechas.add(flecha);
			panel.getChildren().add(flecha);
			flecha.setTranslateY(-230);
			frames = 0;
		}
		
		frames++;
		
		ArrayList<ImageView> flechasAEliminar = new ArrayList<ImageView>();
		
		for(ImageView flecha : flechas) {
			flecha.setTranslateY(flecha.getTranslateY() + VELOCIDADFLECHAS);
			
			if(flecha.getTranslateY() > 150) {
				flechasAEliminar.add(flecha);
				panel.getChildren().remove(flecha);
				puntos -= 100;
				estado.setImage(mal);
				mostrarEstado();
			} else if (flechaAceptada(flecha)) {
				flechasAEliminar.add(flecha);
				panel.getChildren().remove(flecha);
				puntos += 100;
				estado.setImage(bien);
				mostrarEstado();
			}
		}
		
		flechas.removeAll(flechasAEliminar);
		tecla = 0;
		
		estadoContador--;
		if (estadoContador == 0) {
			panel.getChildren().remove(estado);
		}
	}

	private void mostrarEstado() {
		if (!panel.getChildren().contains(estado)) {
			panel.getChildren().add(estado);
		}
		estado.setTranslateX(70);
		estado.setTranslateY(120);
		estadoContador = 20;
	}

	// Comprobar si el jugador ha pulsado la flecha
	private boolean flechaAceptada(ImageView flecha) {
		return flecha.getTranslateY() > 90 && 
				((tecla == 1 && flecha.getImage() == arriba) ||
				(tecla == 2 && flecha.getImage() == abajo) ||
				(tecla == 3 && flecha.getImage() == izquierda) ||
				(tecla == 4 && flecha.getImage() == derecha));
	}

	// Setters
	public void setTecla(int i) {
		tecla = i;
	}

}
