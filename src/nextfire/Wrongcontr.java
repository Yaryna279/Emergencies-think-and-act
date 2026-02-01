package nextfire;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import ring.Call;

public class Wrongcontr {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ret;

    @FXML
    void initialize() {
    	ret.setOnAction(event -> {
            try {
            	Stage stage = (Stage) ret.getScene().getWindow();
                stage.close();
                new Call().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }

}
