package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException{
			Parent root = FXMLLoader.load(getClass().getResource("KeyLayout.fxml"));
			Scene scene = new Scene(root , 700, 400);
			scene.getStylesheets().add("application/application.css");

			primaryStage.setScene(scene);
			primaryStage.show();
	}

	public static void main(String[] args) {

        launch(args);
	}
}
