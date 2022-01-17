package kjones_m10_randomimages_withrefresh.java;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import java.util.ArrayList;
import javafx.scene.control.Button;
/*
    Keegan Jones
    CSD - 405 Intermediate Java
    Module 8 - Random Images with Refresh
    5/3/2021

    Assignment:

    Using the Assignment Cards Zip File attached above (this is the same zip file 
    used in Module 7), write a program that displays four playing cards. 
    In addition, your program should meet the following requirements:

    Below the cards, there will be a refresh button that will then display four     
    different cards.

    All cards will be displayed through random selection.

    **I reffered to my text, Liang, Y. D. (2020). Introduction to Java programming and 
    data structures: Comprehensive version. Hoboken, NJ: Pearson Education, Programming 
    Excercises 14.3 for tips on how to execute this.

 */
public class Kjones_m10_randomImages_withRefreshJava extends Application {

    // Override the start method in the Application class
    @Override 
    
    public void start(Stage primaryStage) {
    
        // Create a HBox pane which will place the nodes(images) in one row
        HBox pane = new HBox(5);
        pane.setPadding(new Insets(5, 5, 5, 5));
       
        
        //call function to get new cards and place on pane
        placeCards(pane);
    
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        // Set the stage title
        primaryStage.setTitle("4 Random Images"); 
        // Place the scene in the stage
        primaryStage.setScene(scene); 
        // Display the stage
        primaryStage.show(); 
    }
    
    private void placeCards(HBox pane) {
        
        // create arraylist to hold card numbers 1-52
        ArrayList<Integer> cards = getCards();
        
        // clear all children from the pane
        pane.getChildren().clear();

        // Create a refresh button
	Button btRefresh = new Button("Refresh");

	// handle refresh button event to refresh with 4 new cards
	btRefresh.setOnAction(e -> placeCards(pane));
        
        //add button to pane
        pane.getChildren().add(btRefresh);
        
        // Add nodes to pane (my 4 randomly selected images)
        //for loop so that I end up with 4 images
        for (int i = 0; i < 4; i++) {
            //was getting a invalid url exception, added the <file:./> so that the 
            //would look at the system application
            pane.getChildren().add(new ImageView(new Image("file:./images/cards/" +
                cards.get(i) + ".png")));

        }
        
        
    
    }
    /** Returns a list with numbers 1-52 stored in random order */
    private ArrayList<Integer> getCards() {
    
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
        cards.add(i + 1);
        }
        
        //use java utility .shuffle() to randomize what image the application displays
        java.util.Collections.shuffle(cards);
        return cards;
    }
    public static void main(String[] args){
       Application.launch(args);
       }
}  
    

