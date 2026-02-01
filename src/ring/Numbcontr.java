package ring;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Numbcontr {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back;

    @FXML
    void initialize() {
        back.setOnAction(event -> {
            try {
            	Stage stage = (Stage) back.getScene().getWindow();
                stage.close();
                new Call().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }

}
