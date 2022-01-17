
package kjones_m2_recursion;

/*
Keegan Jones
recursion 
5/27/2021

Problem:

* Create a program using a recursive method that returns the sum of the following type inputs.
    m(i) = 1/2 + 2/3 + 3/4 + 4/5 + 5/6 … i/(i + 1)
    ‘m’ is to be replaced with the method name you use.
* Use three different input finishing values, testing your code to ensure it functions correctly.
    Examples: m(4), m(9), m(14).
*/

public class Kjones_m2_recursion {
    
    public static void main(String[] args) {
        System.out.println(sumMethod(4));
        System.out.println(sumMethod(9));
        System.out.println(sumMethod(14));
    }    
    
    public static double sumMethod(int i) {
        if (i == 1)
            return 1.0 / 2;
        else
            return sumMethod(i - 1) + i * 1.0 / (i + 1);   
    }   
}
