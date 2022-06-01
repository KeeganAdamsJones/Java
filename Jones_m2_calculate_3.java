/*
Keegan Jones
1/11/2021
Calculate Energy
 */
package jones_m2_calculate_3;

/**
* Write a program that calculates the energy needed to heat water from an initial 
* temperature to a final temperature. Your program should prompt the user to 
* enter the amount of water in kilograms and the initial and final temperature 
* of the water.
* The formula to use for this program is:

1.  Q = waterMass ( finalTemperature – initialTemperature ) x 4184
2.  waterMass is water weight in kilograms
3.  finalTemperature and initialTemperature are temperatures in Celsius
4.  Q is the results in Joules
 */

import java.util.Scanner; //Scanner is in the java.util package

public class Jones_m2_calculate_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner object
        Scanner input = new Scanner (System.in);
        
        //Prompt user to input the amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms.");
        double kilograms = input.nextDouble();
                
        //Prompt user to input the initial temperature of the water in celsius
        System.out.print("Enter the initial temperature of the water in Celsius.");
        double initial_temperature = input.nextDouble();
        
        //Prompt user to input the final temperature of the water in celsius
        System.out.print("Enter the final temperature you wish to reach in Celsius.");
        double final_temperature = input.nextDouble(); 
                
        //Compute Joules of energy required to heat the water
        double joules = kilograms * (final_temperature - initial_temperature) * 4184;
                
        //Display results
        System.out.println("You will require " + joules + " joules to heat your water.");
    }
    
}
