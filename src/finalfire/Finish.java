package finalfire;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Finish {

    public static void show(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Finish.class.getResource("Finish.fxml"));
        stage.setTitle("Finish");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }
}