package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AddNewCandidate {

	Main mainObj=new Main();
	
    @FXML
    private TextField name;

    @FXML
    private TextField n_cnic;

    @FXML
    private TextField p_name;

    @FXML
    private Button createCandidate;
    
    
    @FXML
    private Button back;

    @FXML
    void goback(MouseEvent event) throws IOException {
    	mainObj.changeScene("administrator.fxml");
    }

    @FXML
    void CreateCandidate(MouseEvent event) throws IOException {
    	
    	String cand_name=name.getText();
    	String cand_cnic=n_cnic.getText();
    	String cand_pname=p_name.getText();
    	
    	
    	
    	mainObj.changeScene("candidateadded.fxml");
    }

}
