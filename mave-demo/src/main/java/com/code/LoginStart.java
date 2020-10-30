package com.code;

import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginStart extends Application { 
		public static void main(String[]args) {
			launch(args);
		}
		public void start(Stage primaryStage) throws Exception
		{		
			URL url = new File("src/main/java/com/code/Untilted.fxml").toURI().toURL();
			Parent root = FXMLLoader.load(url);

	        primaryStage.setScene(new Scene(root));
	        primaryStage.show();
		}
		 
		}


