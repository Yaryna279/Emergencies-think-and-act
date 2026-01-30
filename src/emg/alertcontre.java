package emg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class alertcontre {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Sphere clos;

    @FXML
    void initialize() {
    	 clos.setOnMouseClicked(event -> {
             Stage stage = (Stage) clos.getScene().getWindow();
             stage.close();
             
             if (ptcontr.smsStatic != null) {
                 ptcontr.smsStatic.setVisible(false);
                 ptcontr.smsStatic.setManaged(false);
             }
         });
	}
}