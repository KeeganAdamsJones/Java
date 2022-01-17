
package kjones_m4_traverselist;

import java.util.LinkedList;
import java.util.ListIterator;

/*
Keegan Jones
CSD - 420 Advanced Java
Module 4 - Linked List - traverse via iterator and get(index)
6/7/2021

Assignment:
Write a test program that stores 50,000 integers in LinkedList and test the time 
to traverse the list using an iterator vs. using the get(index) method.

Then, test your program storing 500,000 integers.

After completing this program and having tested both values, in your comments, 
explain the results and discuss the time taken using both values and their difference 
with the get(index) approach.

Write test code that ensures the code functions correctly.
________________________________________________________________________________
*******************************************************************************

***** After testing both values in this program, I found that:            *****

A value of 50,000 via an iterator took 2 seconds to traverse.
A value of 50,000 via the get(index) method took 2 seconds to traverse.
A value of 500,000 via an iterator took 28 seconds to traverse.
A value of 500,000 via the get(index) method took 6 minutes, 0 seconds to traverse.

It is evident that if you are dealing with small amounts of data, or a short list,
it really does not matter whether you traverse a Linkedlist via an iterator or 
via a .get(index) method.  However, if you may need to traverse a larger amount of 
data, or a longer list, when using Linkedlist, it does make a considerable difference
whether you use an iterator or the .get(index) method.  In a Linkedlist it is much
more efficient to use an iterator than it is to use the .get(index) method.

*******************************************************************************
*/

public class Kjones_m4_traverseList {

    
    
    public static void main(String[] args) {
        //create LinkedList object
        LinkedList<Integer> myBigList
            = new LinkedList<Integer>();
        
        // iterate through to create list and print
        double i = 0;
        
        do {
            myBigList.add((int) i);  
            i++;
        } 
        
        while(i < 500000);
        
        System.out.println("This is a very big list:\n\t");
        System.out.println(myBigList);
   
        // iterate through list and print
        System.out.println("\n\nMy very big list printed again via iteration:\n\t");
        myBigList.forEach(val -> {
            System.out.println(val);
        }); 
      
        // index into list method and print
        System.out.println("\n\nMy very big list printed again via .get(index):\n\t");
        for (int j = 0; j < myBigList.size(); j++) {
            System.out.println(myBigList.get(j));
        }
       
    }
}

