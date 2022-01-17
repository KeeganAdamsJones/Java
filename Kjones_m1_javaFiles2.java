
package kjones_m1_javafiles2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Keegan Jones
CSD - 420 Advanced Java
Module 1 
5/24/2021

Assignment:
Write a program that stores:

* An array of five random integers
* A Data objective instance using the current date
* An array of five random double values
* Append the data in a file titled <yourname> datafile.dat.
* Write a second program that will read the file and display the data.
* Test the code to ensure the code functions correctly.

*/
public class Kjones_m1_javaFiles2 {

    
    public static void main(String[] args) throws IOException {
        File file = new File("../Kjones_m1_javaFiles/kJonesDataFile.dat");
        try (BufferedReader input = 
                new BufferedReader(new FileReader(file))){
            
            //read from file loop through each line 
            String inputLine;
            while((inputLine=input.readLine()) != null) {
                System.out.println(inputLine);
            }
        }
    }
    
}
