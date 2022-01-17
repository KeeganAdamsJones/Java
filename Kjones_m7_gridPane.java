
package kjones_m7_gridpane;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
    Keegan Jones
    Module 7 - JavaFX FlowPane 
    CSD - 405 Intermediate Java
    4/20/2021

*/

public class Kjones_m7_gridPane extends Application {

    //override the start method in Application class(polymorphism)
    @Override
    
    public void start (Stage primaryStage) {
        //create a pane and set its properties
        GridPane pane = new GridPane();
        /* center here will center the nodes within the pane, even if you resize 
        the pane, the nodes will remain in the center
        */
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        
        //place nodes in the pane
        //new items will be placed in by index of column and row starting at 0, 0.
        pane.add(new Label("First Name: "), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("MI: "), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Last Name: "), 0, 2);
        pane.add(new TextField(), 1, 2);
        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 3);
        //use static Hallignment method to set the button to the right
        GridPane.setHalignment(btAdd, HPos.RIGHT);
        
        //create a scene and place it in the stage
        /* by not specifying a scene size, the size will be automatically computed
        based on nodes */
        Scene scene = new Scene(pane);
        //set the stage title
        primaryStage.setTitle("GridPane");
        //place the scene in the stage
        primaryStage.setScene(scene);
        //display the stage
        primaryStage.show();        
    }
    
    /*
    The main method is only needed for the IDE with limited
    JavaFX support. Not needed for running from the command line.
    */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
