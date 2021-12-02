package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	public static Stage primaryStage;
	//private FXMLLoader fxmlLoader;
	@Override
	public void start(Stage primaryStage1) throws IOException {
		
		primaryStage=primaryStage1;
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("welcome.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage1.setTitle("EVMs");
        primaryStage1.setScene(scene);
        primaryStage1.show();
        
      //  mainVoter();
      //  mainAdministrator();
        
		
		
	}
	
	public void changeScene(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml));
		 Scene scene = new Scene(fxmlLoader.load());
	        primaryStage.setTitle("EVMs");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	}
	
	/*
	private void mainNewCandidate() throws IOException {
		
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AddNewCandidate.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("EVMs");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	private void mainVoter() throws IOException{
		
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Voter.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("EVMs");
        primaryStage.setScene(scene);
        primaryStage.show();
		
	}
	
	private void mainNewParty() throws IOException {
		
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AddNewParty.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("EVMs");
        primaryStage.setScene(scene);
        primaryStage.show();
		
	}
	
	private void mainAdministrator() throws IOException {
		
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("administrator.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("EVMs");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        mainNewCandidate();
        mainNewParty();
        
        //view percentage
        //view result
		
	}*/
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
