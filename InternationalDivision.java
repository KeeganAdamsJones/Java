package internationaldivision;

import division.Division;

/* A subclass of Division named InternationalDivision including a field for the country in which the 
    division is located, a field for the language spoken, and a constructor that 
    requires all fields when created.  */  
public class InternationalDivision extends Division {

    String country = " ";
    String language = " ";
    
    public InternationalDivision (String companyDivisionName, String accountNumber, String country, String language) {
         //super to inherit from the Division class
        super(companyDivisionName, accountNumber);
        this.country = country;
        this.language = language;        
    }
    
    /*use the @Override to override and reuse the empty method declared in the 
      abstract class */
    @Override
    public void printFields() {
        printDivisionFields();
        System.out.println("\tCountry: " + country);
        System.out.println("\tLanguage: " + language);
    }
}
