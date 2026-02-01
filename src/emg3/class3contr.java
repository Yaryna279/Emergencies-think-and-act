package emg3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class class3contr {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DialogPane info;

    @FXML
    private Label labellift;

    @FXML
    private Button ok;
    
    @FXML
    private Button lift;

    @FXML
    private Button shodu;
    
    @FXML
    private Button stop;
    
    @FXML
    private DialogPane truevar;
    
    @FXML
    private DialogPane liftinfo;
    
    @FXML
    private DialogPane stopinfo;
    
    @FXML
    private Button next;
    
    @FXML
    void initialize() {
    	stop.setVisible(false);
    	stop.setManaged(false);
    	shodu.setVisible(false);
    	shodu.setManaged(false);
    	lift.setVisible(false);
    	lift.setManaged(false);
    	liftinfo.setVisible(false);
        liftinfo.setManaged(false);
        stopinfo.setVisible(false);
        stopinfo.setManaged(false);
        truevar.setVisible(false);
        truevar.setManaged(false);        
        next.setVisible(false);
        next.setManaged(false);
        
    	ok.setOnAction(event -> {
            info.setVisible(false);
            info.setManaged(false);
            
            ok.setVisible(false);
            ok.setManaged(false);
            
            stop.setVisible(true);
        	stop.setManaged(true);
        	shodu.setVisible(true);
        	shodu.setManaged(true);
        	lift.setVisible(true);
        	lift.setManaged(true);
            
    	});
    	
    	lift.setOnAction(event -> {
            liftinfo.setVisible(true);
            liftinfo.setManaged(true);
    	});
    	stop.setOnAction(event -> {
            stopinfo.setVisible(true);
            stopinfo.setManaged(true);
    	});
    	
    	shodu.setOnAction(event -> {
            truevar.setVisible(true);
            truevar.setManaged(true);
            
            next.setVisible(true);
            next.setManaged(true);
            
            
    	});
    	
    	next.setOnAction(event -> {
            try {
            	Stage stage = (Stage) next.getScene().getWindow();
                stage.close();
                new finaltr.Class4().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    	
    }

}