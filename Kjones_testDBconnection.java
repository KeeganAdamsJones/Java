
package kjones_testdbconnection;

import java.sql.*;

/*
    Keegan Jones
    CSD - 420 Advanced Java
    Module 9 - Database connection 
    7/5/2021

    Assignment:
    *For this assignment you are to ensure you have Java and NetBeans correctly 
        installed and configured.
    *Then you are to correctly install and configure MySQL 5.
    *The following code example is to be used to test your setup.
    *Code Example for Testing Setup (Zip File) Click for more options
    *Your database name is to be “student1” and the password for this account 
        will be “pass”.
    *Lastly you are to configure the database to allow a Java connection.
    *Capture and submit images in a single document of your running of the test 
        application to show you were successful with the installation and configuration.

 */

public class Kjones_testDBconnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        throws SQLException, ClassNotFoundException {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");

            // Connect to a database
            
            Connection connection = DriverManager.getConnection
            ("jdbc:mysql://localhost/database1","student1","pass");
            System.out.println("Database connected");

            // Create a statement
            Statement statement = connection.createStatement();

            // TODO: Make a statement!
            ResultSet resultSet = statement.executeQuery
            ("select * from fans");

            // Iterate through the result and print the student names
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + "\t"
                        + resultSet.getString(2) + "\t"
                        + resultSet.getString(3) + "\t"
                + resultSet.getString(4) + "\t");
            }

            // Close the connection
            connection.close();
        }

   }
