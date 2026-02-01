package nextfire;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Fire2 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("Fire2.fxml"));
		primaryStage.setTitle("Scene3");
		primaryStage.setScene(new Scene(root, 1020, 762));
		primaryStage.show();		
	}
	public static void main(String[] args) {
		launch(args);
	}
}



