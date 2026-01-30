package emg2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class trvalcontr {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox ch1;

    @FXML
    private CheckBox ch2;

    @FXML
    private CheckBox ch3;

    @FXML
    private CheckBox ch4;

    @FXML
    private CheckBox ch5;

    @FXML
    private CheckBox ch6;

    @FXML
    private CheckBox ch7;

    @FXML
    private CheckBox ch8;

    @FXML
    private CheckBox ch9;
    
    @FXML
    private CheckBox ch11;
    
    @FXML
    private CheckBox ch111;
    
    @FXML
    private CheckBox ch1111;
    
    @FXML
    private Button next;
    
    @FXML
    void initialize() {
    	next.setVisible(false);
    	next.setOnAction(event -> {
            try {
            	Stage stage = (Stage) next.getScene().getWindow();
                stage.close();
                new emg3.Class3().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
    @FXML
    void check() {
        if (ch1.isSelected() && ch2.isSelected() && ch3.isSelected()
                && ch4.isSelected() && ch5.isSelected()
                && ch6.isSelected() && ch7.isSelected()
                && ch8.isSelected() && ch9.isSelected()
                && !ch11.isSelected() && !ch111.isSelected() && !ch1111.isSelected())
        {

            next.setVisible(true);
        } else {
            next.setVisible(false);
        }
    }

}
