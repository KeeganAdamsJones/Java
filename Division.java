package division;

/*
Keegan Jones
Abstract Classes
4/12/2021

** Create an abstract Division class with fields for a company's division name and 
    account number, and an abstract display() method that will be defined in the subclasses.
** Use a constructor in the superclass that requires values for both fields.
** Create two subclasses named InternationalDivision and DomesticDivision.
** The InternationalDivision class includes a field for the country in which the 
    division is located, a field for the language spoken, and a constructor that 
    requires all fields when created.
** The DomesticDivision class includes a field for the state in which the division 
    is located and a constructor that requires all fields when created.
** Write an application named UseDivision that creates two instances of each of 
    these concrete classes (4 total instances).
** Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.

*/


/* Create an abstract Division class with fields for a company's division name 
    and account number, and an abstract display() method that will be defined in 
    the subclasses.*/
public abstract class Division {
    protected String companyDivisionName = " ";
    protected String accountNumber = " ";
    //private display();  
    
    //public Division() {}
    
    //A constructor in the superclass that requires values for both fields.
    public Division(String companyDivisionName, String accountNumber) {
        this.companyDivisionName = companyDivisionName;
        this.accountNumber = accountNumber;
    }
    
    public void printDivisionFields() {
        System.out.println("\tCompany Division Name: " + companyDivisionName);
        System.out.println("\tAccount Number: " + accountNumber);        
    }
    
    public abstract void printFields();
}
