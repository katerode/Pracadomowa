package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	private TextField pierwszePoleTekstowe;
	@FXML
	private TextField drugiePoleTekstowe;
	@FXML
	private Label sklejonaWartosc;

	@FXML
	private void sklej() {
		sklejonaWartosc.setText(pierwszePoleTekstowe.getText() + drugiePoleTekstowe.getText());
	}

}
