/*
Keegan Jones
Java csd 405
Module 5 Assignment - Try/Catch Exceptions
4/5/2021

********************************************************************************
Assignment:
** Program 1: Write a program that uses an ArrayList filled with a minimum of 10 
    Strings. 
** Use a ‘for-each’ loop to print the ArrayList collection. 
** Then ask a user which element they would like to see again. 
* Then, attempt printing the element in a try/catch format which will result in 
    the element being display. 
** If the element value received is invalid, display a message that an Exception 
    has been thrown displaying “Out of Bounds”. 
** In this program, include the use of Autoboxing/Auto-Unboxing, working with a 
    user String input.
*******************************************************************************

 */
package kjones_m5_trycatch;
import java.util.ArrayList;
import java.util.Scanner;

public class Kjones_m5_tryCatch {

    
    public static void main(String[] args) {
        //create an ArrayList with at least 10 strings
        //make sure to specify element type as String so that the compilier will 
            //already know what element type we are using and it will use autoboxing
            //and auto-unboxing
        ArrayList<String> myList = new ArrayList<>();
        myList.add("red");
        myList.add("red-violet");
        myList.add("violet");
        myList.add("blue-violet");
        myList.add("blue");
        myList.add("blue-green");
        myList.add("green");
        myList.add("yellow-green");
        myList.add("yellow");
        myList.add("yellow-orange");
        myList.add("orange");
        myList.add("red-orange");
        
        // use a for each loop to print the ArrayList collection
        for (String strTemp : myList){
        System.out.println(strTemp);
        }
        
        //create scanner to collect user input
        Scanner input = new Scanner(System.in);

        //set up a loop so that if there is an exception found the user can try again.
        var exitLoop = false;
        while(!exitLoop) {
        
        //ask a user which element they would like to see again
        System.out.print("\nWhich item from my list would you like to see again?"
                + " \n(Enter item here:)  ");
        
        String answer = input.nextLine();
        
        
            // try/catch block to handle exceptions
            try{
                var userInput = answer;
                System.out.println("\nYou want to view " + answer + " again.");
                var index = myList.indexOf(answer);
                System.out.println("\nHere is your chosen list item again: " 
                        + myList.get(index));
                exitLoop = true;
            }

            catch(IndexOutOfBoundsException e) {
                System.out.println("\nException: Out of Bounds! You must enter an "
                        + "item from the list.  "
                        + "Please try again.");
            }
        }
    }
}     
    