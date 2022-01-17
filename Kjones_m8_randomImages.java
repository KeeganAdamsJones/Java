
package kjones_m8_randomimages;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import java.util.ArrayList;

/*  Keegan Jones
    CSD - 405 Intermediate Java
    Module 8 - Random Images
    4/20/2021

Assignment:
*   Write a program that displays four images randomly selected from a deck of 
    52 cards. The attached zip file has card files titled 1.png, 2.png, 3.png, 
    4.png, …, 52.png. 

For this application:
*   Store the images in a “cards” sub directory.
*   Using these cards, randomly select four cards for display.
*   You may use a different set of images you either have or decide to make.

**I reffered to my text, Liang, Y. D. (2020). Introduction to Java programming and 
data structures: Comprehensive version. Hoboken, NJ: Pearson Education, Programming 
Excercises 14.3 for tips on how to execute this.
*/
public class Kjones_m8_randomImages extends Application {
    // Override the start method in the Application class
    @Override 
    
    public void start(Stage primaryStage) {
        // create arraylist to hold card numbers 1-52
        ArrayList<Integer> cards = getCards();
    
        // Create a HBox pane which will place the nodes(images) in one row
        HBox pane = new HBox(5);
        pane.setPadding(new Insets(5, 5, 5, 5));
    
        // Add nodes to pane (my 4 randomly selected images)
        //for loop so that I end up with 4 images
        for (int i = 0; i < 4; i++) {
            //was getting a invalid url exception, added the <file:./> so that the 
            //would look at the system application
            pane.getChildren().add(new ImageView(new Image("file:./images/cards/" +
                cards.get(i) + ".png")));

        }
    
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        // Set the stage title
        primaryStage.setTitle("4 Random Images"); 
        // Place the scene in the stage
        primaryStage.setScene(scene); 
        // Display the stage
        primaryStage.show(); 
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
    

