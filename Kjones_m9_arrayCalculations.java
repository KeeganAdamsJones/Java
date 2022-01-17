/*
Keegan Jones
2/14/2021
Module 8 - Array Calculations


Write a program that reads and fills an array with 20 integers. Then, using the 
array elements, calculate the data to find and display:

The highest value entered.
The lowest value entered.
The average of the numbers entered.
The sum of the numbers entered.
Display this information in a readable display making the data easy to understand.
 */

package kjones_m9_arraycalculations;

import static java.lang.Math.random;

/**
 *
 * @author keega
 */
public class Kjones_m9_arrayCalculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an empty array with 20 spots
        int[] myNumbers = new int[20]; 
        
       
        //fill each spot in the array with a random number 
        for (int i = 0; i < myNumbers.length; i++){
             myNumbers[i] = (int) (Math.random() * 100);
        }    
        
        System.out.print("\nThe numbers generated for your array are ");
        //display the numbers that are randomly generated into the array
        for (int i = 0; i < myNumbers.length; i++){
            System.out.print(myNumbers[i] + " ");
        }

        
        //display the highest and lowest random numbers in the array
        int max = myNumbers[0];
        for (int i = 1; i < myNumbers.length; i++){
            if (myNumbers[i] > max) max = myNumbers[i];
        }
            System.out.print("\n\nThe highest number in your array is " + max + " ");
        
        int min = myNumbers[0];
        for (int i = 1; i < myNumbers.length; i++){
            if (myNumbers[i] < min) min = myNumbers[i];
        }
            System.out.print("\n\nThe lowest number in your array is " + min + " ");
        
        
        
        //display the sum of the random numbers in the array
        //display the average of the random numbers in the array
        int total = 0;
        for (int i = 0; i < myNumbers.length; i++){
            total += myNumbers[i];
        }
            System.out.print("\n\nThe sum of the numbers in your array is " 
                    + total + " ");
            double average = total / myNumbers.length;
            System.out.print("\n\nThe average of all the numbers in your array is " 
                    + average + " ");
        
            
        
        
    }
    
}
