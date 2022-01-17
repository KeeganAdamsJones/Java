/*
Keegan Jones 
1/18/2021
Module 4 - String/Substring

Write a program that prompts a user to enter two strings and then checks the 
strings entered and reports if either the first string is a substring of the 
second string, or if the second string is a substring of the first string.
 */
package kjones_m4_substring;

import java.util.Scanner;

public class Kjones_m4_substring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //create a new scanner
      Scanner input = new Scanner(System.in);
      
      //prompt user to give two sentences
      System.out.print(
              "Please enter a sentence here: ");
      String sentence_1 = input.nextLine();
      
      System.out.print(
               "Please enter a second sentence here: ");
      String sentence_2 = input.nextLine();
      
      //check to see if either sentence is a substring of the other
      int index_1 = sentence_1.toUpperCase().indexOf(sentence_2.toUpperCase());
      int index_2 = sentence_2.toUpperCase().indexOf(sentence_1.toUpperCase());
    
      //report results
      if (index_1 < 0 && index_2 < 0)
          System.out.println("Neither sentence is a substring of the other.");
      else if (index_1 >= 0)
          System.out.println("Your second sentance is a substring of your first "
                  + "sentance.");
      else if (index_2 >= 0)
          System.out.println("Your first sentance is a substring of your second "
                  + "sentance."); 
     
      
     
 
      

      
     
      
      
      
      
      
    }
    
}
