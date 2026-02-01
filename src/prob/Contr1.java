package prob;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Contr1 {
	  @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Button startButton;
	    
	    @FXML
	    private Button finishButton;
	    
	    @FXML
	    void initialize() {
	    	startButton.setOnAction(event -> {
	            try {
	            	Stage stage = (Stage) startButton.getScene().getWindow();
	                stage.close();
	                new Class2().start(new Stage());
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });
	    	
	    }
}
