package kjones_m11_displayfigures_checkboxes_radiobtn;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/*
Keegan Jones
CSD - 405 Intermediate Java
Module 8 - Display figures, use checkboxes and radio buttons
5/3/2021

Assignment:

Write a program that displays various figures such as a Circle, a Rectangle, or an Ellipse.

Include radio buttons selections for changing the display figure to the one selected.
Include a checkbox for filling and clearing the displayed figure with a random color.
 */
public class Kjones_m11_displayFigures_checkBoxes_radioBtn extends Application {
    //override start method from Application class
    @Override
    public void start(Stage primaryStage){
        
        //make Hbox to hold 2 buttons
        VBox vBoxForCheckboxes = new VBox();
        vBoxForCheckboxes.setPadding(new Insets(5,5,5,5));
        vBoxForCheckboxes.setAlignment(Pos.CENTER);
        CheckBox chkFill = new CheckBox ("Fill With Random Color");
        vBoxForCheckboxes.getChildren().addAll(chkFill);
        
        //create a flowpane and define its properties
        FlowPane pane = new FlowPane();
        pane.setAlignment (Pos. CENTER);
        pane.setPadding(new Insets(30.5, 30.5, 30.5, 30.5));
        pane.setMinHeight(150);
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.getChildren().add(vBoxForCheckboxes);
        
        chkFill.setOnAction(e -> {
            if(chkFill.isSelected()){
                ////////
            }
        });
        
        
        //make radio buttons to select which shape to see
        VBox vBoxForRadioBt = new VBox();
        vBoxForRadioBt.setPadding(new Insets(5,5,5,5));
        vBoxForRadioBt.setAlignment(Pos.CENTER);
        RadioButton rbRectangle = new RadioButton("Rectangle");
        RadioButton rbCircle = new RadioButton("Circle");
        RadioButton rbEllipse = new RadioButton("Ellipse");
        

        //create toggle group so that only one radio button can be selected at a time
        ToggleGroup group = new ToggleGroup();
        rbRectangle.setToggleGroup(group);
        rbCircle.setToggleGroup(group);
        rbEllipse.setToggleGroup(group);
        
        //add all 3 radio buttons to the pane
        pane.getChildren().add(rbRectangle);
        pane.getChildren().add(rbCircle);
        pane.getChildren().add(rbEllipse);
                
        //create an new vbox to hold the shapes and add shapebox
        VBox shapeBox = new VBox();
        pane.getChildren().add(shapeBox);

        //if a rb is selected call displayShape method and assign it a number
        rbRectangle.setOnAction(e -> {
            displayShape(shapeBox, 1, chkFill.isSelected());
            
        });
        
        rbCircle.setOnAction(e -> {
            displayShape(shapeBox, 2, chkFill.isSelected());
        });
        
        rbEllipse.setOnAction(e -> {
            displayShape(shapeBox, 3, chkFill.isSelected());
        });
          
        
        
    
        
        // padding attributes
        pane.setPadding(new Insets(11,12,13,14));
        pane.setHgap(5);
        pane.setVgap(5);
        
        
        //create scene and set stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Figure Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //method to handle what button is selected and display appropriate shape
    public void displayShape(VBox shapeBox,
            int shapeToDisplay, boolean showRandomColor) {
    
        //start method by clearing the shapeBox
        shapeBox.getChildren().clear();
        
        //get random color
        //used .abs to get an absolute number so that there wont be a negative number
        Random rand = new Random();
        int r = Math.abs(rand.nextInt()) % 256;
        int g = Math.abs(rand.nextInt()) % 256;
        int b = Math.abs(rand.nextInt()) % 256;

        Color randomColor = Color.rgb(r, g, b);
        
        //if rbRectangle isSelected
        if(shapeToDisplay == 1) {
            Rectangle rect = new Rectangle(30, 15, 65, 35);
            shapeBox.getChildren().add(rect);
            rect.setStroke(Color.BLACK);
            if(showRandomColor) {
                rect.setFill(randomColor);
            }
            else {
                rect.setFill(Color.TRANSPARENT);
            }
        }
        
        //if rbCircle isSelected
        if(shapeToDisplay == 2) {
            Circle circ = new Circle(300.0f, 35.0f, 30.0f);
            shapeBox.getChildren().add(circ);
            circ.setStroke(Color.BLACK);
            if(showRandomColor) {
                circ.setFill(randomColor);
            }
            else {
                circ.setFill(Color.TRANSPARENT);
            }
        }
        
        //if rbEllipse isSelected
        if(shapeToDisplay == 3) {
            Ellipse elli = new Ellipse(200, 50, 70, 30);
            shapeBox.getChildren().add(elli);
            elli.setStroke(Color.BLACK);            
            if(showRandomColor) {
                elli.setFill(randomColor);
            }
            else {
                elli.setFill(Color.TRANSPARENT);
            }
        }

    }


    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
