/*
Keegan Jones
Java csd 405
Module 4 Assignment - Class Titled Integer
3/29/2021

Assignment:
** Create a class titled Integer.  Examples: TomArrayListTest, SueArrayListTest, Etc.

This class is to contain:
    ** A method that receives an ArrayList populated with an Integer data type holding 
        the integers received from user input.
    ** The user input is to accept Integers that are then assigned to the ArrayList 
        until a value of 0 is entered, which is also assigned to the ArrayList.
    * The ArrayList is then to be sent to the method.
    ** The method is then to return the largest value in the ArrayList.
    ** If the ArrayList is sent in empty, the method will then return 0.
    ** The method signature is to be: public static Integer max (ArrayList list).
    
    * Write additional code for testing your method.
    * The method will return the largest value that is displayed to the user.

 */
package kjones_m4_classtitledinteger.java;

import java.util.Scanner;
import java.util.ArrayList;

public class Kjones_m4_classTitledIntegerJava {

    //main method 
    public static void main(String[] args) {
        //create scanner object so that user can input numbers to the array
        Scanner input = new Scanner(System.in);
        
        //create an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //prompt user to enter several numbers to fill the array list
        System.out.print("Please enter a series of numbers. Please end your list of"
                + "numbers with the number '0'.");
        Integer number = input.nextInt();
        while (number.intValue() != 0) {
            list.add(number);
            number = input.nextInt();
        }
        //return and display the largest number in the array list
        System.out.println("The largest number that you entered is " + KeeganArrayListTest.max(list));
    }
        
    public static class KeeganArrayListTest {
            
            //a method with a signature: public static Integer max (ArrayList list)
            //if the ArrayList is sent in empty, the method will then return 0.
           public static Integer max (ArrayList<Integer> list){
                if (list.size() == 0)
                    return 0;
                
                //method that gets arraylist that is populated with user input and 
                //returns max 
                
                Integer max = list.get(0);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) >  max)
                        max = list.get(i);
                }
                return max;
            }
            
        }
    
}

