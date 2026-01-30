package ring;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Call extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("Phone.fxml"));
		primaryStage.setTitle("Phone");
		primaryStage.setScene(new Scene(root, 400, 600));
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
