package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Administrator {

	Main mainObj=new Main();
	Mysql sqlObj=new Mysql();
    @FXML
    private Button newCand;

    @FXML
    private Button newParty;

    @FXML
    private Button result;

    @FXML
    private Button perc;
    
    
    @FXML
    private Button back;

    @FXML
    void goback(MouseEvent event) throws IOException {
    	mainObj.changeScene("welcome.fxml");
    }


    @FXML
    void Cand(MouseEvent event) throws IOException {
    	mainObj.changeScene("AddNewCandidate.fxml");
    }

    @FXML
    void party(MouseEvent event) throws IOException {
    	mainObj.changeScene("AddNewParty.fxml");
    }

    @FXML
    void viewPercentage(MouseEvent event) {
    	sqlObj.Percentage(null, 0);
    }

    @FXML
    void viewResult(MouseEvent event) {
    	sqlObj.Result(); 
    }

}
