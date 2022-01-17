/*
Keegan Jones
1/24/2021
Module 5 - While Loop, Math Operation 

Write a program that uses a while loop to display the following math operations 
both in the smaller to larger order and then the larger to smaller order with 
the denominator being 3 through 99.

1/3 + 1/5 + 1/7 + ··· + 1/95 + 1/97 + 1/99

1/99 + 1/97 + 1/95 + ··· + 1/7 + 1/5 + 1/3
 */

package kjones_m5_whileloop_mathoperation;


public class Kjones_m5_whileLoop_mathOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       int i = 1;
       double sum = 0;
       
        while (i < 98 && i > 0) {
            i = i + 2;
            sum = sum + 1.0/i;
                System.out.print("1/" + i + " +");
               
       }
        System.out.println("= " + sum + "\n\n");
        i = 101;
      
   
       {
        while (i < 102 && i > 4) {
            i = i - 2;
            sum = sum + 1.0/i;
                System.out.print("1/" + i + " +");
        }
       } 
         System.out.println("= " + sum);   
        
        }  
        
    }

    
    

