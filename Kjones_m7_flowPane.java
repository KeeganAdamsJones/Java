
package kjones_m7_flowpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/*  Keegan Jones
    Module 7 - JavaFX FlowPane 
    CSD - 405 Intermediate Java
    4/20/2021

*/
public class Kjones_m7_flowPane extends Application {
    //override the start method in Application class(polymorphism)
    @Override
    
    public void start(Stage primaryStage){
        //create pane and set properties
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11,12,13,14));
        //Hgap is horizontal gap space between nodes
        pane.setHgap(5);
        //Vgap is the vertical gab space between nodes
        pane.setVgap(5);
        
        // place nodes in the pane with getChildren
        //(this will float them neatly in top-left to bottom-right format)
        pane.getChildren().addAll(new Label("First Name: "),
            new TextField(), new Label("MI: "));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMi, new Label ("Last Name: "),
            new TextField());
        //create a scene and place it in the stage
        //pane size specifications are: left number = width, right number = hei 
        Scene scene = new Scene(pane, 250, 200);
        //set stage title (title of the popup window)
        primaryStage.setTitle("FlowPane");
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
