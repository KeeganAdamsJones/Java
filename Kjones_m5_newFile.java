/*
Keegan Jones
Java csd 405
Module 5 Assignment - New File: create, write, update, read, display
4/5/2021

********************************************************************************
** Program 2: Write a program to create a new file titled data.file, if the file 
    does not exist. 
* Then write to the new file, adding 10 randomly generated numbers, or append 10 
    randomly generated numbers to a previous file. 
* Each integer is to be separated by a space. 
* Close the file, then reopen the file and read the data from the file and display it.
********************************************************************************
 */
package kjones_m5_newfile;

//import classes from java to work with files, handle exceptions, write to files
    //and accept user input
import java.io.File;  
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Kjones_m5_newFile {

    
    public static void main(String[] args) {
        
        //create new file called 'data.file'
        //use try/catch block to handle errors
        try {
            File myNewFile = new File("data.file");
            if (myNewFile.createNewFile()) {
                System.out.println("\nFile created: " + myNewFile.getName());
            }    
                else {
                    System.out.println("\nFile already exists. Opening file: " + myNewFile.getName());
                }
            } 
            
            catch (IOException e) {
                System.out.println("\nAn error occurred.");   
            }
        
        
        File myNewFile = new File("data.file");
        PrintWriter pw;
        Scanner sc;
        

        //write to file using PrintWriter, generate 10 random numbers, 
            //make sure each number is separated by a space
        try {
            pw = new PrintWriter(myNewFile);
                   
            System.out.println("\nWriting File: generating 10 random numbers...");
        
            //use 'Math.random() to generate random number between 1 & 100
            // used 'print' instead of 'print.ln' and added a space so that the 
                //numbers will print on the same line with a space between them
            pw.print((int)(Math.random() * 100) + " ");
            pw.print((int)(Math.random() * 100) + " ");
            pw.print((int)(Math.random() * 100) + " ");
            pw.print((int)(Math.random() * 100) + " ");
            pw.print((int)(Math.random() * 100) + " ");
            pw.print((int)(Math.random() * 100) + " ");
            pw.print((int)(Math.random() * 100) + " ");
            pw.print((int)(Math.random() * 100) + " ");
            pw.print((int)(Math.random() * 100) + " ");
            pw.print((int)(Math.random() * 100) + " ");
        
            //close PrintWriter
            pw.close();
            
        } 
        //give this catch so I know where the possible exception may occur 
        catch (IOException ioe) {
            System.out.println("\nAn error has occurred while writing to your file.");       
        }
        
        //open and read file
        try{
            System.out.println("\nReading File: the random numbers are... ");
            sc = new Scanner(myNewFile);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        //give this catch so I know where the possible exception may occur
        catch(IOException ioe){
            System.out.println("An error has occurred while reading this file.");
        }
    }  
}
