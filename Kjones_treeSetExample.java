
package kjones_treesetexample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
    Keegan Jones


    treeSet example code
 */
public class Kjones_treeSetExample {

    
    public static void main(String[] args) {
        // Create a hashSet
        Set<String> set = new HashSet<>();
        
        // Add strings to the set.
        set.add("Keegan");
        set.add("Nellie");
        set.add("Olivia");
        set.add("Afton");
        
        // Create treeSet and print it sorted in alphabetical order.
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted tree set:\n" + treeSet);
        
        // Use descendingSet() method to print the set printed in reverse-alphabetical order.
        TreeSet<String> revTreeSet = (TreeSet<String>)treeSet.descendingSet();
        System.out.println("\nTreeSet after sorting in descending order:\n" + revTreeSet);
                
    }
    
}
