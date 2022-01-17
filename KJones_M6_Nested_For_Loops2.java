/*
 Keegan Jones
1/31/2021
Module 6 - Nested For Loops

Write a program that uses nested for loops to output the following with the 
shown display format:

                                                                                              @

                                 1 2 1             @

                               1 2 4 2 1           @

                             1 2 4 8 4 2 1         @

                          1 2 4 8 16 8 4 2 1       @

                       1 2 4 8 16 32 16 8 4 2 1    @

                    1 2 4 8 16 32 64 32 16 8 4 2 1 @
 */
package KJones_M6_Nested_For_Loops;

/**
 *
 * @author keega
 */
public class KJones_M6_Nested_For_Loops2 {

    /**
     * @param args the command line arguments
     */
    public static void Main(String[] args) {
        //initialize variables
        int row;
        int column;
        int space;
        
      
        int stopping_point = 1;
        //outer loop to print a line
        for(row = 1; row <= 6; ++row){
            //System.out.print(" " + row);
            
            // Double the stopping point (e.g. 1, 2, 4, 8, etc.)
            stopping_point *= 2;
            
            //first inner loop to print set of spaces
            for(space = 0;space < 8 - row; ++space){
                System.out.print("  ");
            }
            
            //second inner loop to print first set of numbers
            
            for(column = 1; column < stopping_point; column = (column * 2)){
              
                System.out.print(column + " ");
            }
            // third inner loop to print second set of numbers
            for(column = stopping_point; column >= 1; column = (column / 2))
            {
                System.out.print(column + " ");
            }
            
            // forth inner loop to print second set of spaces                   
            
            for(space = 0;space < 8 - row; ++space){
                System.out.print(" ");
                }
            System.out.print(" @");
            System.out.println();
            
        }
    }
}    
        
        
        
        
        

