/*
Keegan Jones
Java CSD 405
M1 Assignment - Fan
3/15/2021

Assignment:

Write a program with a class titled Fan. This class is to contain:

1.  Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to 
    hold the values of 0, 1, 2, and 3 respectively.
2.  A private field named speed that holds one of the constant values with the 
    default being STOPPED.
3.  A private Boolean field titled "on" that specifies whether the fan is on or off.
4.  A private field named radius that holds the radius of the fan with a default 
    value of 6.
5.  A String field that holds the color, with the default being white.
6.  Setter and getter methods for all mutable fields.
7.  A no-argument constructor that sets all fields with a default value.
8.  A constructor taking arguments and setting values.
9.  Write a toString() method that returns a description of the Fans state.
10. Write test code that creates two instances of the Fan class, one using the 
    default constructor and the other using the argument constructor. Write code 
    that displays the functionality of the Fan class methods.


 */
package kjones_m1_fan;

/**
 *
 * @author keega
 */
public class Kjones_m1_fan {

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
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.getColorOfFan();
        fan1.getRadius();
        
        System.out.println("\n\nFan #1:");
        System.out.println(fan1);//compiler writes here fan1.toString()        
        
        
        Fan fan2 = new Fan();
        fan2.setOn(true);
        fan2.setSpeed(Fan.FAST);
        fan2.getColorOfFan();
        fan2.getRadius();
        
        System.out.println("\n\nFan #2:");
        System.out.println(fan2);//compiler writes here fan2.toString()  

        Fan fan3 = new Fan();
        fan3.setOn(false);
        fan3.setSpeed(Fan.STOPPED);
        fan3.getColorOfFan();
        fan3.getRadius();
        
        System.out.println("\n\nFan #3:");
        System.out.println(fan3);//compiler writes here fan2.toString()  
        
        
        fan1.setOn(false);
        fan1.setSpeed(Fan.STOPPED);
        fan1.getColorOfFan();
        fan1.getRadius();
        
        System.out.println("\n\nFan #1:");
        System.out.println(fan1);//compiler writes here fan1.toString()        
        
        
        
        fan2.setOn(false);
        fan2.setSpeed(Fan.STOPPED);
        fan2.getColorOfFan();
        fan2.getRadius();
        
        System.out.println("\n\nFan #2:");
        System.out.println(fan2);//compiler writes here fan2.toString()  
    }
    
}
