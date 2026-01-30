package emg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import prob.Class2;
import prob.Contr2;

public class ptcontr {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back2;

    @FXML
    private DialogPane dialogue;
    
    @FXML
    private Button close;
    
    @FXML
    private Button sms;
    
    @FXML
    private DialogPane info;
    
    @FXML
    private Label action;
    
    @FXML
    private Button bed;
    
    @FXML
    private DialogPane bedinf;
    
    @FXML
    private Button window;
    
    @FXML
    private DialogPane infwind;
    
    @FXML
    private Button zibratusya;
    
    @FXML
    private Text znakok;
    
    public static Button smsStatic;

    @FXML
    void initialize() {
        sms.setVisible(false);
        sms.setManaged(false);
        
        info.setVisible(false);
        info.setManaged(false);
        info.setMinSize(info.getPrefWidth(), info.getPrefHeight());
        info.setMaxSize(info.getPrefWidth(), info.getPrefHeight());
        
        action.setVisible(false);
        action.setManaged(false);
        
        window.setVisible(false);
        window.setManaged(false);
        
        bed.setVisible(false);
        bed.setManaged(false);
        
        infwind.setVisible(false);
        infwind.setManaged(false);
        
        bedinf.setVisible(false);
        bedinf.setManaged(false);
            
        zibratusya.setVisible(false);
        zibratusya.setManaged(false);
        
        znakok.setVisible(false);
        znakok.setManaged(false);
        
        back2.setOnAction(event -> {
            try {
            	Contr2.pauseMedia();
                Stage stage = (Stage) back2.getScene().getWindow();
                stage.close();
                new Class2().start(new Stage());
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        smsStatic = sms;
        close.setOnAction(event -> {
            dialogue.setVisible(false);
            dialogue.setManaged(false);

            close.setVisible(false);
            close.setManaged(false);

            sms.setVisible(true);
            sms.setManaged(true);
        });
        sms.setOnAction(event -> {
            try {
                Stage alertStage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("alert.fxml"));
                Parent root = loader.load();

                alertStage.setScene(new Scene(root));
                alertStage.show();

                alertStage.setOnHidden(e -> {
                    info.setVisible(true);
                    info.setManaged(true);
                    znakok.setVisible(true);
                    znakok.setManaged(true);
                    action.setVisible(true);
                    action.setManaged(true);
                    window.setVisible(true);
                    window.setManaged(true);
                    bed.setVisible(true);
                    bed.setManaged(true);
                    zibratusya.setVisible(true);
                    zibratusya.setManaged(true);

                    sms.setVisible(false);
                    sms.setManaged(false);
                });

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        
        window.setOnAction(event -> {
        	infwind.setVisible(true);
        	infwind.setManaged(true);       
    });
        bed.setOnAction(event -> {
        	bedinf.setVisible(true);
        	bedinf.setManaged(true); 
        });
        zibratusya.setOnAction(event -> {
            try {
            	Stage stage = (Stage) zibratusya.getScene().getWindow();
                stage.close();
                new emg2.Trval().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        
    }    
}   