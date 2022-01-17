/*
Keegan Jones
2/2/2021
Module 7 - Password Check

Assignment:
Some Websites impose certain rules for passwords. Write a method that checks 
whether an input String is a valid password. Suppose the password rules are as 
follows:

A password must have at least eight characters.
A password must contain both letters and digits.
A password must contain at least one uppercase character.
A password must contain at least one lowercase character.
 */
package kjones_m7_password_check2;

import java.util.Scanner; //Scanner is in the java.util package 

public class KJones_M7_Password_Check2 {

    
    public static void main(String[] args) {
        // create methods used to check password

        //Create a scanner object
        Scanner input = new Scanner (System.in);
        
        //Prompt user to enter their new password
        System.out.print("Please enter your new password. \n (Password must have "
                 + "at least 8 characters, contain both letters and digits,\n"
                 + "and must have at least 1 uppercase character and 1 lowercase "
                 + "character):");
        
        String password = input.nextLine();
        
        //Check password to see if it meets all requirements
        String isValid = checkPassword(password);
        //Actually print what value is returned from the function
        System.out.println(isValid);
    }
            //charCount();
           
    static public String checkPassword(String password) {
        if (password.length() <= 7) {
            return("\nThe password you entered does not have the miniumum "
            + "of 8 required characters.  Please try again.");
            
        }

        if(!password.matches(".*[0-9].*")){
           // does not contain a number
                return("\nInvalid: The password you entered does "
                            + "not have a number.  Please try again.");
        }   
        
        
        if (!password.matches(".*[A-Z].*")) {
            //does not contain a letter
                return("\nInvalid: The password you entered does "
                            + "not have an upper case letter.  Please try again.");
        } 
        
        if (!password.matches(".*[a-z].*")) {
            //does not contain a letter
                return("\nInvalid: The password you entered does "
                            + "not have a lowercase letter.  Please try again.");
        } 
    return"Password meets validation requirments.";
    }
    
       
}
    
