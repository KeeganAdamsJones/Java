
package kjones_m5_readfromfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*

Keegan Jones
CSD - 420 Advanced Java
Module 5 - read from file
6/9/2021

Assignment:

Write a test program that reads words from a text file and displays all 
non-duplicate words in ascending order and then in descending order.

The file is to be referenced in the program, not needing to be used as a command 
line reference.

The word file is to be titled collection_of_words.txt.

Write test code that ensures the code functions correctly.

*/
public class Kjones_m5_readFromFile {
    
    public static final String FILE_PATH = "./collection_of_words.txt";

    /**
     * @param args     
     * @throws java.io.IOException     
     */
    public static void main(String[] args) throws IOException {        
        // Read from file
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));            
            Set<String> set = new HashSet<>();
            
            // Loop through each line and add to HashSet 
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                set.add(inputLine);
            }            
            // Print set to see all the words from the text file
            System.out.println("\nWords read from text file:\n" + set);
            
            // Create treeSet and print it sorted in alphabetical order.
            TreeSet<String> treeSet = new TreeSet<>(set);
            System.out.println("\nSorted tree set:\n" + treeSet);

            // Use descendingSet() method to print the set printed in reverse-alphabetical order.
            TreeSet<String> revTreeSet = (TreeSet<String>)treeSet.descendingSet();
            System.out.println("\nTreeSet after sorting in descending order:\n" + revTreeSet);
        } 
        
        catch(IOException e) {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }
}
    

