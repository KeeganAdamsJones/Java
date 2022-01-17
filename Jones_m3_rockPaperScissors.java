/*
Keegan Jones
1/18/2021
Module 3 - Rock Paper Scissors

Assignment:

Write a program that is similar to the popular game titled “Rock-Paper-Scissors.”
The program randomly generates the number of 1, 2, or 3 with 1 being Rock, 2 
being Paper, and 3 being Scissors. Then, the program is to prompt the user to 
enter a value of 1, 2, or 3. Next, the program displays a clear readable message 
displaying both the computer’s selection, the user’s selection, and the results.
 */

package jones_m3_rockpaperscissors;

/**
 *
 * @author keega
 */
import java.util.Scanner; //import scanner to recieve input

public class Jones_m3_rockPaperScissors {

    public static void main(String[] args) {
    
        //Greet player
        System.out.println("\n\nHello, Welcome to Rock, Paper, Scissors!\n");
        
        // Prompt the user to enter 1 for rock, 2 for paper, or 3 for scissors       
        while (true){
            // Generate random single digit integer
            int number = (int)(Math.random() * 4);
        
        System.out.print
        ("Please enter your selection: 1 for rock, 2 for paper or 3 for "
                    + "scissors.  If you no longer wish to play select 0.\n\n");
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        
        //display the number and selection and the resulting winner
        if (number == 1 && selection == 1)
            System.out.println("You both chose rock, you have a tie!\n\n");
            else if (number == 1 && selection == 2)
                System.out.println("The computer chose rock and you chose paper.\n"
                        + "Paper covers rock, you win!\n\n");
            else if (number == 1 && selection == 3)
                System.out.println("The computer chose rock and you chose scissors.\n"
                        + "Rock crushes scissors, you lose.\n\n");
            else if (number == 2 && selection == 1)
                System.out.println("The computer chose paper and you chose rock.\n"
                        + "Paper covers rock, you lose.\n\n");
            else if (number == 2 && selection == 2)
                System.out.println("You both chose paper, you have a tie!\n");
            else if (number == 2 && selection == 3)
                System.out.println("The computer chose paper and your chose scissors.\n"
                        + "Scissors cuts paper, you win!\n\n");
            else if (number == 3 && selection == 1)
                System.out.println("The computer chose scissors and you chose rock.\n"
                        + "Rock crushes scissors, you win!\n\n");
            else if (number == 3 && selection == 2)
                System.out.println("The computer chose scissors and you chose paper.\n"
                        + "Scissors cut paper, you lose.\n\n");
            else if (number == 3 && selection == 3)
                System.out.println("You both chose scissors, you have a tie!\n"); 
            else if (selection == 0){
                System.out.println("Thank you for playing! Goodbye.");
                break;
            }
                                         
                       
        }
        
    }
    
}
