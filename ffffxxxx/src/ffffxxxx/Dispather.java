package ffffxxxx;

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Dispather extends Application {
	Label response;
	public static void main(String[] args) {
		launch (args) ;
}
	public void start (Stage myStage ){
		myStage.setTitle("Demonstrate‡ Java FX label");
		FlowPane rootNode = new FlowPane(10,10);
		Scene myScene = new Scene (rootNode,300,200);
		myStage.setScene(myScene);
		Label myLabel = new Label("This is ‡ Java FX label") ;
		Label myLabel2 = new Label("           This is ‡ Java FX label2") ;
		response= new Label ("Push ‡ Button") ;
		Button ‹tnAlpha = new Button ( "Alpha") ;
		Button ‹tn¬Ât‡ = new Button ("Beta");
		‹tnAlpha.setOnAction (new EventHandler<ActionEvent>(){
				public void handle (ActionEvent ‡Â ) {
				response.setText ("Alpha was pressed.") ;
				}
		} ) ;
		
		‹tn¬Ât‡.setOnAction (new EventHandler<ActionEvent>(){
			public void handle (ActionEvent ‡Â ) {
			response.setText ("¬Ât‡ was pressed.") ;
			}
		} ) ;
		//FlowPane rootNode = new FlowPane (10, 10);
		rootNode.setAlignment(Pos.CENTER);
		rootNode.getChildren().addAll(‹tnAlpha,‹tn¬Ât‡, response) ;
		rootNode.getChildren().add(myLabel);
		rootNode.getChildren().add(myLabel2) ;
		myStage.show();
	}
	
}
