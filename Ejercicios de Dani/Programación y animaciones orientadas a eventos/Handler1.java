package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Handler1 implements EventHandler<ActionEvent> {

	private TextField tf1;
	private TextField tf2;
	private Text suma;
	
	public Handler1(TextField t1, TextField t2, Text texto) {
		tf1 = t1;
		tf2 = t2;
		suma = texto;
	}

	@Override
	public void handle(ActionEvent arg0) {
		try {
			int n = Integer.parseInt(tf1.getCharacters().toString()) + Integer.parseInt(tf2.getCharacters().toString());
			suma.setText(Integer.toString(n));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
