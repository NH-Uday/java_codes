/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02.accountproject;

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
        //Showing Accounts for Account class
        Account a1 = new Account("k Nur","171.1.1.1.100",1000);
        Account a2 = new Account("Uday","171.1.1.1.101",10000);
        a1.ShowInfo();
        a1.Withdraw(500);
        a1.ShowInfo();
        a2.ShowInfo();
        a2.Deposit(1000);
        a2.ShowInfo();
        //Transfer balance
        a1.Transfer(100,a1, a2);
        //AC Update
        a1.ShowInfo();
        //Transfer balance
        a2.Transfer(500,a2, a1);
        //AC Update
        a2.ShowInfo();
    }
    
}
