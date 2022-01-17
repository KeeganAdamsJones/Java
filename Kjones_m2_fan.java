/*
Keegan Jones
Java CSD 405
M2 Assignment - UseFans class
3/20/2021

Assignment:

1   Starting with your code from Module 1 (Kjones_m1_fan.java)create the following 
    new class titled UseFans:
2   Create a collection of Fan instances.
3   Create a method taking a collection of Fan instances for displaying without 
    using the toString() method.
4   Create a method that takes a single instance of a Fan for displaying without 
    using the toString() method.
5   Use the this reference throughout the Fan class where allowed.
6   Write test code that creates a collection of Fans and displays the functionality 
    of all of the Fan instances in the collection.

 */
package kjones_m2_fan;

import java.util.*;

/**
 *
 * @author keega
 */
public class Kjones_m2_fan {

    //class called Fan
    public static class Fan {
    
        //private data field that shows fan is off with setter and getter
        private boolean on; //private = restricted access
        // Getter
        public boolean getOn() {
            return on;
        }
        // Setter
        public void setOn(boolean newOn) {
            this.on = newOn;
        }

        //private data field that defaults to speed is 0, or stopped with setter and getter
        private int speed = 0; //private = restricted access
        // Getter
        public int getSpeed() {
            return speed;
        }
        // Setter
        public void setSpeed(int newSpeed) {
            this.speed = newSpeed;
        }

        // private data field that sets default radius to 6.0 with getter
        private double radius = 6.0; //private = restricted access
        // Getter
        public double getRadius() {
            return radius;
        }

        // data field that sets fan to default color of white with getter
        String colorOfFan = "white"; 
        // Getter
        String getColorOfFan() {
            return colorOfFan;
        }




        //declare four constants and their values
        final static int STOPPED = 0;

        final static int SLOW = 1;

        final static int MEDIUM = 2;

        final static int FAST = 3;

        //constructor that takes no arguments and sets fields to default values
        public Fan(){
        }

        //constructor that takes arguments and setting values
        public Fan(boolean on, int speed, double radius, String colorOfFan) {
            on = on;
            speed = speed;
            radius = radius;
            colorOfFan = colorOfFan;
        }


        //method with a .tostring to return descriptions of the Fans' states
        public String toString(){
        return "\nYour fan speed is set to "+speed+".\nThe fan is turned on(true/false):"
                + ""+" "+on+".\nThe radius of your fan is "+radius+" inches.\nThe color of your "
                + "fan is "+colorOfFan+"."; 
        }  
    

    
    }
    
    //method to print one fan
    static void print_fan(Fan input_fan)
    {
        System.out.println(input_fan);
    }
    
    //method to print all fans
    static void print_all_fans(UseFans list_of_fans)
    {
        list_of_fans.print();
    }
    
    // main method
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.getColorOfFan();
        fan1.getRadius();
        
        System.out.println("\n\nFan #1:");
        print_fan(fan1);//compiler writes here fan1.toString()        
        
        
        Fan fan2 = new Fan();
        fan2.setOn(true);
        fan2.setSpeed(Fan.FAST);
        fan2.getColorOfFan();
        fan2.getRadius();
        
        System.out.println("\n\nFan #2:");
        print_fan(fan2);//compiler writes here fan2.toString()  

        Fan fan3 = new Fan();
        fan3.setOn(false);
        fan3.setSpeed(Fan.STOPPED);
        fan3.getColorOfFan();
        fan3.getRadius();
        
        System.out.println("\n\nFan #3:");
        print_fan(fan3);//compiler writes here fan2.toString()  
        
        
        fan1.setOn(false);
        fan1.setSpeed(Fan.STOPPED);
        fan1.getColorOfFan();
        fan1.getRadius();
        
        System.out.println("\n\nFan #1:");
        print_fan(fan1);//compiler writes here fan1.toString()        
        
        
        
        fan2.setOn(false);
        fan2.setSpeed(Fan.STOPPED);
        fan2.getColorOfFan();
        fan2.getRadius();
        
        System.out.println("\n\nFan #2:");
        System.out.println(fan2);//compiler writes here fan2.toString()  
        
        UseFans use_fans = new UseFans();
        use_fans.generate_fans();
        use_fans.print(0);
        print_all_fans(use_fans);
    }
        
    
    //create new class called UseFans
    public static class UseFans {
        
        //Create a collection of fans
        ArrayList fan_collection = new ArrayList<Fan>();
        
        //instantiate individual fans
        void generate_fans() {
            Fan fan1 = new Fan();
            fan1.setOn(true);
            fan1.setSpeed(Fan.MEDIUM);
            fan1.getColorOfFan();
            fan1.getRadius();
            
            Fan fan2 = new Fan();
            fan2.setOn(true);
            fan2.setSpeed(Fan.FAST);
            fan2.getColorOfFan();
            fan2.getRadius();
            
            Fan fan3 = new Fan();
            fan3.setOn(false);
            fan3.setSpeed(Fan.STOPPED);
            fan3.getColorOfFan();
            fan3.getRadius();
            
            
            //add new fans to the list
            fan_collection.add(fan1);
            fan_collection.add(fan2);
            fan_collection.add(fan3);
        }
        
        //method that prints out one fan
        void print(int i)
        {
            System.out.println("\n\nUse Fans.  Printing fan: " + i);
            if (i < fan_collection.size())
                System.out.println(fan_collection.get(i));
        }

        //method that prints out a list of fans
        void print() {
            System.out.println("\n\nUse Fans.  Printing all the fans:");
            for (int i = 0; i < fan_collection.size(); ++i)
                System.out.println(fan_collection.get(i));
        }
        
    }
}