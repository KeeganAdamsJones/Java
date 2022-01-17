/*
/*
 Keegan Jones
2/23/2021
Module 11 - Methods and One-dimensional Arrays


Assignment:
Write methods, using the following headers, that returns the location of the largest 
element in the array, passed to the method returning a one-dimensional array, that 
contains two location elements.

    public static int [] locateLargest (double [][] arrayParam)
    public static int [] locateLargest (int [][] arrayParam)

Then, write methods using the following headers that returns the location of the 
smallest element in the array passed to the method returning a one-dimensional 
array that contains two location elements.

    public static int [] locateSmallest (double [][] arrayParam)
    public static int [] locateSmallest (int [][] arrayParam)
 */
package kjones_m11_methods_and_1dimensional_array;

/**
 *
 * @author keega
 */
public class Kjones_m11_methods_and_1dimensional_array {
    

    // method named locateLargest on decimal_table,
    // with a 2 dimensional array of decimal point numbers
    public static int [] locateLargest (double [][] decimal_table){
    
    // use int since this functions as an index of the location in the array
    int[] location = new int[2];
    
    // find the largest number in the decimal table
    double largest = decimal_table [0][0];
    for (int i = 0; i < decimal_table.length; i++)
      for (int j = 0; j < decimal_table[i].length; j++) {
        if (largest < decimal_table[i][j]) {
          largest = decimal_table[i][j];
          location[0] = i;
          location[1] = j;
        }
      }
    return location;
    }   
    //
    
    // method named locateLargest on int_table,
    // with a 2 dimentional array of integer type numbers
    public static int [] locateLargest (int [][] int_table){
            
    // use int since this functions as an index of the location in the array
    int[] location = new int[2];
    
    // find the largest number in the integer table
    int largest = int_table [0][0];
    for (int i = 0; i < int_table.length; i++)
      for (int j = 0; j < int_table[i].length; j++) {
        if (largest < int_table[i][j]) {
          largest = int_table[i][j];
          location[0] = i;
          location[1] = j;
        }
      }
    return location;
    }
    
    //
    
    // method named locateSmallest on decimal_table,
    // with a 2 dimensional array of decimal point numbers
    public static int [] locateSmallest (double [][] decimal_table){
        
    // use int since this functions as an index of the location in the array
    int[] location = new int[2];

    // find the smallest number in the decimal table
    double smallest = decimal_table [0][0];
    for (int i = 0; i < decimal_table.length; i++)
      for (int j = 0; j < decimal_table[i].length; j++) {
        if (smallest > decimal_table[i][j]) {
          smallest = decimal_table[i][j];
          location[0] = i;
          location[1] = j;
        }
      }  
    return location;
    }
    //
    
    // method named locateSmallest on int_table,
    // with a 2 dimentional array of integer type numbers
    public static int [] locateSmallest (int [][] int_table){
    
    // use int since this functions as an index of the location in the array
    int[] location = new int[2];
    
    // find the smallest number in the integer table
    int smallest = int_table [0][0];
    for (int i = 0; i < int_table.length; i++)
      for (int j = 0; j < int_table[i].length; j++) {
        if (smallest > int_table[i][j]) {
          smallest = int_table[i][j];
          location[0] = i;
          location[1] = j;
        }
      }        
    return location;
    }        
  ///////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    
        //create a two-dimentional empty array with 10 rows by 10 columns of double type numbers
        double[][] decimal_table = new double[10][10]; 
        //fill each spot in the two-dimentional array with a random double type number 
        for (int i = 0; i < decimal_table.length; ++i){
            for (int j = 0; j < decimal_table.length; ++j){
            decimal_table[i][j] = (double) (Math.random() * 100);
            }
        }
        //display the numbers that are randomly generated into the array
        System.out.print("\n\nThe numbers generated for your two dimentional, decimal-type table array are: ");
        System.out.println();
        for (int i = 0; i < decimal_table.length; ++i){
            for (int j = 0; j < decimal_table.length; ++j){
            System.out.print("[" + i + "," + j + "] = " + decimal_table[i][j] + " ");    
            }
        }    
         
        //create a two-dimentional empty array with 10 rows by 10 columns of integer type numbers
        int[][] int_table = new int[10][10]; 
        //fill each spot in the two-dimentional array with a random integer type number 
        for (int i = 0; i < int_table.length; ++i){
            for (int j = 0; j < int_table.length; ++j){
            int_table[i][j] = (int) (Math.random() * 100);
            }
        }
        //display the numbers that are randomly generated into the array
        System.out.print("\n\nThe numbers generated for your two dimentional, integer-type table array are: ");
        System.out.println();
        for (int i = 0; i < int_table.length; ++i){
            for (int j = 0; j < int_table.length; ++j){
            System.out.print("[" + i + "," + j + "] = " + int_table[i][j] + " ");    
            }
        }    
        
        // start calling methods //
        
        
        // call the method that is locateLargest(decimal_table) 
        int[] largest_decimal_location = locateLargest(decimal_table);
        // display the result of the method locateLargest
        System.out.printf("\n\nThe largest decimal-point number in your array is "
            + "located at: (" + largest_decimal_location[0] + ", " + largest_decimal_location[1] + ")");
      
        // call the method named locateLargest(int_table)
        int[] largest_int_location = locateLargest(int_table);
        // display the result of the method locateLargest
        System.out.print("\n\nThe largest non-decimal number in your array is "
            + "located at: (" + largest_int_location[0] + ", " + largest_int_location[1] + ")");  
        
        // call the method that is locateSmallest(decimal_table) 
        int[] smallest_decimal_location = locateSmallest(decimal_table);
        // display the result of the method locateSmallest
        System.out.print("\n\nThe smallest decimal-point number in your array is "
            + "located at: (" + smallest_decimal_location[0] + ", " + smallest_decimal_location[1] + ")");
        
        // call the method named locateSmallest(int_table)
        int[] smallest_int_location = locateSmallest(int_table);
        // display the result of the method locateSmallest
        System.out.print("\n\nThe smallest non-decimal number in your array is "
            + "located at: (" + smallest_int_location[0] + ", " + smallest_int_location[1] + ")");
       
    }
        
}    
    

