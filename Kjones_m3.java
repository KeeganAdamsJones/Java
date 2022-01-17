
package kjones_m3;

import java.util.ArrayList;
import java.lang.Math;

/*

Keegan Jones
CSD - 420 Advanced Java
Module 3 
5/31/2021

Write a test program that contains a static method that returns a new ArrayList.

The new ArrayList returned will contain all original values with no duplicates 
from the original ArrayList.

Fill the Original ArrrayList with 50 random values from 1 to 20.

public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)

Write test code that ensures the code functions correctly.

*/

public class Kjones_m3 {

    // method that will create new list that consists of original array list without the duplicates
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        //create new list
        var newList = new ArrayList<E>();
        for (int i = 0; i < list.size(); i++) {
            
            if(!newList.contains(list.get(i))) {
                newList.add(list.get(i));
            }
        }
        System.out.println(newList);
        return newList;
    }
          
        /* This is the though process that I started with, replaced by ".contains"
        for (int i = 0; i < list.size(); i++) {
            loop through each element again comparing each to whatever value is list[i]
            for (int k = i + 1; k < list.size(); k++) {
                 compare value of list[i] to value of list[k]
                if (list.get(i) == list.get(k)) {             
                    list.remove(k);
        */
        
            
            
    public static void main(String[] args) {
        
        // create original array list
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        
        // using do while loop 
        // preseed original array list with 50 random values
        do {
            double r = Math.random() * 20;
            list.add((int) r);  
        // used the following println to test whether my list had populated with doubles (one single double at a time)
        //  System.out.println(r);
            i++;
        } 
            while(i < 50);
        
        // this print line prints the whole data structure (the list) at a time so i can see original array list
        System.out.println(list);
        
        //call the method, to return new list that consists of original list, with all duplicates removed
        removeDuplicates(list);
        
    }
    
}
