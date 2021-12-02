package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Login {

	Main mainObj=new Main();
	Mysql sqlObj=new Mysql();
	
    @FXML
    private TextField id;

    @FXML
    private PasswordField password;

    @FXML
    private Button logIn;
    
    @FXML
    private Button back;

    @FXML
    void goback(MouseEvent event) throws IOException {
    	mainObj.changeScene("welcome.fxml");
    }

    @FXML
    void login(MouseEvent event) throws IOException {
    	
    	String a_id=id.getText();
    	//String a_pass=password.getId();
    	String a_pass="123";
    	System.out.println(a_pass);
    	int x=sqlObj.sqlDataEntryAdmin(a_id,a_pass);
    	
    	if(x==1) {
    		mainObj.changeScene("administrator.fxml");
    	}
    	else
    		mainObj.changeScene("welcome.fxml");
    }

}
