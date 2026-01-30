package emg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class alert extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("Alert.fxml"));
		primaryStage.setTitle("Alert");
		primaryStage.setScene(new Scene(root, 334, 512));
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);

	}
}


