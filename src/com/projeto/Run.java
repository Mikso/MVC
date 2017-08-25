/**
 * 
 */
package com.projeto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;




/**
 * @author Bruno
 *
 */
public class Run extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane mainPane = (Pane)FXMLLoader.load(Run.class.getResource("Construtor.fxml"));
	
		primaryStage.setScene(new Scene(mainPane));
		//primaryStage.setTitle("MVC no Eclipse");
		primaryStage.show();
	
	}

}
