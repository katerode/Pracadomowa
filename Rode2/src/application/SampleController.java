package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SampleController implements Initializable {

	ToggleGroup toggleGroup = new ToggleGroup();

	@FXML
	private RadioButton rb1;
	@FXML
	private RadioButton rb2;
	@FXML
	private RadioButton rb3;
	@FXML
	private TextField textField;

	@FXML
	private void ustaw() {
		if (rb1.isSelected()) {
			textField.setText(rb1.getText());
		} else if (rb2.isSelected()) {
			textField.setText(rb2.getText());
		} else if (rb3.isSelected()) {
			textField.setText(rb3.getText());
		} else {
			System.out.println("Zaznacz któryś przycisk.");
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		rb1.setToggleGroup(toggleGroup);
		rb2.setToggleGroup(toggleGroup);
		rb3.setToggleGroup(toggleGroup);
	}

}
