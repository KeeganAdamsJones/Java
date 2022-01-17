/*
 Keegan Jones
2/16/2021
Module 10 - Overloaded Methods and Arrays

Description:Write four overloaded methods that return the average of an array 
with the following headers:

public static short average(short [] array)
public static int average(int [] array)
public static long average(long [] array)
public static double average(double [] array)

Write a test program that invokes each of these methods and then displays the 
average value returned along with a display of the original array elements. 
Ensure the display is easy to read and understandable. Lastly, each array sent 
into the methods must be of different sizes to ensure the method code is 
correctly written.
 */
package kjones_m10_overloadedmethods_andarrays;



public class Kjones_m10_overloadedMethods_andArrays {

    
    public static short average(short[] shortArray) {
        System.out.print("\n\nThe short array displayed via my overloaded method is: ");
        for (short value : shortArray)
            System.out.print(value + " ");
        //find sum of all values in shortArray
        short total = 0;
        for (short value = 0; value < shortArray.length; value++)
            total += shortArray[value];
        //find average of all values in shortArray
        short average = (short)(total / shortArray.length);
        System.out.print("\n\nThe average of all the numbers in my array is " 
                    + average + " ");
        return average;
    }
    
    
    public static int average(int[] intArray) {
        System.out.print("\n\n\nThe integer array displayed via my overloaded method is: ");
        for (int value : intArray)
            System.out.print(value + " ");
        //find sum of all values in intArray
        int total = 0;
        for (int value = 0; value < intArray.length; value++)
            total += intArray[value];
        //find average of all values in intArray
        int average = (int)(total / intArray.length);
        System.out.print("\n\nThe average of all the numbers in my array is " 
                    + average + " ");
        return average;
    }
    
    public static long average(long[] longArray){
        System.out.print("\n\n\nThe long array displayed via my overloaded method is: ");
        for (long value : longArray)
            System.out.print(value + " ");
        //find sum of all values in longArray
        long total = 0;
        for (int value = 0; value < longArray.length; value++)
            total += (long) (longArray[value]);
        //find average of all values in longArray
        long average = (long)(total / longArray.length);
        System.out.print("\n\nThe average of all the numbers in my array is " 
                    + average + " ");
        return average;          
    }
    
    //overloaded method containing a array of doubles
    public static double average(double[] doubleArray){
        System.out.print("\n\n\nThe double array displayed via my overloaded method is: ");
        for (double value : doubleArray)
            System.out.print(value + " ");
        //find sum of all values in doubleArray
        double total = 0;
        for (int index = 0; index < doubleArray.length; index++)
            total += doubleArray[index];
        //find average of all values in doubleArray
        double average = (double)(total / doubleArray.length);
        System.out.print("\n\nThe average of all the numbers in my array is " 
                + average + " ");
        return average;
    }
    
    public static void main(String[] args) {
        short[] shortArray = {10,20,30,40,50};
        int[] intArray = {10,20,30,40,50,60,70,80,90,100};
        long[] longArray = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
        double[] doubleArray = {10.5,20.5,30.5};
    
    //call the functions
    average(shortArray);
    average(intArray);
    average(longArray);
    average (doubleArray);
    }
}
