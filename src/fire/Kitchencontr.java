package fire;

import java.io.File;
import java.util.ArrayList;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import prob.Class2;

public class Kitchencontr {
	
	@FXML
    private Label action;
	
	@FXML
    private Button back3;

    @FXML
    private Button call;

    @FXML
    private Button close;

    @FXML
    private ImageView fire1;

    @FXML
    private ImageView fire2;

    @FXML
    private DialogPane info;

    @FXML
    private Button off;

    @FXML
    private Button panic;

    @FXML
    private DialogPane panicinf;

    @FXML
    private DialogPane truevar;

    @FXML
    private Button water;

    @FXML
    private DialogPane waterinf;
    
    @FXML
    private Text znak;
    
    @FXML
    private DialogPane panicinf1;
    
    @FXML
    private DialogPane infvoda;
    int songNumber;
    private File directory;
    private ArrayList<File> song;
    private Media media;
    private static MediaPlayer mediaPlayer;
    
    public static void playMedia2(){
		
		mediaPlayer.play();
	}
    public static void pauseMedia2(){
		
		mediaPlayer.pause();
	}
    @FXML
    void initialize() {
    	song = new ArrayList <File>();
    	directory = new File ("firesond");
    	File[] files = directory.listFiles();
    	if (files != null){
    		for (File file : files){
  
				song.add(file);
    		}
    	}
		media = new Media(song.get(songNumber).toURI().toString());
    	mediaPlayer = new MediaPlayer(media);
    	
    	panic.setVisible(false);
        panic.setManaged(false);
        
        water.setVisible(false);
        water.setManaged(false);
        
        off.setVisible(false);
        off.setManaged(false);
        
        call.setVisible(false);
        call.setManaged(false);
        
        action.setVisible(false);
        action.setManaged(false);
        
        panicinf1.setVisible(false);
        panicinf1.setManaged(false);
        
        znak.setVisible(false);
        znak.setManaged(false);
        
        infvoda.setVisible(false);
        infvoda.setManaged(false);
        
    	back3.setOnAction(event -> {
            try {
                Stage stage = (Stage) back3.getScene().getWindow();
                stage.close();
                new Class2().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    	info.setVisible(true);
        info.setManaged(true);
        
        close.setVisible(true);
        close.setManaged(true);
        
        fire1.setVisible(false);
        fire2.setVisible(false);
        
    	close.setOnAction(event -> {
            info.setVisible(false);
            info.setManaged(false);

            close.setVisible(false);
            close.setManaged(false);
            
            playMedia2();
            
            panic.setVisible(true);
            panic.setManaged(true);
            
            water.setVisible(true);
            water.setManaged(true);
            
            off.setVisible(true);
            off.setManaged(true);
            
            action.setVisible(true);
            action.setManaged(true);
            
            fire1.setVisible(true);
            fire2.setVisible(false);
            

            Timeline t = new Timeline(
                new KeyFrame(Duration.seconds(0.2), e -> {
                    fire1.setVisible(!fire1.isVisible());
                    fire2.setVisible(!fire2.isVisible());
                })
            );

            t.setCycleCount(Timeline.INDEFINITE);
            t.play();   	
        
        });
    	
        panicinf.setVisible(false);
        panicinf.setManaged(false);
        
        panic.setOnAction(event -> {
        	panicinf.setVisible(true);
        	panicinf.setManaged(true);
        	
        	panicinf1.setVisible(true);
            panicinf1.setManaged(true);
            
            znak.setVisible(true);
            znak.setManaged(true);
    });
        
        waterinf.setVisible(false);
        waterinf.setManaged(false);
        
        water.setOnAction(event -> {
        	waterinf.setVisible(true);
        	waterinf.setManaged(true);
        	
        	infvoda.setVisible(true);
            infvoda.setManaged(true);
    });
        
        truevar.setVisible(false);
        truevar.setManaged(false);
        
        off.setOnAction(event -> {
        	truevar.setVisible(true);
        	truevar.setManaged(true);    
        	
        	call.setVisible(true);
        	call.setManaged(true);
    });
    
    
    call.setOnAction(event -> {
        try {
        	Stage stage = (Stage) call.getScene().getWindow();
            stage.close();
            pauseMedia2();
            new ring.Call().start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    });
    	
    }

}