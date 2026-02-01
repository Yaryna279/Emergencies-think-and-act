package emg3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Class3 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("Class3.fxml"));
		primaryStage.setTitle("Scene3");
		primaryStage.setScene(new Scene(root, 1000, 772));
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
