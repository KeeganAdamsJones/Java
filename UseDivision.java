package usedivision;

import domesticdivision.DomesticDivision;
import internationaldivision.InternationalDivision;
import division.Division;

/* A subclass of Division, InternationalDivision, and DomesticDivision that creates 
    two instances of each of these concrete classes (InternationalDivision and 
    DomesticDivision)(4 total instances).*/


public class UseDivision {

    
    public static void main(String[] args) {
        // Create and display two instances of the InternationalDivision class
        Division division1 = new InternationalDivision("Division One", "0001", "USA", "English");
        System.out.println("\nInternational Division Details: ");
        division1.printFields();
        
        Division division2 = new InternationalDivision("Division Two", "0002", "France", "French");
        System.out.println("\nInternational Division Details: ");
        division2.printFields();
        
        // Create and display two instances of the DomesticDivision class 
        Division division3 = new DomesticDivision("Division Three", "0003", "Missouri");
        System.out.println("\nDomestic Division Details: ");
        division3.printFields();
        
        Division division4 = new DomesticDivision("Division Four", "0004", "Montana");  
        System.out.println("\nDomestic Division Details: ");
        division4.printFields();
    }
}
