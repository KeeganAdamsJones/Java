package domesticdivision;

import division.Division;


/* A subclass of Division named DomesticDivision including a field for the state 
    in which the division is located and a constructor that requires all fields 
    when created.*/
public class DomesticDivision extends Division {

    
    String state = " ";
    
    public DomesticDivision (String companyDivisionName, String accountNumber, String state) {
        //super to inherit from the Division class 
        super(companyDivisionName, accountNumber);
        this.state = state;
    }
    
    /*use the @Override to override and reuse the empty method declared in the 
      abstract class */
    @Override
    public void printFields() {
        printDivisionFields();
        System.out.println("\tState: " + state);
    }    
}
