/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounttype;

/**
 *
 * @author User
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer c1 = new Customer("Uday","Bosundhara","3001",1000.00);
        Customer c2 = new Customer("Arnob","Banani","3002",3000.00);
        
        Account a1 = new Account("pending");
        Account a2 = new Account("pending");
        
        SavingsAC s1 = new SavingsAC(a1,c1);
        LoanAC l1 = new LoanAC(a2,c2);
        
        a1.addNewcustomer(c1);
        a2.addNewcustomer(c2);
        a1.showAllcustomer();
        s1.printAccInfo();
        a2.showAllcustomer();
        l1.printAccInfo();
    }
    
}
