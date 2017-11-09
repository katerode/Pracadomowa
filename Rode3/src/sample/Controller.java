package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller {
    public Button button;
    public TextField textField;
    public TableView<String> tableView;
    private ObservableList<String> obsList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        TableColumn<String, String> column = new TableColumn<>("Tekst");
        if (column.getCellValueFactory() == null) {
            column.setCellValueFactory((param) -> new SimpleStringProperty(param.getValue()));
        }
        tableView.getColumns().add(column);
        tableView.setItems(obsList);
    }



    public void onButtonClick() {
        String val = textField.getText();
        tableView.getItems().add(val);
    }
}
