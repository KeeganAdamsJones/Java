package kjones_m9_lambdaexample;

import java.util.ArrayList;

/*  Keegan Jones
    CSD 405 - Intermediate Java
    Module 9 - Lamda Expressions
    4/27/2021
*/

public class Kjones_m9_lambdaExample {

    
    public static void main(String[] args) {
        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<String> family = new ArrayList<String>();
        family.add("Keegan");
        family.add("Jody");
        family.add("Nellie");
        family.add("Olivia");
        family.add("Afton");
          
        // Using lambda expression to print all elements of family arrlist
        System.out.println("Family printed via Lambda expression: ");
        family.forEach(i -> System.out.println(i));
  
        // Using lambda expression to print all elements but Keegan from arrlist family
        System.out.println("\nFamily printed via Lambda expression, excluding Keegan: ");
        family.forEach(i -> { if (i != "Keegan") System.out.println(i); });
        
        //using for loop in java to print all elements of family arrlist
	System.out.println("\nFamily printed via Java: ");
        for (int i = 0; i < family.size();i++) { 		      
	    System.out.println(family.get(i)); 		
        }   
        
        //using for loop in java to print all elements of family arrlist except Keegan 
	System.out.println("\nFamily printed via Java, excluding Keegan: ");
        for (int i = 0; i < family.size();i++) { 		      
	    if (family.get(i) != "Keegan") 
                System.out.println(family.get(i)); 
            
        }   
    }
    
}
