/*
Keegan Jones
2/3/2021
Module 8 - Methods to Calculate Cost

Assignment:
Write a program with four methods for calculating the cost of a yearly auto service 
visit. The methods will be titled yearlyService.

yearlyService(no parameters) - Will return the standard service charge.

yearlyService(one parameter) - Will return the standard service charge with an 
added oil change fee.

yearlyService(two parameters) - Will return the standard service charge with an 
added oil change fee and a tire rotation charge.

yearlyService(three parameters) - Will return the standard service charge with an 
added oil change fee, a tire rotation charge, along with a coupon amount that 
will be deducted from the total cost.

Write a main method that will test each of these methods two times.
 */
package kjones_m8_method_calculate_cost2;

/**
 *
 * @author keega
 */
public class KJones_M8_Method_Calculate_Cost2 {

        static double yearlyService() {
            return 19.99;
            };

        static double yearlyService(double o) {
            return 19.99 + o;
        }   
        
        static double yearlyService(double o, double t) {
            return 19.99 + o + t;
        }
        
        static double yearlyService(double o, double t, double c) {
            return 19.99 + o + t - c;
        }
        
        public static void main(String[] args) {
            for (int i = 0; i < 2; ++i){
                double standardServiceCharge = yearlyService();
                double serviceAndOil = yearlyService(45.99);
                double serviceOilAndTire = yearlyService(45.99, 5.99);
                double serviceOilTireAndCoupon = yearlyService(45.99, 5.99, 9.99);
            
            System.out.println("The cost of the service is: " + standardServiceCharge);
            System.out.println("The cost of service and an oil change is: " + serviceAndOil);
            System.out.println("The cost of service, an oil change and a "
                    + "tire rotation is: " + serviceOilAndTire);
            System.out.println("The cost of service, an oil change and a tire "
                    + "rotation with a coupon is: " + serviceOilTireAndCoupon);
            }
        }
}


