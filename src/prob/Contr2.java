package prob;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Contr2 {
	@FXML
    private ResourceBundle resources;

	@FXML
    private Button back;
	
	@FXML
    private Button pt;
	
    @FXML
    private URL location;
    
    @FXML
    private Button nature;
    
    @FXML
    private Button social;
    
    @FXML
    private Button fire;
    int songNumber;
    private File directory;
    private ArrayList<File> song;
    private Media media;
    private static MediaPlayer mediaPlayer;
    
    public void playMedia(){
		
		mediaPlayer.play();
	}
    public static void pauseMedia(){
		
		mediaPlayer.pause();
	}
    
    @FXML
    void initialize() {
    	song = new ArrayList <File>();
    	directory = new File ("soun");
    	File[] files = directory.listFiles();
    	if (files != null){
    		for (File file : files){
  
				song.add(file);
    		}
    	}
		media = new Media(song.get(songNumber).toURI().toString());
    	mediaPlayer = new MediaPlayer(media);
    	
    	back.setOnAction(event -> {
            try {
            	Stage stage = (Stage) back.getScene().getWindow();
                stage.close();
                new Main().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    	pt.setOnAction(event -> {
            try {
            	Stage stage = (Stage) pt.getScene().getWindow();
                stage.close();
                new emg.pt().start(new Stage());
                
                playMedia();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    	fire.setOnAction(event -> {
            try {
            	Stage stage = (Stage) fire.getScene().getWindow();
                stage.close();
                new fire.Kitchen().start(new Stage());
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
	
    }
    @FXML
    private void openNatural() {
        Natural.openWindow();
    }
    @FXML
    private void social() {
        Social.openWindow();
    }
}