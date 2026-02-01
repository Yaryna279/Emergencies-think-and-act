package finalfire;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Final extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("Final.fxml"));
		primaryStage.setTitle("Final");
		primaryStage.setScene(new Scene(root, 1020, 770));
		primaryStage.show();
		primaryStage.requestFocus();
	}
	public static void main(String[] args) {
		launch(args);
	}
}  