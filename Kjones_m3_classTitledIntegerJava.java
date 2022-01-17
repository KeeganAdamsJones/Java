




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
package kjones_m3_classtitledinteger.java;


public class Kjones_m3_classTitledIntegerJava {

    public static void main(String[] args) {
        //test code that creates three instances, two with the same value, and 
        //one with a different value.
        KeeganIntegerClass keegan1 = new KeeganIntegerClass(5);
        KeeganIntegerClass keegan2 = new KeeganIntegerClass(5);
        KeeganIntegerClass keegan3 = new KeeganIntegerClass(2);
        

        //test code that ensures all methods function correctly.
        //keegan1.isEven();
        System.out.println("Keegan1 is even = " + keegan1.isEven() + ".");
        System.out.println("Keegan1 is odd = " + keegan1.isOdd() + ".");
        System.out.println("Keegan1 is prime = " + keegan1.isPrime() + ".");
        
        System.out.println("Keegan2 is even = " + keegan2.isEven() + ".");
        System.out.println("Keegan2 is odd = " + keegan2.isOdd() + ".");
        System.out.println("Keegan2 is prime = " + keegan2.isPrime() + ".");
        
        System.out.println("Keegan3 is even = " + keegan3.isEven() + ".");
        System.out.println("Keegan3 is odd = " + keegan3.isOdd() + ".");
        System.out.println("Keegan3 is prime = " + keegan3.isPrime() + ".");
        

        
        System.out.println("Keegan1 == 4? " + keegan1.equals(4)); //int
        
        // Setup the Integer object for use later
        Integer val = 5;
        
        // Test if the object equals the Integer value
        // TODO: print
        System.out.println("Keegan1 == (val)? " + keegan1.equals(val)); //Integer
        
        // Call the int version of the static functions
        // TODO: PRINT RESULTS
        System.out.println("KeeganIntegerClass(4) is even = " + KeeganIntegerClass.isEven(4));
        System.out.println("KeeganIntegerClass(4) is odd = " + KeeganIntegerClass.isOdd(4));
        System.out.println("KeeganIntegerClass(4) is prime = " + KeeganIntegerClass.isPrime(4));
        
        // Call the Integer version of the static functions
        // TODO: Print results
        System.out.println("KeeganIntegerClass(val) is even = " + KeeganIntegerClass.isEven(val));
        System.out.println("KeeganIntegerClass(val) is odd = " + KeeganIntegerClass.isOdd(val));
        System.out.println("KeeganIntegerClass(val) is prime = " + KeeganIntegerClass.isPrime(val));
        
    }
    //Create a class titled Integer.  Examples:AnnaInteger, LarryInteger, SueInteger
    public static class KeeganIntegerClass{
        //An int data field titled with your first name.
        //private data field that defaults to 0
        private int Keegan; //private = restricted access
        
        // Getter
        public int getKeegan() {
            return Keegan;
        }
        
        // Setter
        public void setKeegan(int newKeegan) {
            this.Keegan = newKeegan;
        }
        
        //constructor that takes arguments and setting values
        public KeeganIntegerClass(int number) {
            Keegan = number;    
        }
        
        //Non-Static methods titled isEven(), isOdd(), and isPrime() returning true or 
        //false based on the variable’s value.
        public void variableValue() {
            isEven();
            isOdd();
            isPrime();
        }
        
        public boolean isEven() {
            return Keegan % 2 == 0; 
        }
        
        public boolean isOdd() {
            return !isEven();
        }
        
        public boolean isPrime() {
            int temp;
            
            for (int i = 2; i < Keegan/2; i++) {
                temp = Keegan % i;
                if (temp == 0) {
                    return false;
                }
            }
            return true;
        }
        
        //Static methods with signatures isEven(int), isOdd(int), and isPrime(int) with 
        //the same basic logic as the previous methods with results based on the 
        //parameter.
        public static boolean isEven(int number){
            return number % 2 == 0;
        }
        public static boolean isOdd(int number) {
            return !isEven(number);            
        }
        
        public static boolean isPrime(int number){
            
            int temp;
            
            for (int i = 2; i < number/2; i++) {
                temp = number % i;
                if (temp == 0) {
                    return false;
                }
            }
            return true;
        }
        
        //Static methods with signatures isEven( Integer), isOdd( Integer), and 
        //isPrime( Integer) with the same basic logic as the previous methods with 
        //results based on the parameter.
        public static void parameterValueInteger(Integer value) {
            isEven( value );
            isOdd( value );
            isPrime( value );
        }
        //The method equals(int) which returns true if int values are equal and 
        //false if they are not.
        public boolean equals(int value) {
            //System.out.print(keegan1.equals(keegan2)) 
            
            return Keegan == value;
        }
        
        //The method equals( Integer) which returns true if int values are equal and 
        //false if they are not.
        public boolean equals(Integer value) {
            //System.out.print(keegan1.equals(keegan2)) 
            
            return Keegan == value;
        }
    }
    
}
