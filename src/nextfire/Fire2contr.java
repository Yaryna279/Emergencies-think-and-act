package nextfire;

import java.net.URL;
import java.util.ResourceBundle;

import finalfire.Final;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Fire2contr {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button exit;

    @FXML
    private ImageView fire1;

    @FXML
    private ImageView fire2;

    @FXML
    private Button how;
    
    @FXML
    private DialogPane inf;
    
    @FXML
    void initialize() {
    	inf.setVisible(false);
        inf.setManaged(false);
    	
    	how.setOnAction(event -> {
        	inf.setVisible(true);
        	inf.setManaged(true);       
    });
    	
    	fire1.setVisible(true);
        fire2.setVisible(false);
        
    	Timeline t = new Timeline(
                new KeyFrame(Duration.seconds(0.17), e -> {
                    fire1.setVisible(!fire1.isVisible());
                    fire2.setVisible(!fire2.isVisible());
                })
            );

            t.setCycleCount(Timeline.INDEFINITE);
            t.play();   	
            
            exit.setOnAction(event -> {
                try {
                	Stage stage = (Stage) exit.getScene().getWindow();
                    stage.close();
                    new Final().start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
    }

}
