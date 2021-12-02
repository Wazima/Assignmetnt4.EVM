package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.ChoiceBox;

public class Voter implements Initializable {

	Main mainObj=new Main();
	Mysql sqlObj=new Mysql();
	
    @FXML
    private TextField cnic;

    @FXML
    private Button back;
    
    @FXML
    private ChoiceBox<String> partyid;
    
    @FXML
    private Button submitVote;

    @FXML
    void SubmitVote(MouseEvent event) throws IOException {
    	String id=cnic.getText();
    	
    	String p_name=partyid.getValue();
    	sqlObj.updateParty(p_name, 1);
    	sqlObj.sqlDataEntryVoter(id,p_name);
    //	System.out.println("Hello");
    	mainObj.changeScene("voted.fxml");
    }

    @FXML
    void goback(MouseEvent event) throws IOException {
    	mainObj.changeScene("welcome.fxml");
    }

  
    


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		partyid.getItems().add("PMLN");
    	partyid.getItems().add("PTI");
    	partyid.getItems().add("PPP");
    	
    	
		
	}

}
