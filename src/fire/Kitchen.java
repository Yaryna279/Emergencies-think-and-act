package fire;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Kitchen extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("Kitchen.fxml"));
		primaryStage.setTitle("Scene1");
		primaryStage.setScene(new Scene(root, 1020, 772));
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
