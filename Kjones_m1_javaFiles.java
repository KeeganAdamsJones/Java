package kjones_m1_javafiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

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
public class Kjones_m1_javaFiles {

    private static int i;

    
    public static void main(String[] args) throws IOException {
        
        // create array of 5 random integers
        Random integers = new Random(); 
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
        arr1[i] = integers.nextInt(); 
        //System.out.println(arr1[i]);
        }
        
        //create data object instance of current date
        Date date = new Date();
        //System.out.println(date);
        
        //create array of 5 random double values
        Random doubles = new Random(); 
        Double[] arr2 = new Double[5];
        for (int i = 0; i < arr2.length; i++) {
        arr2[i] = doubles.nextDouble(); 
        //System.out.println(arr2[i]);
        } 
        
        //Append the data in a file titled <yourname> datafile.dat
        try (PrintWriter output = 
                new PrintWriter (new FileOutputStream("kJonesDataFile.dat", true))) {
            
            //this is what will be written to the file
            output.write(Arrays.toString(arr1));
            output.write("\n");
            output.write(date.toString());
            output.write("\n");
            output.write(Arrays.toString(arr2));
            output.write("\n");
                    
        }

    
    }
    
}
