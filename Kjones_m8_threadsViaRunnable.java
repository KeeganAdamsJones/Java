
package kjones_m8_threadsviarunnable;

import java.util.Random;

/*
    Keegan Jones
    CSD - 420 Advanced Java
    Module 8 - threads 
    6/23/2021

    Assignment:
    * Create a class titled <your first name here> ThreeThreads.
    * In this class, you are to use three threads to output three types of characters 
        to a text area for display.
    * In the first thread, you are to output random letter characters such as a, b, c, d …
    * In the second thread, you are to output random number digits such as 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    * In the third thread, you are to output random characters such as !, @, #, $, %, &, *
    * Display a minimum of 10,000 of each of the three sets.
    * Write test code that ensures all methods function correctly.
 */

public class Kjones_m8_threadsViaRunnable {

    
    
    public static void main(String[] args) throws InterruptedException {
        // Create 3 runnables 
        Kjones_ThreeThreads runnable1 = new Kjones_ThreeThreads();
        Kjones_ThreeThreads runnable2 = new Kjones_ThreeThreads();
        Kjones_ThreeThreads runnable3 = new Kjones_ThreeThreads();
        
        // Create 3 threads
        Thread thread_randomLetters = new Thread(runnable1);
        Thread thread_randomNumbers = new Thread(runnable2);
        Thread thread_randomCharacters = new Thread(runnable3);
        
        // Set the names
        thread_randomLetters.setName("Thread 1: Random Letters");
        thread_randomNumbers.setName("Thread 2: Random Numbers");
        thread_randomCharacters.setName("Thread 3: Random Characters");
        
        // Invoke the starts
        thread_randomLetters.start();
        thread_randomNumbers.start();
        thread_randomCharacters.start();
        //try {
        //    Thread.sleep(2000);
        //}
        //catch(InterruptedException e) {
            //ignore
        //}
            
        System.out.println("Main method has completed running.");
    }
    
}

class Kjones_ThreeThreads implements Runnable {
    
    @Override
    public void run() {
        
        Random rand = new Random();
        
        // We need the current thread name to determine what function to run:
        final String threadName = Thread.currentThread().getName();

        if (threadName.equals("Thread 2: Random Numbers")) {
            for (int i = 0; i < 10000; i++) {
            
                System.out.println(threadName 
                + "loop number is " + rand.nextInt((10) + 1));
            }            
        } 
        
        else if (threadName.equals("Thread 1: Random Letters")) {
            for (int i = 0; i < 10000; i++) {
                /* Using ascii table to generate random letters. "'a' + " will 
                cause the random int to be related to the hex value on the ascii, 
                so this will start with a and go 26 places from there on the table. */
                char c = (char) ('a' + rand.nextInt(26));
                System.out.println(threadName + "loop letter is " + c);
            }
        }
        else if (threadName.equals("Thread 3: Random Characters")) {
            for (int i = 0; i < 10000; i++) {
                /* Using ascii table to generate random letters. "'!' + " will 
                cause the random int to be related to the hex value on the ascii, 
                so this will start with ! and go 31 places from there on the table. */
                char c = (char) ('!' + rand.nextInt(14));
                System.out.println(threadName + "loop special character is " + c);
            }
        }
        //else {
        //    System.out.println(threadName + "- ERROR " );
    //}
        
        //System.gc();
        
        System.out.println(threadName + " has completed running.");
    }
}