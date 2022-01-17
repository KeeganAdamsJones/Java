
package kjones_m10_displayupdatedb;
import java.sql.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
/*
    Keegan Jones
    CSD - 420 Advanced Java
    Module 10 
    7/10/2021

    Assignment:
    *Write a program that views and updates fan information stored in database 
        titled “student1” with a password “pass”.
    *The table name is to be “fans” with the fields of ID (integer, PRIMARY KEY), 
        firstname (varchar(25)), lastname (varchar(25)), and favoriteteam (varchar(25)).
    *Your interface is to have 2 buttons to display and update records.
    *The display button will display the record with the provided ID in the display 
        (ID user provides).
    *The update button will update the record in the database with the changes 
        made in the display.
    *Your application is not to create or delete the table.
    *To work on this using your home database, you can make the table and populate it.
    *When the application is tested, the table will already be created and populated.
    *Write test code that ensures all methods and the interface functions correctly.

 */
public class Kjones_m10_displayUpdateDB extends Application {

    @Override
    public void start(Stage primaryStage){
        
/* ******** This is the JavaFX Interface Part ***************** */
        // Create a pane
        FlowPane pane1 = new FlowPane();
        pane1.getStyleClass().add("border");

         
        // Create Hbox to hold label, input field, and display button
        HBox hbox1 = new HBox();
        
        hbox1.setSpacing(10);

        Label label1 = new Label("ID to retrieve:");
        textField1 = new TextField ();

        Button button1 = new Button("Display");
        button1.setPrefSize(100, 20);

        // Button1 is the "Display" button
        // This should take the ID from the ID text box and load the
        // text boxes that we can edit.
        button1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override public void handle (ActionEvent e) {
               
               // When we click on button1, we need to load the data from the database
               loadDataFromDB();
            }
        });
        // Add everything to the hbox    
        hbox1.getChildren().addAll(label1, textField1, button1);

        //Create hbox2 to hold labels and text fields and Update button
        HBox hbox2 = new HBox();
        hbox2.setSpacing(10);
                
        Label label2 = new Label("First Name:");
        textField2 = new TextField ();
                
        Label label3 = new Label("Last Name:");
        textField3 = new TextField ();
                
        Label label4 = new Label("Favorite Team:");
        textField4 = new TextField ();
                
        Button button2 = new Button("Update");
        
        button2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override public void handle (ActionEvent e) {
               // When we click button2 we will update the data to the DB
               updateDataToDB();
            }
        });
        hbox2.getChildren().addAll(label2, textField2, label3, textField3, label4, textField4, button2);
        
        // Add hboxs to pane
        pane1.getChildren().addAll(hbox1, hbox2);
        
        
        // Create Scene 
        Scene scene = new Scene(pane1, 1000, 300);
                        
        //set stage title (title of the popup window)
        primaryStage.setTitle("Display and Update Database With Java");
       
        //place the scene in the stage
        primaryStage.setScene(scene);
        
        //display the stage
        primaryStage.show();
    }
    
    /* ******** This is the Connection to mySQL DB Part ***************** */
    Connection connection;
    TextField textField1;
    TextField textField2;
    TextField textField3;
    TextField textField4;
    
    public void setup_db() 
        throws SQLException, ClassNotFoundException {
        
        // If we have setup the connection before, just return
        if(connection != null) {
            return;
        }
        
        // Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        // Connect to a database
        connection = DriverManager.getConnection
        ("jdbc:mysql://localhost/database1","student1","pass");
        System.out.println("Database connected");
    }
    
    public void closeDB() {
        try {
            // Close the connection
            connection.close();
        } catch (SQLException e) {
            // OK, ignore it.
            return;
        }
    }
    
    /* ******** This is the Part where we are actually working with the DB **** */   
    
    private void loadDataFromDB() {
        try {
            setup_db();
        
            // Create a statement
            Statement statement = connection.createStatement();

            // Pull the data from the table
            ResultSet resultSet = statement.executeQuery
            ("SELECT * FROM fans WHERE id = " + textField1.getText());

            // Get the first record
            resultSet.next();
            
            // Pull the values and put them into the correct text boxes
            textField2.setText(resultSet.getString(2));
            textField3.setText(resultSet.getString(3));
            textField4.setText(resultSet.getString(4));
            
        } catch (Exception e) {
            // TODO: Need to handle this better?
            return;
        }
    }
    
    private void updateDataToDB() {
        try {
            setup_db();
        
            // Create a statement
            Statement statement = connection.createStatement();
            
            statement.execute
            ("UPDATE fans SET firstname = '" + textField2.getText() +
                    "', lastname = '" + textField3.getText() + 
                    "', favoriteteam = '" + textField4.getText() + "' " +
                    "WHERE id = " + textField1.getText());
            
            // Clear the values, since we're done working with this record
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            
        } catch (Exception e) {
            // TODO: Need to handle this better?
            return;
        }
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
   

