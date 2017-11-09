package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	private static Stage primaryStage;
	private static BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		Main.primaryStage = primaryStage;
		Main.primaryStage.setTitle("Rode App 2");
		setMainLayout();

	}

	private void setMainLayout() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Sample.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		Main.primaryStage.setScene(scene);
		Main.primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
