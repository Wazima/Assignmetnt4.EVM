package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class welcome {

	Main mainObj=new Main();
	
    @FXML
    private Button voter_id;

    @FXML
    private Button adm_id;
    

    @FXML
    void admin(MouseEvent event) throws IOException {
    	mainObj.changeScene("adminLogin.fxml");
    }

    @FXML
    void voter(MouseEvent event) throws IOException {
    	mainObj.changeScene("Voter.fxml"); 

    }
}
