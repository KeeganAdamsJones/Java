/*
Keegan Jones
Java CSD 405
M3 Assignment - Class Titled Integer
3/24/2021

Assignment:
**Create a class titled Integer.  Examples:
    AnnaInteger
    LarryInteger
    SueInteger
    Etc.
This class is to contain:
    **An int data field titled with your first name.
    **A constructor that takes and sets the initial value.
    **Getter and setter methods.
    *Non-Static methods titled isEven(), isOdd(), and isPrime() returning true or 
        false based on the variable’s value.
    *Static methods with signatures isEven(int), isOdd(int), and isPrime(int) with 
        the same basic logic as the previous methods with results based on the 
        parameter.
    *Static methods with signatures isEven( Integer), isOdd( Integer), and 
        isPrime( Integer) with the same basic logic as the previous methods with 
        results based on the parameter.
    *The methods equals(int) and equals( Integer) which returns true if int values 
        are equal and false if they are not.
    *Write test code that creates three instances, two with the same value, and 
        one with a different value.
    *Write test code that ensures all methods function correctly.
 */
package kjones_m3_classtitledinteger;

/**
 *
 * @author keega
 */
public class Kjones_m3_classTitledInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test code that creates three instances, two with the same value, and 
        //one with a different value.
        Keegan keegan1 = new Keegan(int 5);
        Keegan keegan2 = new Keegan(int 5);
        Keegan keegan3 = new Keegan(int 2);
        

        //test code that ensures all methods function correctly.
        
    }
    //Create a class titled Integer.  Examples:AnnaInteger, LarryInteger, SueInteger
    public static class KeeganInteger{
        //An int data field titled with your first name.
        //private data field that defaults to 0
        private int Keegan = 0; //private = restricted access
        
        // Getter
        public int getKeegan() {
            return Keegan;
        }
        
        // Setter
        public void setKeegan(int newKeegan) {
            this.Keegan = newKeegan;
        }
        
        //constructor that takes arguments and setting values
        public KeeganInteger(int 5) {
        Keegan = 5;
        
        }
        
        //Non-Static methods titled isEven(), isOdd(), and isPrime() returning true or 
        //false based on the variable’s value.
        public variableValue() {
            boolean isEven();
            boolean isOdd();
            boolean isPrime();
        }

        //Static methods with signatures isEven(int), isOdd(int), and isPrime(int) with 
        //the same basic logic as the previous methods with results based on the 
        //parameter.
        public static parameterValueInt() {
            boolean isEven(int);
            boolean isOdd(int);
            boolean isPrime(int);
        }

        //Static methods with signatures isEven( Integer), isOdd( Integer), and 
        //isPrime( Integer) with the same basic logic as the previous methods with 
        //results based on the parameter.
        public static parameterValueInteger() {
            boolean isEven( Integer);
            boolean isOdd( Integer);
            boolean isPrime( Integer);
        }

        //The method equals(int) which returns true if int values are equal and 
        //false if they are not.
        public static equalsInt() {
            System.out.print(keegan1.equals(keegan2)) 
        }
        
        //The method equals( Integer) which returns true if int values are equal and 
        //false if they are not.
        public static equalsInteger() {
            
        }
    }
    
}
