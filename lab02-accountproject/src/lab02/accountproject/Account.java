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
 public class Account {
 //properties
 private String accName;
 private String acId;
 private double balance;
    
    //constructor
 public Account(){
     
 }
 public Account(String name,String acno,double amount){
     this.accName = name;
     this.acId = acno;
     this.balance = amount;
 }
    
    
    //methods
 public void ShowInfo(){
     System.out.println("\nAccount Information: ");
     System.out.println("A/C Name : "+this.accName);
     System.out.println("A/C No : "+this.acId);
     System.out.println("Balance : "+this.balance);
 }   

public void Deposit(int amount){
        
        this.balance += amount;
        Showmessage("Deposited : " + amount + " to A/C No. " + this.acId);
     }
     
     public void Withdraw(int amount){
        
         this.balance -= amount;
         Showmessage("Withdrawed : " + amount + " to A/C No. " + this.acId);
     }
     public void Showmessage(String mesg){
         System.out.println(mesg);
     }
     public void Transfer(int amount,Account sender,Account receiver){
         
         sender.balance -= amount;
         receiver.balance += amount;
         Showmessage("\nTransfer: " + amount 
                 + " Transfer to A/C No. " 
                 + receiver.acId + " from A/C No. " + sender.acId );
         
     }
    
}
