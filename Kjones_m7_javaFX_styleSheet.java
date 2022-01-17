
package kjones_m7_javafx_stylesheet;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;


/*
Keegan Jones
CSD - 420 Advanced Java
Module 7 - JavaFX style sheet 
6/14/2021

Assignment:
Create a CSS style sheet that defines a class for white fill and black stroke 
color and an ID for red and green color.

Write a program that displays four circles and uses the style class and ID. 
 */

public class Kjones_m7_javaFX_styleSheet extends Application {
    // Override the start method in the application class
    //override the start method in Application class(polymorphism)
    @Override
    
    public void start(Stage primaryStage){
        
        // Create a root pane that will hold pane1 and pane2
        Pane rootPane = new Pane();
        // Create 2 Panes so that I can do border around just one circle
        Pane pane1 = new Pane();
        Pane pane2 = new Pane();
        

         
        Circle circle1 = new Circle(50, 50, 30);
        Circle circle2 = new Circle(150, 50, 30);
        Circle circle3 = new Circle(250, 50, 30);
        Circle circle4 = new Circle(350, 50, 30);
        
        
        pane1.getStyleClass().add("border");
        
        //circle1.getStyleClass().add("circleborder");
        circle1.getStyleClass().add("plaincircle");
        circle2.getStyleClass().add("plaincircle");
        circle3.idProperty().set("redcircle");
        circle4.idProperty().set("greencircle");
        
        pane1.getChildren().addAll(circle1);
        pane2.getChildren().addAll(circle2, circle3, circle4);
        
        // Set height so that the border is a tall rectangle not a square
        pane1.setMinHeight(300);
        
        rootPane.getChildren().addAll(pane1, pane2);

        // Create Scene 
        Scene scene = new Scene(rootPane, 500, 300);
        
        
        // Load CSS from file ./kjones_csd420_m7CSS.css
        scene.getStylesheets().add("file:kjones_csd420_m7CSS.css");
           
        //set stage title (title of the popup window)
        primaryStage.setTitle("Using CSS with my JavaFX");
        //place the scene in the stage
        primaryStage.setScene(scene);
        //display the stage
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
        
    }
    
}
