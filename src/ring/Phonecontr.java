package ring;

import java.net.URL;
import java.util.ResourceBundle;

import fire.Kitchencontr;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Phonecontr {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button b0;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private Button b8;

    @FXML
    private Button b9;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;
    
    @FXML
    private Button call;

    @FXML
    private Button close;
    
    @FXML
    private Button numbers;
    
    private int step = 1;
    
    @FXML
    void initialize() {
    	
    	numbers.setOnAction(event -> {
            try {
            	Stage stage = (Stage) numbers.getScene().getWindow();
                stage.close();
                new Numb().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    
    	close.setOnAction(event -> clearAll());
    	
    	call.setOnAction(event -> {
    	    String code = l1.getText() + l2.getText() + l3.getText();

    	    try {
    	        Stage stage = (Stage) call.getScene().getWindow();
    	        stage.close();
    	        if (code.equals("101")) {
    	            new nextfire.Fire2().start(new Stage());
    	            Kitchencontr.playMedia2(); 
    	        } else {
    	            new nextfire.Wrong().start(new Stage());
    	        }

    	    } catch (Exception e) {
    	        e.printStackTrace();
    	    }
    	});
    }
    @FXML
    void press(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String number = btn.getText();

        if (step == 1) {
            l1.setText(number);
            step++;
        } else if (step == 2) {
            l2.setText(number);
            step++;
        } else if (step == 3) {
            l3.setText(number);
        }
    }
    private void clearAll() {
        l1.setText("");
        l2.setText("");
        l3.setText("");
        step = 1;
    }
}