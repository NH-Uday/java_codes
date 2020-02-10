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
 public class Account {
 //properties
 private String accName;
 private String acId;
 private double balance;
 Transition [] listOfTransaction;
 int totalNumberOfTransaction =1000;
    
 //constructor
 public Account(){
     
 }
 public Account(String name,String acno,double amount){
     this.accName = name;
     this.acId = acno;
     this.balance = amount;
     this.listOfTransaction=new Transition[totalNumberOfTransaction];
 }
    
    
    //methods
 public void ShowInfo_1(){
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
     void addTransaction(Account sender, Account receiver, int amount){
         
         Transition t1 = new Transition(sender,receiver,1000," ");
         
         for(int i = 0;i<=this.listOfTransaction.length;i++){
             if(i == this.listOfTransaction.length){
                System.out.println("Messege: List of transition is full"+
                                    "Transition couldn't be saved"); 
                break;
             }
             else{
                 if(this.listOfTransaction[i] == null){
                     this.listOfTransaction[i] = t1;
                     System.out.println("Messege: Transition Added Successfully in "+(i+1));
                     break;
                 }
             }
         }
     } 
 
     void showAllTranscation(){
         
         System.out.println("List of Transition : "+this.listOfTransaction );
         for(int i = 0;i <this.listOfTransaction.length;i++){
             
             //if(this.listOfTransaction[i] == null){
                 System.out.println((i+1));
                 this.listOfTransaction[i].showInfo();
             
         }
     }    
}
