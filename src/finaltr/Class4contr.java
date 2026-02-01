package finaltr;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import prob.Class2;
import prob.Contr2;

public class Class4contr {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button menu;

    @FXML
    void initialize() {
    	menu.setOnAction(event -> {
            try {
            	Contr2.pauseMedia();
                Stage stage = (Stage) menu.getScene().getWindow();
                stage.close();
                new Class2().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }

}

