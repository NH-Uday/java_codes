/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

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
        Account a1 = new Account("Utsho","171.1.1.1.100",1000);
        Account a2 = new Account("Uday","171.1.1.1.101",10000);
        
        a1.ShowInfo_1();
        a2.ShowInfo_1();
        a2.addTransaction(a2,a1,1000);
        a2.showAllTranscation();
    }
    
}
