package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AddNewParty {

	Main mainObj=new Main();
	Mysql sqlObj=new Mysql();
    @FXML
    private TextField pName;

    @FXML
    private TextField lName;

    @FXML
    private TextField pSlogan;

    @FXML
    private Button c_party;
    
    @FXML
    private Button back;

    @FXML
    void goback(MouseEvent event) throws IOException {
    	mainObj.changeScene("administrator.fxml");
    }

    @FXML
    void createParty(MouseEvent event) throws IOException {

    	String party_name=pName.getText();
    	String party_leader=lName.getText();
    	String party_slogan=pSlogan.getText();
    	sqlObj.sqlDataEntryParty(party_name, party_leader, party_slogan);
    	mainObj.changeScene("Partyadded.fxml");
    	
    }

}
