package finalfire;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;

public class Finalcontr {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView person1;

    private Image standImage;
    private Image goImage;
    private Image crawlImage;

    private Timeline animation;
    private boolean toggle = false;

    private boolean moving = false;
    private boolean downPressed = false;
    private boolean rightPressed = false;

    @FXML
    void initialize() {

        standImage = person1.getImage();
        goImage = new Image(getClass().getResource("person_go.png").toExternalForm());
        crawlImage = new Image(getClass().getResource("person_crawl.png").toExternalForm());

        animation = new Timeline(new KeyFrame(Duration.millis(300), e -> {
            if (moving && rightPressed) {
                
                person1.setImage(downPressed ? crawlImage : (toggle ? standImage : goImage));
                toggle = !toggle;
            }
        }));
        animation.setCycleCount(Timeline.INDEFINITE);

       
        person1.sceneProperty().addListener((obs, oldScene, newScene) -> {
            if (newScene != null) {
                newScene.setOnKeyPressed(this::keyPressed);
                newScene.setOnKeyReleased(this::keyReleased);
            }
        });
    }

    private void keyPressed(KeyEvent e) {
        if (e.getCode() == KeyCode.RIGHT) rightPressed = true;
        if (e.getCode() == KeyCode.DOWN) downPressed = true;

        
        if (rightPressed) {
            if (!moving) {
                moving = true;
                animation.play();
            }
            person1.setLayoutX(person1.getLayoutX() + 4);
        }

       
        if (downPressed && !rightPressed) {
            person1.setImage(crawlImage);
        }
    }

    private void keyReleased(KeyEvent e) {
        if (e.getCode() == KeyCode.RIGHT) rightPressed = false;
        if (e.getCode() == KeyCode.DOWN) downPressed = false;

        if (!rightPressed) {
            moving = false;
            animation.stop();
        }
        
        if (!rightPressed && !downPressed) {
            person1.setImage(standImage);
        } 
        
        else if (rightPressed) {
            person1.setImage(toggle ? standImage : goImage);
        }
        
        else if (downPressed) {
            person1.setImage(crawlImage);
        }
    }
}