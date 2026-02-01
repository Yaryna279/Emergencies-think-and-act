package ring;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Numb extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("Numbers.fxml"));
		primaryStage.setTitle("Telephone");
		primaryStage.setScene(new Scene(root, 400, 300));
		primaryStage.show();		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
